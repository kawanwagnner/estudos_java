package banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Bem-Vindo(a)!!");
		Cliente client = new Cliente();
		int operacao;

		Scanner input = new Scanner(System.in);
		System.out.println("Por favor diga-nos, o que deseja fazer? ");
		System.out.println("1 = Criar um conta. -  2 = Apagar sua conta. ");
		operacao = input.nextInt();

		if (operacao == 1) {
			client.criarConta();

		} else if (operacao == 2) {
			client.apagarConta();
		} else {
			System.err.println("Entrada inválida, permitidos somente as opções: 1 ou 2.");
			System.exit(0);
		}
		
	}

}
