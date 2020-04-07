package DataBasPoolConnections;

import com.mchange.v2.c3p0.ComboPooledDataSource;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class PoolConnections implements AutoCloseable{



    private ComboPooledDataSource comboPooledDataSource;


    public PoolConnections(){
    }

    public void controll(boolean status){
        comboPooledDataSource.setAutoCommitOnClose(status);
    }

    private Properties properties(){
        Properties properties = new Properties();
        try{
            properties.load(new FileReader("C:\\Users\\isaqu\\OneDrive\\Área de Trabalho\\Alura\\propriedadesdb.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }


    public void limitConnections(int size){
        comboPooledDataSource.setMaxPoolSize(size);
    }

    public Connection getConnecetion() throws SQLException {
        try {
            if (comboPooledDataSource == null) {
                comboPooledDataSource = new ComboPooledDataSource();
                comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/loja_virtual");
                comboPooledDataSource.setUser("root");
                comboPooledDataSource.setPassword("Ispx1998");
                comboPooledDataSource.setProperties(properties());

                return comboPooledDataSource.getConnection();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return comboPooledDataSource.getConnection();
    }


    @Override
    public void close() throws Exception {
        if(comboPooledDataSource != null){
            comboPooledDataSource.close();

        }
    }
}
