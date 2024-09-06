package br.zoologico.animal;


public class mamifero extends animal {

    private String terpelos;

    public mamifero(String nome, int idade, String terpelos) {
        super(nome, idade);
        this.terpelos = terpelos; 
    }

    public void bebendoLeite() {
        System.out.println("Bebendo leite...");
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("ter pelos: " + terpelos);
    }
}