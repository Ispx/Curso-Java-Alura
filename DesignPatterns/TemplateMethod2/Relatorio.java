package DesignPatterns.TemplateMethod2;

import java.util.Date;

public class Relatorio {
    private String nome;
    private Banco banco;
    private String telefone;
    private String endereço;
    private String email;
    private Date date;

    public Relatorio(String nome, Banco banco, String telefone, String endereço, String email) {
        this.nome = nome;
        this.banco = banco;
        this.telefone = telefone;
        this.endereço = endereço;
        this.email = email;
    }

    public Relatorio(String nome, Banco banco, String telefone) {
        this.nome = nome;
        this.banco = banco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
