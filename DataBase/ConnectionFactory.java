package DataBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
public class ConnectionFactory {


    private static Connection connection = null;



    public static Connection openConnection(){
        Properties properties = getProperties();
        try {
           return connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);

        }catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return connection;
    }

    private static Properties getProperties(){

        Properties properties = new Properties();
        try {
            properties = new Properties();
            properties.load(new FileReader("C:\\Users\\isaqu\\OneDrive\\Área de Trabalho\\Alura\\propriedadesdb.txt"));


        }catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

        return properties;
    }

    public static void closeConnection(){

        try{
            if (connection != null){connection.close();}
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }

    }

}
