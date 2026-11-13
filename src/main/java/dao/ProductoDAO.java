package dao;

import conexion.ConexionBD;
import modelo.Cliente;
import modelo.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO {

    public List<Producto> listar() throws SQLException {

        List<Cliente> resultado = new ArrayList<>();

        String sql = """
                SELECT id, nombre, email, activo
                FROM cliente
                ORDER BY id
                """;
        try( Connection con = ConexionBD.obtenerConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                resultado.add(new Cliente (
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email"),
                        rs.getBoolean("activo")
                ));
            }
        }

        return resultado;
    }

    public void insertar(Producto producto) throws SQLException {

        throw new SQLException("TODO: implementar ProductoDAO.insertar()");
    }

    public boolean actualizar(Producto producto) throws SQLException {

        throw new SQLException("TODO: implementar ProductoDAO.actualizar()");
    }

    public boolean eliminar(int id) throws SQLException {

        throw new SQLException("TODO: implementar ProductoDAO.eliminar()");
    }
}
