package DesignPatterns.Strategy;

public class Programa {

    public static void main(String[] args){

        MODERADO moderado = new MODERADO();
        CONSERVADOR conservador = new CONSERVADOR();

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.depositar(100);

        ARROJADO arrojado = new ARROJADO();

        RealizadorDeInvestimento investimento = new RealizadorDeInvestimento();


        investimento.CalculoInvestimento(contaBancaria, arrojado);
        System.out.println("Arrojado: "  + contaBancaria.getSaldo());

        investimento.CalculoInvestimento(contaBancaria, moderado);
        System.out.println("Moderado: "  + contaBancaria.getSaldo());

        investimento.CalculoInvestimento(contaBancaria, conservador);
        System.out.println("Conservador: "  + contaBancaria.getSaldo());



    }
}
