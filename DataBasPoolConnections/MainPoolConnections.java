package DataBasPoolConnections;

import javax.print.attribute.standard.PDLOverrideSupported;
import java.sql.*;

public class MainPoolConnections {

    public static void main(String... a) throws Exception {

        ProdutoDAO produtoDAO = new ProdutoDAO();
        PoolConnections poolConnections = new PoolConnections();
        System.out.println("Em execução");


        ProdutoDAO.Create("Blusa Adidas","Blusa da Adidas tamanho G.");

        ProdutoDAO.Read();
        System.out.println();

        ProdutoDAO.DELETE(34);

        System.out.println();
        ProdutoDAO.Read();


        poolConnections.close();
        System.out.println("Execução fechada!");


    }



}
