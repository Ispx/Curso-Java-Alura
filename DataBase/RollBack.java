package DataBase;

/*
Um tratamento Rollback serve para reverte uma transação.
Este tratamento é uma boa pratica, pois uma transação só será realizada se não houver nenhuma falha durante sua execução.
Para isso, é necessário alterar o auto commit da nossa aplicação para false, assim poderemos ter controle das transações.

Assim, uma instrução de modificação só será executada de fato após a validação do commit.

 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RollBack {
    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.openConnection();
        try {
            connection.setAutoCommit(false); //Neste momento estamos instanciando o parâmetro do método setAutoCommit como false.

            PreparedStatement prepared = connection.prepareStatement("INSERT INTO produto(nome,descricao) VALUES(?,?)");
            prepared.setString(1,"Camisa da Hollister");
            prepared.setString(2,"Camisa da Hollister vermelha tamanho M");

            //Executa a instrução acima
            prepared.executeUpdate();


            prepared.setString(1,"Camisa da Oakley");
            prepared.setString(2,"Camisa da Oakley preta tamanho M");
            //Executa a instrução acima
            prepared.executeUpdate();

            


            //A instrução acima só será executada no banco de dados após o comando abaixo.
            connection.commit();
            connection.rollback();


        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        }finally {
           // connection.commit(); // Independente de dar falha ou não commit á execução no banco de dados ( má pratica )
            connection.close(); // Feche o banco de dados
        }


    }

}