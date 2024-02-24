package Sistema;

import java.util.Scanner;

import models.Usuario;

public class Sistema {

	public static void main(String[] args) {
//		Usuario meuUsuario = new Usuario("Garfild Santana", 202, "105.026.604-81");
		Usuario[] usuarios = new Usuario[3];
//		usuarios[0] = meuUsuario;
//		System.out.println(usuarios[0]);

		for (int i = 0; i < usuarios.length; i++) {
			Usuario u = new Usuario("", 0, "");
			usuarios[i] = u;
		}

		Scanner input = new Scanner(System.in);
		do {
			int escolha = 0;
			int escolhaArray = 0;

			menu();
			escolha = input.nextInt();

			switch (escolha) {
			case 1: {
				// Criar User
				System.out.println("Criando User; por gentileza:");
				System.out.println("");

				System.out.println("Qual é o seu nome?");
				String strNome = input.next();

				System.out.println("Qual é a sua idade?");
				int intIdade = input.nextInt();

				System.out.println("Qual é o seu CPF?");
				String strCPF = input.next();

				System.out.println("Qual é escolha do Array?");
				escolhaArray = input.nextInt();

				Usuario a = new Usuario(strNome, intIdade, strCPF);
				a.exibirDados(strNome, intIdade, strCPF);

				usuarios[escolhaArray] = a;

				continue;
			}
			case 2: {
				for (int i = 0; i < usuarios.length; i++) {
					System.out.println("");
					System.out.println("#######################");
					System.out.println("Iniciando Lista: ");
					System.out.println("#######################");
					System.out.println(i + ". Nome: " + usuarios[i].getNome());
					System.out.println(" Idade: " + usuarios[i].getIdade());
					System.out.println(" CPF: " + usuarios[i].getCPF());
					System.out.println("#######################");
					continue;
				}
			}
			case 3: {
				// Deletar Usuario
				System.out.println("Listar Usuários");
				System.out.println("##############");

				for (int i = 0; i < usuarios.length; i++) {
					System.out.println(i + " Nome:" + usuarios[i].getNome());
					System.out.println(" Idade:" + usuarios[i].getIdade());
					System.out.println(" CPF:" + usuarios[i].getCPF());
					System.out.println(" ");
				}

				System.out.println("Digite o número do usuário que deseja deletar:");
				int numUsuarioDeletar = input.nextInt();

				if (numUsuarioDeletar >= 0 && numUsuarioDeletar < usuarios.length) {
					usuarios[numUsuarioDeletar] = new Usuario("", 0, "");
					System.out.println("Usuário deletado com sucesso!");
				} else {
					System.err.println("Número de usuário inválido.");
				}

				continue;
			}
			case 4: {
				System.out.println("Atualizar usuario");
				System.out.println("##############");
				System.out.println("Qual usuario você quer atualizar ?");
				int posicao = input.nextInt();

				System.out.println(" ");

				System.out.println("O antigo nome é: " + usuarios[posicao].getNome());
				System.out.println("Qual o novo nome ?: ");
				String nome = input.next();
				usuarios[posicao].setNome(nome);

				System.out.println(" ");

				System.out.println("A antiga idade é: " + usuarios[posicao].getIdade());
				System.out.println("Qual a nova idade ?: ");
				int idade = input.nextInt();
				usuarios[posicao].setIdade(idade);

				System.out.println(" ");

				System.out.println("O antigo CPF é: " + usuarios[posicao].getCPF());
				System.out.println("Qual o novo CPF ?: ");
				String cpf = input.next();
				usuarios[posicao].setCPF(cpf);

				System.out.println(" ");

				continue;

			}
			case 9: {
				System.exit(0);
			}
			default:
			}

		} while (true);
	}

	static public void menu() {
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("1 - Cadastar Usuário");
		System.out.println("2 - Listar Usuários");
		System.out.println("3 - Deletar Usuário");
		System.out.println("4 - Atualizar Dados");
		System.out.println("9 - Sair do Sistema");
		System.out.println("==================================================");
	}
}
