package DesignPatterns.Strategy;

class RealizadorDeInvestimento {

    public void CalculoInvestimento(ContaBancaria conta, TiposInvestimentos investimento){

        conta.depositar(investimento.calculoInvestimento(conta));



    }
}
