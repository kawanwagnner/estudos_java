package Desafios_;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
//		6. Modifique o algoritmo para calcular a área de um retângulo, recebendo base e altura como entradas.

		DecimalFormat formato = new DecimalFormat("#.##");
		
		double dblArea;
		double dblBase;
		double dblAltura;

		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, bem vindo(a)! Por favor, digite os dados para começar:");
		System.out.println("");

		System.out.println("Qual é a base do retângulo?");
		dblBase = sc.nextDouble();
		
		System.out.println("Qual é a altura do retângulo?");
		dblAltura = sc.nextDouble();

		dblArea = dblBase * dblAltura;
		
		System.out.println("Sua área é: " + dblArea);
	}

}