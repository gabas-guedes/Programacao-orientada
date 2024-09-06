package br.zoologico.animal;


public class animal {

    private String nome;
    private int idade;

    public animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void bebendoAgua() {
        System.out.println("Animal bebendo água.");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}