package Parte_B;

import static ParteB_Config.Conexion.crearConexion;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;
import com.mongodb.client.model.Indexes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Ismael
 */
public class MongoConsultas {

    public static void consultas() {

        try (MongoClient mongoClient = crearConexion()) {
            MongoDatabase database = mongoClient.getDatabase("paises_db");
            MongoCollection<Document> paises = database.getCollection("paises");
            //muestro los documentos de la coleccion
            System.out.println("Documentos de la coleccion");
            FindIterable<Document> docs = paises.find();

            //Muestro Los Paises Que Son De Americas
            docs = paises.find(Filters.eq("region", "Americas"));
            System.out.println("PUNTO 5.1, PAISES DE REGION AMERICA");
            System.out.println("-----------------------------------------------------------------------------");

            for (Document doc : docs) {

                System.out.println(doc.get("nombrePais") + " - " + doc.get("region"));

            }
            System.out.println("------------------------------------------------------------------------------");

            //America y 100.000.000 habitantes
            System.out.println("PUNTO 5.2, PAISES DE AMERICA CON MAS DE 100.000.000 POBLACION");
            System.out.println("-----------------------------------------------------------------------------");
            docs = paises.find(Filters.and(Filters.eq("region", "Americas"),
                    Filters.gt("poblacion", 100000000)));
            for (Document doc : docs) {
                System.out.println(doc.get("nombrePais") + " - " + doc.get("region") + " - " + doc.get("poblacion"));

            }
            System.out.println("------------------------------------------------------------------------------");

            //Codifique un método que seleccione los documentos de la colección países donde la región sea
            //distinto de Africa.
            System.out.println("PUNTO 5.3, DISTINTO DE AFRICA");
            System.out.println("-----------------------------------------------------------------------------");
            docs = paises.find(Filters.ne("region", "Africa"));
            for (Document doc : docs) {
                System.out.println(doc.get("nombrePais") + " - " + doc.get("region"));

            }
            System.out.println("------------------------------------------------------------------------------");

            //Codifique un método que actualice el documento de la colección países donde el name sea Egypt,
            //cambiando el name a “Egipto” y la población a 95000000
            System.out.println("PUNTO 5.4, CAMBIO NOMBRE EGIPTO");
            System.out.println("-----------------------------------------------------------------------------");

            paises.findOneAndUpdate(Filters.eq("nombrePais", "Egypt"), new Document("$set", new Document("nombrePais", "Egipto").append("poblacion", 95000000)));
            docs = paises.find(Filters.eq("nombrePais", "Egipto"));
            for (Document doc : docs) {
                System.out.println(doc.get("nombrePais") + " - " + doc.get("poblacion"));

            }
            System.out.println("------------------------------------------------------------------------------");

            //Codifique un método que elimine el documento de la colección países donde el código del país sea
            //258
            System.out.println("PUNTO 5.5, ELIMINAR DOCUMENTO");
            System.out.println("-----------------------------------------------------------------------------");

            paises.findOneAndDelete(Filters.eq("codigoPais", 258));
            System.out.println("Documento Eliminado");
            System.out.println("------------------------------------------------------------------------------");

            //5.6, AL EJECUTAR EL METODO DROP() SOBRE UNA COLLECION ESTA SE ELIMINA ASI COMO SUCEDE EN SQL
            //Codifique un método que seleccione los documentos de la colección países cuya población sea
//mayor a 50000000 y menor a 150000000. Muestre el resultado por pantalla o consola.
            System.out.println("PUNTO 5.7, POBLACIO ENTRE 50M Y 150M");
            System.out.println("-----------------------------------------------------------------------------");

            docs = paises.find(Filters.and(Filters.gt("poblacion", 50000000), Filters.lt("poblacion", 150000000)));
            for (Document doc : docs) {
                System.out.println(doc.get("nombrePais") + " - " + doc.get("poblacion"));

            }
            System.out.println("------------------------------------------------------------------------------");

            //Codifique un método que seleccione los documentos de la colección países ordenados por nombre
//(name) en forma Ascendente. sort(). Muestre el resultado por pantalla o consola.
            System.out.println("PUNTO 5.8, PAISES ORDENADOS DE FORMA ASC");
            System.out.println("-----------------------------------------------------------------------------");

            docs = paises.find().sort(new BasicDBObject("nombrePais", 1));
            for (Document doc : docs) {
                System.out.println(doc.get("nombrePais"));

            }
            System.out.println("------------------------------------------------------------------------------");

            //. Describa que sucede al ejecutar el método skip() sobre una colección. Ejemplifique con la colección
            //países. Al aplicar skip se pueden saltar registros, por ej los primeros 10
            System.out.println("PUNTO 5.9, USO DE SKIP, SALTANDO 10 PAISES");
            System.out.println("-----------------------------------------------------------------------------");

            docs = paises.find().skip(10);
            for (Document doc : docs) {
                System.out.println(doc.get("nombrePais"));

            }
            System.out.println("------------------------------------------------------------------------------");

            //Describa y ejemplifique como el uso de expresiones regulares en Mongo puede reemplazar
            //el uso //de la cláusula LIKE de SQL.
            System.out.println("PUNTO 5.10, USO DE LIKE");
            System.out.println("-----------------------------------------------------------------------------");

            docs = paises.find(Filters.regex("capital", ".*era.*", "i"));
            for (Document doc : docs) {
                System.out.println(doc.get("capital"));

            }
            System.out.println("------------------------------------------------------------------------------");

            //Cree un nuevo índice para la colección países asignando el campo código como índice.
            //investigue createIndex())
            System.out.println("PUNTO 5.11, CREACION DE INDEX");
            System.out.println("-----------------------------------------------------------------------------");

            paises.createIndex(Indexes.ascending("codigoPais"));
            for (Document doc : docs) {
                System.out.println(doc.get("capital"));

            }
            System.out.println("------------------------------------------------------------------------------");

            //5.12
            //Describa como se realiza un backup de la base de datos mongo países_db.
            //Los backups en mongo se realizan con mongo dump
            //https://docs.mongodb.com/manual/tutorial/backup-and-restore-tools/
            //cierro la conexion
            mongoClient.close();
        } catch (Exception e) {

        }
    }
}
