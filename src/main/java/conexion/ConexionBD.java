package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class ConexionBD {
    private static final String URL = "";
    private static final String USUARIO = "";
    private static final String PASSWORD = "";

    private ConexionBD() { }

    public static Connection obtenerConexion() throws SQLException {

        throw new SQLException("TODO: configurar e implementar ConexionBD.obtenerConexion()");
    }
}
