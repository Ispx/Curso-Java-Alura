package DesignPatterns.Decorator;

import java.util.*;
import java.util.stream.Collectors;

public class ListaDeContas extends FiltroContas {

    private List<Conta> contaList;
    private List<ListaDeContas> outrasContas;

    public ListaDeContas(FiltroContas outraConta){
        super(outraConta);
    }

    public ListaDeContas(List<Conta> contas){
        contaList = new ArrayList<>(contas);
    }

    public void methodOutraConta(ListaDeContas contas){




    }


    @Override
    public List<Conta> saldoMenorQue100(List<Conta> conta) {
        return conta.stream().filter( x -> x.getSaldo() < 100).collect(Collectors.toList());
    }

    @Override
    public List<Conta> saldoMaiorQue500mil(List<Conta> conta) {
        return conta.stream().filter( x -> x.getSaldo() > (500 * 1000)).collect(Collectors.toList());
    }

    @Override
    public List<Conta> dataAberturaCorreto(List<Conta> conta) {
        List<Conta> novaLista = new ArrayList<>();
        for (Conta e : conta){

            if (e.getDataAbertura().getMonth() == new Date().getMonth() && e.getDataAbertura().getYear() == new Date().getYear()){
                novaLista.add(e);
            }
        }
        return novaLista;
    }
}
