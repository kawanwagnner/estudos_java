package atividade_17_10_23;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atividade_17_10_23 {

	public static void main(String[] args) {
		/*
		 * 1. Escreva um programa que, com base em uma temperatura em graus celsius, a
		 * converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
		 * seguindo as fórmulas:
		 * 
		 * K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67 F = C * 1.8 + 32;
		 */

		DecimalFormat formato = new DecimalFormat("#.##");

		Double dblValorCelsius, dblKelvin, dblReaumur, dblRankine, dblFahrenheit;

		Scanner input = new Scanner(System.in);
		System.out.println("Seja Bem-Vindo(a)");
		System.out.println("");

		System.out.print("Por favor, digite o valor em celsius: ");
		dblValorCelsius = input.nextDouble();

		dblKelvin = dblValorCelsius + 273.15;
		System.out.println("Valor em Kelvin (K): " + formato.format(dblKelvin));

		dblReaumur = dblValorCelsius * 0.8;
		System.out.println("Valor em Réaumur (Re): " + formato.format(dblReaumur));

		dblRankine = dblValorCelsius * 1.8 + 32 + 459.67;
		System.out.println("Valor em Rankine (Ra): " + formato.format(dblRankine));

		dblFahrenheit = dblValorCelsius * 1.8 + 32;
		System.out.println("Valor em Fahrenheit (F): " + formato.format(dblFahrenheit));

	}

}
