package DataBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
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
public class InserindoDados {

    public static void main(String... a) throws SQLException, IOException {
        int linhasModificadas = 0;
        Connection connection = ConnectionFactory.openConnection();

        Statement statement = connection.createStatement();

        /* 1 método para inserir dados em database (direto), porém este é muito vulnerável a inserções perigosas do usuário
        que pode ocasionar em deleção de elementos no banco de dados, está ação é chamada de SQL INJECTION.
         */
        statement.execute("INSERT INTO PRODUTO(nome,descricao) VALUES('Camisa Nike','Camisa da Nike tamanho M')");

        //Statement.RETURN_GENERATED_KEYS retorna a chave gerada
        //statement.execute("INSERT INTO PRODUTO(nome,descricao) VALUES('Camisa Nike','Camisa da Nike tamanho M')", Statement.RETURN_GENERATED_KEYS);

        /* 2 método para inserir dados em database (indireto), esté é o melhor método pois não é vulnerável a inserções perigosas
        do usuário já que o mesmo trata qualquer inserção de dados como tipo primitivo não como comandos sql.
         */
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PRODUTO(nome,descricao) VALUES(?,?)");

        preparedStatement.setString(1,"Notbook");
        preparedStatement.setString(2,"Notbook 2gb ram");
        linhasModificadas +=preparedStatement.executeUpdate();
        preparedStatement.setString(1,"Sapato");
        preparedStatement.setString(2,"Sapato tamanho 36");
        linhasModificadas += preparedStatement.executeUpdate();

        System.out.println("Linhas modificadas " + linhasModificadas);


        ConnectionFactory.closeConnection();



    }
}
