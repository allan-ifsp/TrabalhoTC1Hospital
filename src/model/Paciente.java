package model;

import model.Pessoa;

import java.util.Date;

public class Paciente extends Pessoa {
    private String CPF;
    private String planoSaude;

    public Paciente(String nome, String sexo, String email, String telefone, Date dataNasc, String CPF, String planoSaude) {
        super(nome, sexo, email, telefone, dataNasc);
        this.CPF = CPF;
        this.planoSaude = planoSaude;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }
}

//(Y) model.Paciente=(CPF, Nome, Data de Nascimento, Sexo, Plano de Saúde, E-mail, Telefone)