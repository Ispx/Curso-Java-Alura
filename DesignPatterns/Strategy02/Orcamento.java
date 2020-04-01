package DesignPatterns.Strategy02;

import java.util.*;

public class Orcamento {
    private double value;

    private List<Produtos> produtosList = new ArrayList<>();;

    public Orcamento(Produtos produto){
        produtosList.add(produto);
    }


    public double getValue(){
        return produtosList.stream().mapToDouble(price -> price.getPrice()).sum();
    }

    public List<Produtos> produtosOrcamento(){return produtosList;}

}
