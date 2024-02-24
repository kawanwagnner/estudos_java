package Desafios_;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
//		Elabore um algoritmo que receba o montante de um investimento e a taxa de juros anual, calcule e mostre o rendimento mensal e o valor total após um ano.

//		Montante = Valor Inicial * (1 + Taxa de Juros)^Tempo.
		DecimalFormat formato = new DecimalFormat("#.##");
		
		double dblMontante;
		double dblCapital;
		double dblTaxaJuros;
		double dblTempo;

		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, bem vindo(a)! Por favor, digite os dados para começar:");
		System.out.println("");

		System.out.println("Qual é o capital inicial?");
		dblCapital = sc.nextDouble();
		
		System.out.println("Qual é a taxa de juros?");
		dblTaxaJuros = sc.nextDouble();
		
		System.out.println("Qual é o tempo de aplicação?");
		dblTempo = sc.nextDouble();

		dblMontante = dblCapital * Math.pow(1 + dblTaxaJuros, dblTempo);
		
		System.out.println("Seu rendimento será de: " + formato.format(dblMontante));
	}

}
