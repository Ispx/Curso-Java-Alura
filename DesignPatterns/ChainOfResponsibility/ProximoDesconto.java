package DesignPatterns.ChainOfResponsibility;

public class ProximoDesconto implements Desconto{


    @Override
    public double valorDesconto(Orcamento orcamento) {

        return new DescontoPorVendaCasada().valorDesconto(orcamento);

    }

    @Override
    public double semDesconto() {
        return 0;
    }
}
