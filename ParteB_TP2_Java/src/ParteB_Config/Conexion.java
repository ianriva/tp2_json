/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteB_Config;


import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismael
 */
public class Conexion {

    public static MongoClient crearConexion() {
        MongoClient mongo = null;
        try {
            MongoClientURI uri = new MongoClientURI("mongodb+srv://ismael:oBo3TzfhuMRz11m9@cluster0.fnr0a.mongodb.net/paises_db");
            mongo = new MongoClient(uri);
            Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
            mongoLogger.setLevel(Level.SEVERE);
            System.out.println("Conectado!");

        } catch (Exception e) {

        }

        return mongo;
    }
}
