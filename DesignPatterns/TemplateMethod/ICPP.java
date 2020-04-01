package DesignPatterns.TemplateMethod;

import DesignPatterns.Strategy02.Orcamento;

public class ICPP extends TemplateMethod {

    @Override
    public double valorMaximo(Orcamento orcamento) {
        return orcamento.getValue() * 0.07;
    }

    @Override
    public double valorMinimo(Orcamento orcamento) {
        return orcamento.getValue() * 0.05;
    }

    @Override
    public boolean deveSerMaximo(Orcamento orcamento) {
        return orcamento.getValue() < 500;
    }
}
