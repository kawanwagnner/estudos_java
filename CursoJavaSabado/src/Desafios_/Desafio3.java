package Desafios_;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		// 2. Desenvolva um algoritmo que receba quatro notas e seus respectivos pesos,
		// calcule e mostre a média ponderada.

		String strNome;
		int intSalario;
		double dblAumento = 30 * 100;

		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, bem vindo(a)! Por favor, digite os dados para começar:");
		System.out.println("");

		System.out.println("Qual é o seu nome?");
		strNome = sc.next();
		
		System.out.println("Qual é o seu salário?");
		intSalario = sc.nextInt();

		double dblValorAumento = dblAumento / 100;
		double dblSalrioBruto = dblValorAumento + intSalario;

		System.out.println("");
		System.out.println("Parábens " + strNome + "! com um aumento de 30%, seu novo salário é: " + dblSalrioBruto);
	}

}
