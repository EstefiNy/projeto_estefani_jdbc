package com.meninas_gerentes.dao;

public class ProfessorPojo {
    private int id;
    private String nome;
    private String discplina;
    private String agenda;

    @Deprecated
    public ProfessorPojo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    @Override
    public String toString() {
        return "ProfessorPojo [id=" + id + ", nome=" + nome + ", discplina=" + discplina + ", agenda=" + agenda + "]";
    }

    
}
