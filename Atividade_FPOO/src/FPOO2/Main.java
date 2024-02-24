package FPOO2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo(a)");
		System.out.println("");
		
		System.out.println("Por gentileza, Qual seu nome? ");
		String nome = input.next();
		
		System.out.println("Certo " + nome + ", qual é seu salário Bruto? ");
		double salarioBruto = input.nextDouble();
		
		System.out.println("Qual é o valor do imposto? ");
		double imposto = input.nextDouble();
		
		Funcionario colaborador = new Funcionario(nome, salarioBruto, imposto);
		colaborador.exibirDados();
		
		System.out.println("");
		System.out.println("Qual a porcetagem do do incremento desejado? ");
		double taxa = input.nextDouble();
		taxa = taxa / 100;
		
		colaborador.aumentoSalario(taxa);

		input.close();
	}
}
