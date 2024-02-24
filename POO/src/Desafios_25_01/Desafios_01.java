package Desafios_25_01;

import java.util.Scanner;

public class Desafios_01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Qua é o valor unitário??");
		int intValorUnd = input.nextInt();
		
		System.out.println("Qual cálculo você deseja realizar? Kelvin = K / Fahrenheit = F");
		String strCalc = input.next();
		
		if (strCalc.equalsIgnoreCase("K")) {
			Double dblCalcKelvin = intValorUnd + 273.15;
			System.out.println("Seu valor unitário convertido para Fahrenheit é: " + dblCalcKelvin);
		} else if (strCalc.equalsIgnoreCase("F")) {
			Double dblCalcFahrenheit = intValorUnd * 1.8 + 32;
			System.out.println("Seu valor unitário convertido para Fahrenheit é: " + dblCalcFahrenheit);
		} else {
			System.err.println("Digite um valor válido! - Celcius = C; OU Fahrenheit = F;");
		}
		
		input.close();
	}
	
}
