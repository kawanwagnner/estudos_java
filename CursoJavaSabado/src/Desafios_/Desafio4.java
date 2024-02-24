package Desafios_;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		// 2. Desenvolva um algoritmo que receba quatro notas e seus respectivos pesos,
		// calcule e mostre a média ponderada.

		String strNome;
		int intSalarioBruto;

		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, bem vindo(a)! Por favor, digite os dados para começar:");
		System.out.println("");

		System.out.println("Qual é o seu nome?");
		strNome = sc.next();
		
		System.out.println("Qual é o seu salário bruto?");
		intSalarioBruto = sc.nextInt();

		double dblValorAumento = intSalarioBruto * 0.12;
		double dblValorDesconto = intSalarioBruto * 0.18;
		
		System.out.println("");
		System.out.println("Parábens " + strNome + "! com um aumento de 12%, seu novo salário é: " + dblValorAumento);
		System.out.println(strNome + "! com um desconto de 18% sobre seu salário bruto, seu novo salário é: " + dblValorDesconto);
		
		double dblSalarioFinal = intSalarioBruto + dblValorAumento - dblValorDesconto;
		System.out.println("Seu salário final é: " + dblSalarioFinal);
	}

}
