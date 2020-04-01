package DesignPatterns.ChainOfResponsibility;

public class DescontoMaisDeCincoItens implements Desconto{


    @Override
    public double valorDesconto(Orcamento orcamento) {

        if(orcamento.getItens() > 5){

            return orcamento.valorOrcamento() * 0.1;

        }
        else{

            return new ProximoDesconto().valorDesconto(orcamento);
        }

    }

    @Override
    public double semDesconto() {
        return 0;
    }
}
