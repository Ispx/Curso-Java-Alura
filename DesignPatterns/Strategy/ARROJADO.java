package DesignPatterns.Strategy;

import java.util.Random;

public class ARROJADO implements TiposInvestimentos {

    private final double[] chances = new double[]{0.6,0.6,0.6,0.6,3,3,5};
    private Random random = new Random();

    @Override
    public double calculoInvestimento(ContaBancaria contaBancaria) {

        return contaBancaria.getSaldo() * (chances[random.nextInt(chances.length - 1 )]/100);

    }
}
