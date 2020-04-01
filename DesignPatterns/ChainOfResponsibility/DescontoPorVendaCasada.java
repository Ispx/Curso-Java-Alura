package DesignPatterns.ChainOfResponsibility;

public class DescontoPorVendaCasada implements Desconto {
    @Override
    public double valorDesconto(Orcamento orcamento) {

        if(orcamento.getOrcamento().stream().filter(x -> x.getNomeItem().equalsIgnoreCase("Caneta")).count() > 0 &&
        orcamento.getOrcamento().stream().filter(x -> x.getNomeItem().equalsIgnoreCase("Lapis")).count() > 0) {

            return orcamento.valorOrcamento() * 0.05;
        }
        else{
            return semDesconto();
        }
    }

    @Override
    public double semDesconto() {
        return 0;
    }
}
