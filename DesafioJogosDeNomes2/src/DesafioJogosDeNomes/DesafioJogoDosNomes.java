package DesafioJogosDeNomes;

import java.util.Scanner;

public class DesafioJogoDosNomes {

	public static void main(String[] args) {
		
		
		String[] strNomes = {"Maria", "João", "Pedro", "Anastacia", "Gisele", "Cleiton", "Lucas", "José", "Rafael", "Kawan"};
		
		
		for (int i = 0; i < 3; i++) {
		    Scanner sc = new Scanner(System.in);

		    System.out.println("Digite o " + (i + 1) + "º nome:");
		    String strNomesPessoas = sc.nextLine();

		    boolean venceu = false;

		    for (int index = 0; index < strNomes.length; index++) {
		        if (strNomesPessoas.equalsIgnoreCase(strNomes[index])) {
		            System.out.println("\u001B[32mParabéns você acertou!!!");
		            venceu = true;
		            System.exit(0);
		        }
		    }

		    if (!venceu) {
		        System.err.println("Você errou! Tente novamente.");
		        System.out.println("");
		    }
		}
		
		
		
	}

}
