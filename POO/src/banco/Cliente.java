package banco;

import java.util.Scanner;

public class Cliente {
	
	// Atributos
	
	String nome;
	String cpf;
	String nasc;
	String tipoConta;

	// Metodos 
	public void criarConta() {
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println("Vamos começar a criar sua conta: ");
		
		System.out.println("Por favor, digite seu nome e sobrenome: ");
		nome = input.nextLine();
		
		System.out.println("Por favor, digite sua data de nascimento: Ex - (xx/xx/xxxx)");
		nasc = input.nextLine();
		
		System.out.println("Por favor, digite seu CPF: Ex - (000.000.000-00)");
		cpf = input.nextLine();
		
		System.out.println("Qual é sie tipo de conta? Ex - (Corrente ou Poupança)");
		tipoConta = input.nextLine();
		
		System.out.println("");
		System.out.println("Olá! "+ nome + "," +" é um prazer recebe-lô.");
		System.out.println("Sua data de nascimento é "+ nasc +".");
		System.out.println("Seu CPF é: " + cpf + ".");
		System.out.println("");
		System.out.println("ATENÇÃO! " + "Verfique e atualize seus Dados antes de proseguir.");
		
		if (tipoConta.equalsIgnoreCase("Corrente")) {
			Corrente tipoDeConta = new Corrente(19.90, 0.00, "Corrente");
			
			System.out.println("Seu banco: " + tipoDeConta);
			System.out.println("Seu tipo de conta é: " + tipoDeConta.tipo + ".");
		} else if (tipoConta.equalsIgnoreCase("Poupança")) {
			Poupanca tipoDeConta = new Poupanca(0.00, 0.10, "Mês", "Poupança");
			
			System.out.println("Seu banco: " + tipoDeConta);
			System.out.println("Seu tipo de conta é: " + tipoDeConta.tipo + ".");
		} else {
			System.err.println("Entrada inválida, permitidos somente os tipos: Corrente e Poupança.");
			System.exit(0);
		}
		
	}
	
	public void apagarConta() {
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println("Se existir, sua conta foi apagado com sucesso! Caso contrário, tente criar uma nova conta antes de executar a exclusão.");
	}
	
	
}
