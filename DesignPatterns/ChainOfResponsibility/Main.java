package DesignPatterns.ChainOfResponsibility;

public class Main {

    public static void main(String[] args){



        DescontoMaisDeCincoItens desconto = new DescontoMaisDeCincoItens();

        Orcamento orcamento = new Orcamento();
        Item item = new Item("Caneta",5.25);
        orcamento.adicionaItem(item);
        item = new Item("Lapis",35);
        orcamento.adicionaItem(item);
        item = new Item("Sapato",109.00);
        orcamento.adicionaItem(item);
        item = new Item("Água",7.50);
        orcamento.adicionaItem(item);


        System.out.println("Desconto: R$ " + desconto.valorDesconto(orcamento));








    }
}
