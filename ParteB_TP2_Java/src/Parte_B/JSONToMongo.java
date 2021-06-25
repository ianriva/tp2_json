package Parte_B;

import static ParteB_Config.Conexion.crearConexion;
import Parte_B.Model.PaisFromJSON.Country;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.net.URL;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Ismael
 */
public class JSONToMongo {

    public static void getJSON() {

        int mayor = 0;
        int contador = 0;
        ObjectMapper om = new ObjectMapper();

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
                        MongoClient mongoClient = crearConexion();

                        if (mongoClient != null) {
                            System.out.println("Conexion Exitosa");
                            MongoDatabase database = mongoClient.getDatabase("paises_db");
                            MongoCollection<Document> paises = database.getCollection("paises");

                            Document pais = new Document("_id", new ObjectId())
                                    .append("numericCode", listaPaises.get(j).getNumericCode())
                                    .append("callingCode", listaPaises.get(j).getCallingCodes().get(0))
                                    .append("nombrePais", listaPaises.get(j).getName())
                                    .append("capitalPais", listaPaises.get(j).getCapital())
                                    .append("region", listaPaises.get(j).getRegion())
                                    .append("latitud", listaPaises.get(j).getLatlng().get(0))
                                    .append("longitud", listaPaises.get(j).getLatlng().get(1))
                                    .append("poblacion", listaPaises.get(j).getPopulation()
                                    );

                            paises.insertOne(pais);
                            System.out.println("Nuevo Pais agregado");

                            //cierro la conexion
                            mongoClient.close();

                        } else {
                            System.out.println("Error: Conexión no establecida");
                        }

                        //Inserto El Pais A La DB Si No Existe
                    }
                }

            } catch (Exception e) {
                System.out.println("Not Found : https://restcountries.eu/rest/v2/callingcode/" + i);
            }

        }
        System.out.println("Mayor : " + mayor);
        System.out.println("Cantidad Paises : " + contador);
        System.out.println("Prueba conexión MongoDB");

    }
}
