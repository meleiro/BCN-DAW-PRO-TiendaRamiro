package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class ConexionBD {
    private static final String URL = "jdbc:postgresql://localhost:5432/tienda_ramiro3";
    private static final String USUARIO = "tienda_ramiro_user";
    private static final String PASSWORD = "tobi1234";

    private ConexionBD() { }

    public static Connection obtenerConexion() throws SQLException {

        return DriverManager.getConnection(URL, USUARIO, PASSWORD);

    }
}
