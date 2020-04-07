package DataBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

                /*
            A manipulação ou leitura dos dados presente em  um database em aplicações java só é possível atraveés dos
            seguintes passos.

           Definição dos objetos:
           - Connection (DriverManager.getConnection) -> Abertura de conexão em um database.
           - Statement (Execute) -> Inserção de comandos SQL para manipulação.
           - PreparetStatement (ExecuteUpdate)-> Manipulação de um database de métodos java de inserção tendo como base um comando SQL como parametro da classe PreparetStatement.
           - ResultSet (Next) -> Leitura dos dados.


            1º - Criamos uma declaração, e está declaração é criada através do método createStament da Classe Connection que retorna um Statement com os valores do database.
            2º - Após isso, através do objeto Statement chamamos o método createResultSet que recebe esses valores e retorna um objeto ResultSet.
            3º - E através deste objeto podemos percorrer os valores através do método next.

         */

public class LendoDB {
    public static void main(String... a) throws Exception {


        try(Connection connection = ConnectionFactory.openConnection()) {

            Statement statement = connection.createStatement();
            boolean b = statement.execute("SELECT * FROM PRODUTO");
            System.out.println(b);
            ResultSet resultSet = statement.getResultSet();

            System.out.println("id nome descrição");
            while (resultSet.next()) {

                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("nome") + " " + resultSet.getString("descricao"));

            }

        }


    }
}
