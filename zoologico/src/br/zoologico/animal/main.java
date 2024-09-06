package br.zoologico.animal;

public class main {

	public static void main(String[] args) {
		
		ave objAve = new ave("Arara", 3, "Azul");
        objAve.bicar();
        objAve.exibirInfo();

        System.out.println("================");

        mamifero objMamifero = new mamifero("Gato", 7, "Longo");
        objMamifero.bebendoLeite();
        objMamifero.bebendoAgua();
        objMamifero.exibirInfo();

        System.out.println("=================");
    }
}


