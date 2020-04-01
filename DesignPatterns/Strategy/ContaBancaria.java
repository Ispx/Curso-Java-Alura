package DesignPatterns.Strategy;

public class ContaBancaria {

    private double saldo;

    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public double getSaldo(){
        return saldo;
    }

}
