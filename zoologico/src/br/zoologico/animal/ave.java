package br.zoologico.animal;

public class ave extends animal {

    private String coresDasPenas;

    public ave(String nome, int idade, String coresDasPenas) {
        super(nome, idade);
        this.coresDasPenas = coresDasPenas; 
    }

    public void bicar() {
        System.out.println("Ave bicando.");
    }


    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cores das penas: " + coresDasPenas);
    }
}
