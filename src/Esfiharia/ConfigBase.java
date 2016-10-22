package Esfiharia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigBase {

    public static Connection con;

    public static void Conectar() throws ClassNotFoundException {
        try {
            String UrlConectar = "jdbc:derby://localhost:1527/EsfihariaSergio;user=administrador;password=Acidmax56;";
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(UrlConectar);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
