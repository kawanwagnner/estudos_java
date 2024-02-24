package Desafios_;

import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
//		7. Altere o algoritmo para calcular tanto a área quanto o volume de uma esfera, recebendo seu raio como entrada.

		double dblVolume;
		double dblRaio;
		double dblPi = 3.14;

		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, bem vindo(a)! Por favor, digite os dados para começar:");
		System.out.println("");

		System.out.println("Qual é o raio do retângulo?");
		dblRaio = sc.nextDouble();

		dblVolume = (4 * dblPi * Math.pow(dblRaio, 3)) / 3;
		
		System.out.println("O volume da sua esfera é: " + dblVolume + "cm");
	}

}