package Exception;
        /*
                Estrutura try cacth finally

                Um try tem que ter no minimo um cacth e zero ou um finally.

                1 try tem
                >= 1 cacth
                <= 1 finally

         */

        /*
                Exceções Checked e Unchecked

                Exceções checked precisam ser tratadas para isso deve ser implementado os blocos cacth
                Exemplo de exceção checked Exception e suas filhas.

                Exceções unchecked não precisam ser tratadas, logo não é necessário a implementação do bloco cacth.
                Exemplo de exceção unchecked RunTimeException e suas filhas.

         */


/*
Caso sejá identificado uma excessão dentro de um método, a JVM irá se comportar da seguinte forma:

1 - Ela irá perguntar para o método que contém o problema se o mesmo possui algum tipo de tratamento para aquela excessão,
se sim o mesmo irá executar a tratativa de excessão e continuará a executar o restante do código.

2 - Caso não haja um tratamento de excessão, então a execução será desviado o fluxo de execussão encerrando o mesmo,
 pois a JVM não sabera se comportar diante do problema identificado e além disso será lançado a excessão identificada.

Por este motivo é importante é fazer a tratativa de possíveis excessões para que todos os códigos sejam executados.

 */

public class mainConexao {

    public static void main(String... x){

        /*
        Para utilizar a tratativa abaixo de tratamento de exceção, a classe que esta sendo instanciada como parâmetro do try
        deve implementar o contrato da interface AutoCloseable para garantir que o objeto que esta sendo aberto na memória
        sejá fechado independente da captura de uma ou mais exceções.
         */

        /*try-with-resources*/
        try(Conexao con = new Conexao()){
            con.abrirConexao();
            con.lerConexao();
        }



    }
}
