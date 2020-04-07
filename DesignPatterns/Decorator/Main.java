package DesignPatterns.Decorator;


import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String... args) throws ParseException {
        Date data = new Date();

        List<Conta> lista = new ArrayList<>();

        Conta conta = new Conta(1234,90.00,data);
        lista.add(conta);
        conta = new Conta(4567,510000.0,data);
        lista.add(conta);
        conta = new Conta(7894,5000.0,data);
        lista.add(conta);

        FiltroContas filtroContas = new FiltroContas();
        List<Conta> contas = new ArrayList<>();
        contas.addAll(filtroContas.ConstasSuspeitas(lista));

       contas.forEach(x -> System.out.println(x.getNumero()));



    }
}
