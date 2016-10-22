package Esfihario;

import java.sql.SQLException;
import Esfihario.ConfigBase;
import java.sql.Statement;

public class DaoCadTipo {

    private static Statement stmt = null;

    public static void insertTipo(String nome) throws ClassNotFoundException {

        ConfigBase conf = new ConfigBase();

        try {
            ConfigBase.Conectar();

            stmt = ConfigBase.con.createStatement();
            stmt.execute("insert into tipo(NOME) values ('" + nome + "')");
            stmt.close();
        } catch (SQLException sqlExcept) {
            sqlExcept.printStackTrace();
        }
    }

}
