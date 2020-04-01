package DesignPatterns.ChainOfResponsibility;


import java.util.*;

public class Orcamento {

    private List<Item> itemList;

    public Orcamento(){
        itemList = new ArrayList<>();
    }


    public void adicionaItem(Item item){
        itemList.add(item);

    }

    public List<Item> getOrcamento(){
        return itemList;
    }

    public int getItens(){
        return itemList.size();
    }

    public double valorOrcamento(){
        return itemList.stream().mapToDouble(x -> x.getValorItem()).sum();
    }

}

