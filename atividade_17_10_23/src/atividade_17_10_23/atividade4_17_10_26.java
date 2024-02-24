package atividade_17_10_23;

import java.util.Scanner;

public class atividade4_17_10_26 {

	public static void main(String[] args) {
		/*
		 * 4. Escreva um programa que solicite dois caracteres de A a Z ao usuário e
		 * imprima o número de caracteres existente entre eles, caso usuário digite os 2
		 * caracteres em ordem alfabética. Caso não o estejam, emitir mensagem de erro.
		 * 
		 * Exemplo: Digite 2 caracteres: j t O número de caracteres entre eles é: 9
		 * Digite 2 caracteres:v d Erro na sequência alfabética.
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Digite dois caracteres (A-Z): ");
		String response = input.nextLine();


		if (response.length() == 2 && Character.isLetter(response.charAt(0)) && Character.isLetter(response.charAt(0))) {
			char caractere1 = Character.toLowerCase(response.charAt(0));
			char caractere2 = Character.toLowerCase(response.charAt(1));
			if (caractere1 < caractere2) {
				int numCaracteres = caractere2 - caractere1 - 1;
				System.out.println("O número de caracteres entre eles é: " + numCaracteres);
			} else {
				System.out.println("Erro na sequência alfabética.");
			}
		} else {
			System.out.println("Entrada inválida. Por favor, insira exatamente dois caracteres.");
		}
		input.close();
	}

}
