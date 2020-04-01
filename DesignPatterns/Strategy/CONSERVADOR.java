package DesignPatterns.Strategy;

public class CONSERVADOR implements TiposInvestimentos{
    @Override
    public double calculoInvestimento(ContaBancaria contaBancaria) {
        return contaBancaria.getSaldo() * (0.8/100);
    }
}
