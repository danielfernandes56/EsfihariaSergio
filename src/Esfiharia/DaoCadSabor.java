package Esfiharia;

import java.sql.SQLException;
import Esfiharia.ConfigBase;
import java.sql.Statement;

public class DaoCadSabor {

    private static Statement stmt = null;

    public static void insertTipo(String nome) throws ClassNotFoundException {

        try {
            ConfigBase.Conectar();

            stmt = ConfigBase.con.createStatement();
            stmt.execute("insert into sabor(NOME) values ('" + nome + "')");
            stmt.close();
        } catch (SQLException sqlExcept) {
            sqlExcept.printStackTrace();
        }
    }

}
