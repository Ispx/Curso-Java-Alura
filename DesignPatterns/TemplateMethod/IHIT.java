package DesignPatterns.TemplateMethod;

import DesignPatterns.Strategy02.Orcamento;
import DesignPatterns.Strategy02.Produtos;

public class IHIT extends TemplateMethod{



    @Override
    public double valorMaximo(Orcamento orcamento) {
        return orcamento.getValue() * 0.13 + 100;
    }

    @Override
    public double valorMinimo(Orcamento orcamento) {
        return orcamento.getValue() * 0.01 * orcamento.produtosOrcamento().stream().count();
    }

    @Override
    public boolean deveSerMaximo(Orcamento orcamento) {

        for(Produtos produto : orcamento.produtosOrcamento()){

            if(orcamento.produtosOrcamento().stream().filter(name -> name.equals(produto.getName())).count() > 1){
                return true;

            }

        }
        return false;
    }
}
