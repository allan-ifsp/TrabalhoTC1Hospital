package model;

import java.util.Date;

public class Medico extends Pessoa implements Cloneable{
    private String CRM; // 8 digitos PK
    private String especialidade;
    private String universidade;

    public Medico() {
    }

    public Medico(String nome, String sexo, String email, String telefone, Date dataNasc, String CRM, String especialidade, String universidade) {
        super(nome, sexo, email, telefone, dataNasc);
        this.CRM = CRM;
        this.especialidade = especialidade;
        this.universidade = universidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public Medico clone() throws CloneNotSupportedException {
        return (Medico) super.clone();
    }
}


//(X) Médico=(CRM, Nome, Data de Nascimento, Sexo, Especialidade, Universidade de
//Formação, E-mail, Telefone)