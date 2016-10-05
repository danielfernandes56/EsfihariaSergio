package esfihariasergio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfigBase {

    public static Connection con;
    public static ResultSet rs;

    public static void Conectar() throws ClassNotFoundException {
        try {
            String UrlConectar = "jdbc:derby://localhost:1527/EsfihariaSergio;user=administrator;password=Acidmax56;";
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(UrlConectar);
            System.out.print("Conexão com Banco de dados feita com sucesso");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.print("Houve um erro com a conexão  " + ex.getMessage());
        }

    }

}
