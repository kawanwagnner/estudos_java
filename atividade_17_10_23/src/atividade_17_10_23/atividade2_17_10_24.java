package atividade_17_10_23;

import java.util.Scanner;

public class atividade2_17_10_24 {

	public static void main(String[] args) {
		/*
		 * 2. Faça um programa que dada a idade de um jogador, classifique-o em uma das
		 * seguintes categorias:
		 * 
		 * Infantil A = 5 a 7 anos; 
		 * Infantil B = 8 a 11 anos; 
		 * Juvenil A = 12 a 13 anos;
		 * Juvenil B = 14 a 17 anos; 
		 * Adultos = Maiores de 18 anos;
		 */

		int intAge;

		Scanner input = new Scanner(System.in);
		System.out.println("Seja Bem-Vindo(a)");
		System.out.println("");

		System.out.print("Por favor, digite a idade do jogador: ");
		intAge = input.nextInt();

		if (intAge >= 5 && intAge <= 7) {
			System.out.println("Clase: Infantil A");
		} else if (intAge >= 8 && intAge <= 11) {
			System.out.println("Clase: Infantil B");
		} else if (intAge >= 12 && intAge <= 13) {
			System.out.println("Clase: Juvenil A");
		} else if (intAge >= 14 && intAge <= 17) {
			System.out.println("Clase: Juvenil B");
		} else if (intAge >= 18) {
			System.out.println("Clase: Adultos");
		} else {
			System.out.println("Categorizados somente maiores de 5 anos.");
		}

	}

}
