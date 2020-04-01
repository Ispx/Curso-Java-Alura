package DesignPatterns.Strategy02;

public class CalculaImposto {
    //Foi cirado uma interface com um único método que recebe como parametro um orçamento.
    //Logo não se faz necessário chamar a classe concreta e sim a mais genérica (interface).

    public double CalculaImposto(TipoImposto imposto, Orcamento orcamento){

        return imposto.valueImposto(orcamento);

    }


}
