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

public class Tratamento {

    public static void main(String ...x) throws Exception {

        m2();
        m3();
        m4();
        m5(); //Este método não será realizado , poishá o lançamento de uma exceção na m4 sem tratamento.
        System.out.println("Fim do main!");
    }


    public static void m2(){
        try {
            int num = 2;
            System.out.println("M2 = " + num);
        }catch (Exception e){
            System.out.println("M2 resolve");
            e.printStackTrace(); //Imprima o rastro da pilha da excessão.

        }
    }

    public static void m3(){

        try {
            int num = 3;
            System.out.println("M3 = " + num);
        }catch (Exception e){
            System.out.println("M3 resolve");
        }
    }

    public static void m4() throws Exception { //Checked

        int num = 4;
        System.out.println("M4 = " + num);

        throw new Exception("Lançado Exception Chacked!"); // Lançar uma excessão sem verificação é desviar o fluxo de execuçao.

    }


    public static void m5(){


        int num = 5;
        System.out.println("M5 = " + num);

        throw new RuntimeException("Lançado RuntimeException Unchecked!");
    }


}
