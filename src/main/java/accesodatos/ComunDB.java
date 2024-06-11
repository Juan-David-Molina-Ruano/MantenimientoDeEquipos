package accesodatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ComunDB {
     static String connectionUrl = "jdbc:sqlserver:1433;"
            + "database=EVALUACIONJAVA;"
            + "user=david;"
            + "password=server24004;"
            + "loginTimeout=30;encrypt=false;trustServerCertificate=true";
    public static Connection obtenerConexion() throws SQLException {
        // Registrar el Driver de la conexion a la base de datos SQL server
        // para que lo reconozca el servidor web
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        Connection connection = DriverManager.getConnection(connectionUrl); // abrir la conexion a la base de datos
        return connection; // retornar la conexion a la base de datos
    }
}
