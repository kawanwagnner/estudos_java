package Desafios_25_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafios_2 {
	
	public static void main(String[] args) {

		DecimalFormat formato = new DecimalFormat("#.##");
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Qua é o valor unitário??");
		int intValorUnd = input.nextInt();
		
		System.out.println("Qual moeda você deseja converter? Dolar = D / Euro = E");
		String strCalc = input.next();
		
		if (strCalc.equalsIgnoreCase("D")) {
			Double dblDolar = intValorUnd / 4.93;
			System.out.println("Seu valor unitário convertido para Dolar é: " + formato.format(dblDolar));
		} else if (strCalc.equalsIgnoreCase("E")) {
			Double dblEuro = intValorUnd / 5.34;
			System.out.println("Seu valor unitário convertido para Euro é: " + formato.format(dblEuro));
		} else {
			System.err.println("Digite um valor válido! - Dolar = D; OU Euro = E;");
		}
		
		input.close();
	}
	
}
