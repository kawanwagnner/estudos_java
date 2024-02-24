package baisc;

import java.util.Scanner;

public class baisc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nome;
		int nasc;
		Double salario;

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite seu nome: ");
		nome = sc.nextLine();

		System.out.println("Por favor, digite sua data de Nasc.: ");
		nasc = sc.nextInt();

		System.out.println("Por favor, digite seu salário: ");
		salario = sc.nextDouble();
		sc.nextLine();
		
		sc.close();
		
		Double salarioAnual = salario * 12;
		int idade = 2023 - nasc;
		
		System.out.printf("O seu nome é %s, você tem %d anos e recebe R$ %.2f reais por ano.%n", nome, idade, salarioAnual);
		
		System.exit(0);
		
		
	}

}
