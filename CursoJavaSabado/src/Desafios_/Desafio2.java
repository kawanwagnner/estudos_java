package Desafios_;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		// 2. Desenvolva um algoritmo que receba quatro notas e seus respectivos pesos, calcule e mostre a média ponderada.

		int intNota, intNota2, intNota3, intNota4;
		int intPeso, intPeso2, intPeso3, intPeso4;

		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, bem vindo(a)! Por favor, digite os dados do equipamento:");

		System.out.println("Digite a 1º nota:");
		intNota = sc.nextInt();
		
		System.out.println("Digite a 2º nota:");
		intNota2 = sc.nextInt();
		
		System.out.println("Digite a 3º nota:");
		intNota3 = sc.nextInt();
		
		System.out.println("Digite a 4º nota:");
		intNota4 = sc.nextInt();
		
		System.out.println("");
		System.out.println("=======================");
		System.out.println("");
		
		System.out.println("Digite o peso da 1º nota:");
		intPeso = sc.nextInt();
		
		System.out.println("Digite o peso da 2º nota:");
		intPeso2 = sc.nextInt();
		
		System.out.println("Digite o peso da 3º nota:");
		intPeso3 = sc.nextInt();
		
		System.out.println("Digite o peso da 4º nota:");
		intPeso4 = sc.nextInt();
		
		System.out.println("");
		System.out.println("=======================");
		System.out.println("");
		
		int intMediaPonderada1 =  intNota * intPeso;
		int intMediaPonderada2 =  intNota2 * intPeso2;
		int intMediaPonderada3 =  intNota3 * intPeso3;
		int intMediaPonderada4 =  intNota4 * intPeso4;
		
		int intSomaNotasMedias =  intMediaPonderada1 + intMediaPonderada2 +intMediaPonderada3 + intMediaPonderada4;
		int intSomaNotas =  intNota + intNota2 +intMediaPonderada3 + intMediaPonderada4;
		
		int intMediaPonderada = intSomaNotasMedias / intSomaNotas;
		System.out.println("Seua média ponderada é: " + intMediaPonderada);
	}

}
