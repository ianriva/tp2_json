package Parte_A;

import Parte_A.DAO.PaisDAO;
import Parte_A.Model.Pais;
import Parte_A.Model.PaisFromJSON.Country;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URL;
import java.util.List;

/**
 *
 * @author Ismael
 */
public class JSONReading2 {

    public void getJSON() {
        int mayor = 0;
        int contador = 0;
        ObjectMapper om = new ObjectMapper();
        Pais pais = new Pais();
        PaisDAO dao = new PaisDAO();

        for (int i = 1; i < 301; i++) {

            try {
                //URL a Consultar
                String sURL = "https://restcountries.eu/rest/v2/callingcode/" + i;

                List<Country> listaPaises = om.readValue(new URL(sURL), new TypeReference<List<Country>>() {
                });

                if (listaPaises.size() >= mayor) {
                    mayor = listaPaises.size();
                }

                for (int j = 0; j < mayor; j++) {
                    if (listaPaises.get(j).getName() != null) {
                        System.out.println("----------------------------");
                        System.out.println("Nombre : " + listaPaises.get(j).getName());
                        System.out.println("----------------------------");

                        //Seteo De Datos
                        pais.setNumericCode(Integer.valueOf(listaPaises.get(j).getNumericCode()));
                        pais.setCallingCode(Integer.valueOf(listaPaises.get(j).getCallingCodes().get(0)));
                        pais.setNombre(listaPaises.get(j).getName());
                        pais.setCapital(listaPaises.get(j).getCapital());
                        pais.setRegion(listaPaises.get(j).getRegion());
                        pais.setPoblacion(listaPaises.get(j).getPopulation());
                        pais.setLatitud(listaPaises.get(j).getLatlng().get(0));
                        pais.setLongitud(listaPaises.get(j).getLatlng().get(1));
                        //Inserto El Pais A La DB Si No Existe
                        if (!dao.exist(Integer.valueOf(listaPaises.get(j).getNumericCode()))) {
                            dao.create(pais);
                            contador++;
                        }

                    }
                }

            } catch (Exception e) {
                System.out.println("Not Found : https://restcountries.eu/rest/v2/callingcode/" + i);
            }

        }
        System.out.println("Mayor : " + mayor);
        System.out.println("Cantidad Paises : " + contador);
    }
}
