package DesignPatterns.Decorator;

import java.util.*;
import java.util.stream.Collectors;


public class FiltroContas {

    public List<Conta> ConstasSuspeitas(List<Conta> contas) {

        List<Conta> ConstasSuspeitas = new ArrayList<>();

        ConstasSuspeitas.addAll(saldoMaiorQue500mil(contas));
        ConstasSuspeitas.addAll(saldoMenorQue100(contas));
        ConstasSuspeitas.addAll(dataAberturaCorreto(contas));

        return ConstasSuspeitas;
    }


    private List<Conta> saldoMenorQue100(List<Conta> conta) {
        return conta.stream().filter( x -> x.getSaldo() < 100).collect(Collectors.toList());
    }


    private List<Conta> saldoMaiorQue500mil(List<Conta> conta) {
        return conta.stream().filter( x -> x.getSaldo() > 500000.0).collect(Collectors.toList());
    }


    private List<Conta> dataAberturaCorreto(List<Conta> conta) {
        Date data = new Date();
        return conta.stream().filter( x -> x.getDataAbertura().getMonth() == data.getMonth() && x.getDataAbertura().getYear() == data.getYear()).collect(Collectors.toList());
    }


}
