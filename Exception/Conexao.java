package Exception;

public class Conexao implements AutoCloseable{

    public void abrirConexao(){
        System.out.println("Conexão aberta!");
    }

    public void lerConexao(){
        System.out.println("Lendo conexão!");
        throw new RuntimeException("Falha ao acessar dados."); //unchecked Exception
    }


    @Override
    public void close(){
        System.out.println("Conexão fechada!");
    }
}
