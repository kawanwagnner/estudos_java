package atividade;

import java.util.Scanner;

public class att {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nome;
		Double salarioPessoa;
		Double diasTrab;
		Double mes;
		Double ferias;

		Scanner sc = new Scanner(System.in);
		System.out.println("Seja Bem-Vindo(a)");
		System.out.println("");
		
		System.out.print("Por favor, digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.print("Quanto você recebe atualmente? ");
		salarioPessoa = sc.nextDouble();

		System.out.print("Quantos dias tem o mes atual? ");
		mes = sc.nextDouble();
		
		System.out.print("Quantos dias trabalhados? ");
		diasTrab = sc.nextDouble();
		
		System.out.print("Quantos dias você terá de ferias? ");
		ferias = sc.nextDouble();
		
		sc.close();
		
		System.out.println("");
		String line = "=";
		int x = 0;
		for (int i = 100; x < i; x++) {
			System.out.printf(line);
			
		};
		System.out.println("");
		System.out.println("");
		
		Double diariaSalario = salarioPessoa / mes;
		Double PropSalario = diariaSalario * diasTrab;
		
		Double feriasPessoa = diariaSalario * ferias;
		Double tercoFerias = feriasPessoa / 3;
		Double totalFerias = feriasPessoa + tercoFerias;
		
		Double impostoINSS;
		Double impostoRenda;
		
		System.out.printf("O seu nome é %s, você recebe por dia R$ %.2f e seu salário proporcional é R$ %.2f. %n", nome, diariaSalario, PropSalario);
		System.out.printf("O valor das suas ferias é %.2f. %n", totalFerias);
		
		if (salarioPessoa <= 1320.00) {
			impostoINSS = salarioPessoa - 0.075 * 100;
			System.out.printf("Para seu salário o desconto do INSS é de 0,075; seu total liquído é R$ %.2f reais. %n", impostoINSS);
		} else if(salarioPessoa >= 1320.01 && salarioPessoa <= 2571.29) {
			impostoINSS = salarioPessoa - 0.09 * 100;
			System.out.printf("Para seu salário o desconto do INSS é de 0,09; seu total liquído é R$ %.2f reais. %n", impostoINSS);
		} else if(salarioPessoa >= 2571.30 && salarioPessoa <= 3856.94) {
			impostoINSS = salarioPessoa - 0.12 * 100;
			System.out.printf("Para seu salário o desconto do INSS é de 0,12; seu total liquído é R$ %.2f reais. %n", impostoINSS);
		} else {
			impostoINSS = salarioPessoa - 0.14 * 100;
			System.out.printf("Para seu salário o desconto do INSS é de 0,14; seu total liquído é R$ %.2f reais. %n", impostoINSS);
		}
		
		
		
		if (salarioPessoa <= 2112.00) {
			impostoRenda = impostoINSS - 0;
			System.out.printf("Para seu salário o desconto do Imposto de Renda é de 0,00 reais. %n", impostoINSS);
			
		} else if (salarioPessoa >= 2112.01 && salarioPessoa <= 2826.65) {
			impostoRenda = impostoINSS - 0.075 * 100;
			System.out.printf("Para seu salário o desconto do Imposto de Renda é de 0,75 (Obs: Imposto será cobrado sobre o DESC. do INSS); seu total liquído é R$ %.2f reais. %n", impostoRenda);
			
		} else if(salarioPessoa >= 2826.66 && salarioPessoa <= 3751.06) {
			impostoRenda = impostoINSS - 0.15 * 100;
			System.out.printf("Para seu salário o desconto do Imposto de Renda é de 0,15 (Obs: Imposto será cobrado sobre o DESC. do INSS); seu total liquído é R$ %.2f reais. %n", impostoRenda);

		} else if(salarioPessoa >= 3751.07 && salarioPessoa <= 4664.68) {
			impostoRenda = impostoINSS - 0.225 * 100;
			System.out.printf("Para seu salário o desconto do Imposto de Renda é de 0,225 (Obs: Imposto será cobrado sobre o DESC. do INSS); seu total liquído é R$ %.2f reais. %n", impostoRenda);

		} else {
			impostoRenda = impostoINSS - 0.270 * 100;
			System.out.printf("Para seu salário o desconto do Imposto de Renda é de 0,270 (Obs: Imposto será cobrado sobre o DESC. do INSS); seu total liquído é R$ %.2f reais. %n", impostoRenda);
		}
		
		
		System.exit(0);
		
		
	}

	
}
