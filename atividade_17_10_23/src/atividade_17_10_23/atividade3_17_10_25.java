package atividade_17_10_23;

import java.util.Scanner;

public class atividade3_17_10_25 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um vetor de inteiros positivos de 60 itens.
		 * Imprimir a quantidade de números pares e de múltiplos de 4.
		 */

		Scanner input = new Scanner(System.in);

		// Inicializa as variaveis
		int valor;
		int limite;
		int pares = 0;
		int multiplosDe4 = 0;

		// Lê o valor do usuário
		System.out.print("Digite o um número: ");
		valor = input.nextInt();
		limite = valor + 60;

		input.close();

		// Conta os números pares e múltiplos de 4
		for (int i = valor; i <= limite; i++) {
			if (i % 2 == 0) {
				pares++;
			}
			if (i % 4 == 0) {
				multiplosDe4++;
			}
		}

		// Imprime os resultados
		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de múltiplos de 4: " + multiplosDe4);

	}

}
