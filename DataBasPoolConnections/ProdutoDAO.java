package DataBasPoolConnections;

import DataBase.ConnectionFactory;

import java.sql.*;

public class ProdutoDAO {
                                                         //Data Acess Object
    private static Connection connection = null;
    private static PreparedStatement preparedStatement;
    private static PoolConnections poolConnections = new PoolConnections();

    public ProdutoDAO(){
        try {
            connection = poolConnections.getConnecetion();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void Create(String nome,String descricao) throws SQLException {

        try {
            preparedStatement("INSERT INTO produto(nome,descricao) VALUES(?,?)");
            preparedStatement.setString(1,nome);
            preparedStatement.setString(2,descricao);

            preparedStatement.executeUpdate();

  //          connection.commit();

        }catch (SQLException e){
            e.printStackTrace();
           // connections.getConnecetion().rollback();
        }
    }

    public static void Read(){
        try {
            preparedStatement("SELECT * FROM PRODUTO");

            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();

            while(resultSet.next()){
               System.out.println("Produto: " + " ID: " + resultSet.getInt("id") + " NOME: " + resultSet.getString("nome") + " Descrição: " + resultSet.getString("descricao"));
           }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void UPLOAD(){}


    public static void DELETE(int id){
        try {
            preparedStatement("DELETE FROM PRODUTO WHERE id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static void preparedStatement(String sql) {
        try {
            preparedStatement = connection.prepareStatement(sql);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
