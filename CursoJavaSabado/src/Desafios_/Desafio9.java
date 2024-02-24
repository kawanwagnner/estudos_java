package Desafios_;

import java.util.Scanner;

public class Desafio9 {

	public static void main(String[] args) {
//		9. Desenvolva um algoritmo para resolver a equação \( x^2 - 7x + 10 = 0 \).

		String strNome = "";
		double baskara1, baskara2, delta, raizDelta;

		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, bem vindo(a)! Por favor, digite os dados para começar:");
		System.out.println("");

		System.out.println("Qual é o seu nome?");
		strNome = sc.next();
		
		int a = 1, b = -7, c = 10;

		System.out.println("");
		
		delta = Math.pow(b, 2) - 4 * a * c;
		raizDelta = Math.sqrt(delta);
		
		System.out.println("Seu delta é: " + delta);
		
		baskara1 = (-(b) + raizDelta) / (2*a);
		baskara2 = (-(b) - raizDelta) / (2*a);
		
		System.out.println("Olá "+ strNome + "! Seu valor de S é: " + baskara1 + ", " + baskara2);
//		baskara = Math.pow(intEquacao, intEquacao)
//		System.out.println(strNome + " seu resultado é: ");
	}

}
