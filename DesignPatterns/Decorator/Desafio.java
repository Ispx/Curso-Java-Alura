package DesignPatterns.Decorator;

public class Desafio {


    /*

    Ao identificar contas que possam ser fraudulentas, um banco possui uma série de filtros que devem ser aplicados sobre uma
    lista de contas.

    Contas com saldo menor que 100 reais ou
    Contas com saldo maior do que 500 mil reais, ou
    Contas com data de abertura no mês corrente
    Todas essas são geralmente selecionadas para uma análise mais detalhada.

    Usando Decorators, implemente esse conjunto de filtros e faça com que, ao receber uma lista, o decorator devolva uma nova
     lista com as contas que atendam a pelo menos um dos critérios acima. Isto é, queremos que o Filtro tenha pelo menos o método
     de filtragem de contas:


    abstract class Filtro {
        public abstract List<Conta> filtra(List<Conta> contas);
    }


     */
}
