package DesignPatterns.TemplateMethod;

import DesignPatterns.Strategy02.Orcamento;
import DesignPatterns.Strategy02.Produtos;

public class IKCV extends TemplateMethod{



    @Override
    public double valorMaximo(Orcamento orcamento) {
        return orcamento.getValue() * 0.1;
    }

    @Override
    public double valorMinimo(Orcamento orcamento) {
        return orcamento.getValue() * 0.06;
    }

    @Override
    public boolean deveSerMaximo(Orcamento orcamento) {
        return orcamento.getValue() > 500 && temItemMaioQue100(orcamento);
    }

    private boolean temItemMaioQue100(Orcamento orcamento) {

        for(Produtos p : orcamento.produtosOrcamento()){

            if(p.getPrice() > 100){
                return true;
            }
        }
        return false;
    }
}
