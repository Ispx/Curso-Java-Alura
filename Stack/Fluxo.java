package Stack;

public class Fluxo {

    public static void main(String... args){

        /*
            O processo de execução do java é chamado de stack (pilha)
            onde o cada stack é um método e o primeiro método chamado (main) é o último a ser executado.
            Um método só é descartado da stack após a leitura da sua chave de fechamento do bloco de instrução. '}'
         */

        System.out.println("Iniicio da Stack");
        m2();

    }

    public static void m2(){
        System.out.println("Segundo método!");
        m3();
    }

    public static void m3(){
        System.out.println("Terceiro método!");
    }

}
