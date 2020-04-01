package DesignPatterns.TemplateMethod;

import DesignPatterns.Strategy02.Orcamento;
import DesignPatterns.Strategy02.Produtos;

public class Main {

    public static void main(String... args){

        IKCV impostoIKCV = new IKCV();
        ICPP impostoICPP = new ICPP();

        Orcamento orcamento;
        orcamento =  new Orcamento(new Produtos("Sapato",100.0));
        orcamento = new Orcamento(new Produtos("Blusa",95.75));
        orcamento = new Orcamento(new Produtos("Nike",250.00));

        System.out.println("Valor do imposto IKCV R$ " + impostoIKCV.valueImposto(orcamento));

        System.out.println("Valor do imposto ICPP R$ " +  impostoICPP.valueImposto(orcamento));

    }

}
