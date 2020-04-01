package DesignPatterns.Strategy02;

public class program {

    public static void main(String[] args){

        ICMS icms = new ICMS();
        ISS iss = new ISS();

        Orcamento orcamento;
        orcamento =  new Orcamento(new Produtos("Sapato",100.0));
        orcamento = new Orcamento(new Produtos("Blusa",95.75));
        orcamento = new Orcamento(new Produtos("Nike",250.00));


        CalculaImposto calcula = new CalculaImposto();

        System.out.println("ICMS " + calcula.CalculaImposto(icms,orcamento));

        System.out.println("ISS: " + calcula.CalculaImposto(iss,orcamento));

    }
}
