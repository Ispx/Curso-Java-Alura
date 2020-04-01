package DesignPatterns.Decorator;

import java.util.*;

public abstract class FiltroContas {

    protected FiltroContas outraConta;

    public FiltroContas(){}

    public FiltroContas(FiltroContas conta){
        outraConta = conta;
    }

    public abstract List<Conta> saldoMenorQue100(List<Conta> conta);
    public abstract List<Conta> saldoMaiorQue500mil(List<Conta> conta);
    public abstract List<Conta> dataAberturaCorreto(List<Conta> conta);

}
