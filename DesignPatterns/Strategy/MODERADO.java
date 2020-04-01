package DesignPatterns.Strategy;

import java.util.Random;

public class MODERADO implements TiposInvestimentos {

    private final double[] chances = new double[]{2.5,0.7};
    private Random random = new Random();

    @Override
    public double calculoInvestimento(ContaBancaria contaBancaria) {
        return contaBancaria.getSaldo() * (chances[random.nextInt(chances.length - 1)]/100);
    }
}
