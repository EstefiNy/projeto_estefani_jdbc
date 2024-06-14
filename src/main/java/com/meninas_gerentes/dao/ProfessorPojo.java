package com.meninas_gerentes.dao;

public class ProfessorPojo {
    private String nome;
    private String discplina;
    private String agenda;

    @Deprecated
    public ProfessorPojo() {
    }
    

    public ProfessorPojo(String nome, String discplina, String agenda) {
        this.nome = nome;
        this.discplina = discplina;
        this.agenda = agenda;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiscplina() {
        return discplina;
    }

    public void setDiscplina(String discplina) {
        this.discplina = discplina;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    
}
