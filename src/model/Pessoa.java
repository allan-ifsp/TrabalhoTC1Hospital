package model;

import java.util.Date;

public class Pessoa {
    private String nome, sexo, email, telefone;
    private Date dataNasc;

    public Pessoa() {
    }

    public Pessoa(String nome, String sexo, String email, String telefone, Date dataNasc) {
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
