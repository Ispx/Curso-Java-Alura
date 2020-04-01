package DesignPatterns.ChainOfResponsibility;

public class DescontoMaiorQuinhentosReais implements Desconto {
    @Override
    public double valorDesconto(Orcamento orcamento) {

        return orcamento.valorOrcamento() * 0.07;

    }

    @Override
    public double semDesconto() {
        return 0;
    }
}
