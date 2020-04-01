package DesignPatterns.ChainOfResponsibility;

public class Item {

    private String nomeItem;
    private double valorItem;

    public Item(String nomeItem, double valorItem){

        this.nomeItem = nomeItem;
        this.valorItem = valorItem;

    }
    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }
}
