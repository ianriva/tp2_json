package Parte_B;

import ParteB_Config.Conexion;

/**
 *
 * @author Ismael
 */
public class main {
    public static void main(String[] args) {
       JSONToMongo json = new JSONToMongo();
       MongoConsultas mongo = new MongoConsultas();
       //json.getJSON();
       mongo.consultas();
    }
}
