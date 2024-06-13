package com.meninas_gerentes.dao;

public class ProfessorPojo {
    private int id;
    private String nome;
    private String endereco;
    private int idade;

    // Construtor vazio
    public ProfessorPojo() {
    }

    // Getters e Setters para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getters e Setters para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getters e Setters para endereco
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getters e Setters para idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
