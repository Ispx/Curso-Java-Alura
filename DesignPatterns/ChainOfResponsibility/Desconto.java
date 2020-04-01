package DesignPatterns.ChainOfResponsibility;

public interface Desconto {

    double valorDesconto(Orcamento orcamento);
    double semDesconto();
}
