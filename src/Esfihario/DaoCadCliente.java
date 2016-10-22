package Esfihario;

import java.sql.SQLException;
import Esfihario.ConfigBase;
import java.sql.Statement;

public class DaoCadCliente {

    private static Statement stmt = null;

    public static void insertCliente(String nome, String endereco, String complemento, int numero, String telefone, String celular) throws ClassNotFoundException {

        try {

            ConfigBase.Conectar();
            stmt = ConfigBase.con.createStatement();
            stmt.execute("insert into cliente(NOME,ENDERECO,COMPLEMENTO,NUMERO,TELEFONE,CELULAR)values ('" + nome + "','" + endereco + "','" + complemento + "'," + numero + ",'" + telefone + "','" + celular + "')");
            stmt.close();
            System.out.println("Dados Gravados com sucesso");
        } catch (SQLException ex) {

            System.out.println("Deu erro " + ex.getMessage());

        }

    }

}
