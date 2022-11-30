package com.example.demo.models;

public class Animal {

    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.especie = especie;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
