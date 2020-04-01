package DesignPatterns.TemplateMethod;


import DesignPatterns.Strategy02.Orcamento;
import DesignPatterns.Strategy02.TipoImposto;

public abstract class TemplateMethod implements TipoImposto {


    @Override
    public final double valueImposto(Orcamento orcamento) {

        if(deveSerMaximo(orcamento)) {
            return valorMaximo(orcamento);
        }
        return valorMinimo(orcamento);
    }


    public abstract double valorMaximo(Orcamento orcamento);

    public abstract double valorMinimo(Orcamento orcamento);

    public abstract boolean deveSerMaximo(Orcamento orcamento);


}
