package Desafios_;

import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) {
//		8. Crie um algoritmo que receba um número e exiba sua tabuada de multiplicar de 1 a 20.

		int intNumTabuada;

		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, bem vindo(a)! Por favor, digite os dados para começar:");
		System.out.println("");

		System.out.println("Qual é a tabuada da sua preferência?");
		intNumTabuada = sc.nextInt();

		System.out.println("");
		System.out.println("Tabuada do " + intNumTabuada + ":");
		for (int i = 0; i < 10; i++) {
			System.out.println(intNumTabuada + " x " + (i + 1) + " = " + intNumTabuada * (i + 1));
		}
		
	}

}
