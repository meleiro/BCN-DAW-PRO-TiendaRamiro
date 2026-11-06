# UD2 - JDBC PostgreSQL con Swing (PLANTILLA ALUMNADO)

Proyecto Java 21 + Maven para IntelliJ IDEA. Partimos del proyecto gráfico de clase y **dejamos pendiente la configuración JDBC y los ocho métodos CRUD de los DAO**.

## Incluye
- `vista/VentanaPrincipal.java`: interfaz Swing completa (clientes y productos), sin necesidad de modificarla.
- `modelo/Cliente.java` y `modelo/Producto.java`: clases de dominio completas.
- `conexion/ConexionBD.java`: URL, usuario, contraseña y método `obtenerConexion()` pendientes.
- `dao/ClienteDAO.java` y `dao/ProductoDAO.java`: métodos `listar`, `insertar`, `actualizar` y `eliminar` pendientes, con pistas TODO.
- `sql/`: scripts de creación de base de datos y tablas.

## Orden de trabajo recomendado
1. Crear la base de datos con los scripts SQL; ajustar el nombre/usuario/contraseña al entorno.
2. Completar `ConexionBD` y probar el botón **Probar conexión**.
3. Implementar `ClienteDAO.listar()` y usar **Recargar datos**.
4. Implementar `ClienteDAO.insertar()`, `actualizar()` y `eliminar()`.
5. Repetir con `ProductoDAO`.

## Importante
Los métodos sin resolver lanzan `SQLException` con un mensaje TODO para que la interfaz muestre el error de forma controlada, en lugar de aparentar que una operación se ha realizado. No son implementaciones funcionales.

Abrir la carpeta como proyecto Maven en IntelliJ IDEA con JDK 21 y ejecutar `app.Main`.
