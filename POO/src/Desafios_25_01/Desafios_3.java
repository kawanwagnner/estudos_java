package Desafios_25_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafios_3 {

	public static void main(String[] args) {

		DecimalFormat formato = new DecimalFormat("#.##");

		Scanner input = new Scanner(System.in);

		System.out.println("Qua é o valor unitário??");
		int intValorUnd = input.nextInt();

		if (intValorUnd % 1 == 0 && intValorUnd % intValorUnd == 0) {
			for (int i = 0; i < 10; i++) {
				int resto = intValorUnd % i;
				if (resto == 0) {
					System.out.println(intValorUnd + " Não é um número primo.");
				}
			}

		} else {
			System.out.println(intValorUnd + " é um número primo.");
		}

		input.close();
	}

}
