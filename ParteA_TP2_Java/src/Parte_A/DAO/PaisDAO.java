package Parte_A.DAO;

import Parte_A.Config.Conexion;
import Parte_A.Model.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ismael
 */
public class PaisDAO extends Conexion {

    private final String SQL_INSERT = "INSERT INTO paises (numericCode, callingCode, nombrePais, capitalPais, region, poblacion, latitud, longitud) VALUES (?,?,?,?,?,?,?,?)";
    private final String SQL_FIND = "SELECT * FROM paises WHERE numericCode=?";

    public boolean create(Pais pais) {
        PreparedStatement ps = null;
        /*La interfaz PrepareStatement hereda de la interfaz Statement y puede almacenar
        de manera precompilada una sentencia SQL, por lo que es una opción más eficiente
        si es que necesitamos ejecutar una sentencia SQL en repetidas ocasiones, a su vez
        también podemos especificar parámetros a ejecutar en nuestro query.*/
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);

            ps.setInt(1, pais.getNumericCode());
            ps.setInt(2, pais.getCallingCode());
            ps.setString(3, pais.getNombre());
            ps.setString(4, pais.getCapital());
            ps.setString(5, pais.getRegion());
            ps.setLong(6, pais.getPoblacion());
            ps.setDouble(7, pais.getLatitud());
            ps.setDouble(8, pais.getLongitud());

            ps.executeUpdate();
            /*El método executeUpdate se utiliza para ejecutar sentencias DML (Data
            Manipulation Language) como son las sentencias insert, update y delete. También
            nos va a permitir ejecutar sentencias de tipo DDL (Data Definition Language) como
            son las sentencias create table, truncate table, entre otras. La función
            executeUpdate regresa un entero, indicando el número de registros afectados como
            resultado de ejecutar el query deseado.
             */

            System.out.println("Agregado Con Exito");

            return true;
        } catch (SQLException e) {
            System.out.println("Error al Crear : " + e);
            return false;

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
        }
    }

    public boolean exist(int numericCode) {

        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_FIND);
            ps.setInt(1, numericCode);
            rs = ps.executeQuery();

            while (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error al Buscar : " + e);

        } finally {
            Conexion.close(conn);
            Conexion.close(ps);
            Conexion.close(rs);

        }

        return false;
    }

}
