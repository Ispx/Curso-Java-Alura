package DesignPatterns.Strategy02;

public class ICMS implements TipoImposto {
    @Override
    public double valueImposto(Orcamento orcamento) {
        return orcamento.getValue() * 0.1;
    }

}
