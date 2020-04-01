package DesignPatterns.Decorator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta {

    private Integer numero;
    private Date dataAbertura;
    private Double saldo;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");


    public Conta(Integer numero, Date dataAbertura, Double saldo, String data) throws ParseException {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.dataAbertura = sdf.parse("data");
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
