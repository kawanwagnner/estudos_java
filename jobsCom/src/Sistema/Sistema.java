package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Vaga;

public class Sistema {

	static public void menu() {
		System.out.println("");
		System.out.println("===================");
		System.out.println("1 - Cadastar ");
		System.out.println("2 - Listar Usuários");
		System.out.println("3 - Deletar Usuário");
		System.out.println("4 - Atualizar Dados");
		System.out.println("9 - Sair do Sistema");
		System.out.println("===================");
	}

	public static void main(String[] args) {

		ArrayList<Vaga> vagas = new ArrayList<Vaga>();
		int intNewID = 0, intNewSalario = 0, intNewHorario = 0, intNewCandidatos = 0;
		String strNewModelo = "";
		int id = 0, intSalario = 0;
		String strModelo = "";

		Scanner input = new Scanner(System.in);
		do {
			int escolha = 0;
			int intCandidatos = 0;

			menu();
			escolha = input.nextInt();

			switch (escolha) {
			case 1: {
				// Criar CRUD
				System.out.println("Criando User; por gentileza:");
				System.out.println("");

				do {
					try {
						System.out.println("Qual é o ID Vaga?");
						id = input.nextInt();
					} catch (Exception e) {
						System.err.println("Por favor digite um valor válido!!");
						input.nextLine();
					}

					if (id < 0) {
						System.err.println("Somente valores positivos são permitidos!");
					}
				} while (id < 0);

				do {
					try {
						System.out.println("Qual é o salário?");
						intSalario = input.nextInt();
					} catch (Exception e) {
						System.err.println("Por favor digite um valor válido!!");
					}

					if (intSalario < 0) {
						System.err.println("Somente valores positivos são permitidos!");
					}
				} while (intSalario < 0);

				do {
					try {
						System.out.println("Qual é modelo? (P = Presencial / H = HomeOffice) ");
						strModelo = input.next();
					} catch (Exception e) {
						System.err.println("Por favor digite um valor válido!!");
					}

//					if (!(strModelo.equalsIgnoreCase("P") || strModelo.equalsIgnoreCase("H"))) {
//						System.err.println("Por favor, digite somente um dos valores requisitados!!");
//					}
					
				} while (strModelo.equalsIgnoreCase("P") || strModelo.equalsIgnoreCase("H"));

				System.out.println("Qual é o horário da vaga? Ex: 8");
				int intHorario = input.nextInt();

				System.out.println("Quantos candidatos?");
				intCandidatos = input.nextInt();

				Vaga vaga = new Vaga(id, intSalario, strModelo, intHorario, intCandidatos);
				vagas.add(vaga);

			}
			case 2: {
				vagas.forEach(item -> {
					if (!(item.getModelo() == "" && item.getHorario() == 0)) {
						System.out.println("");
						System.out.println("#######################");
						System.out.println("Item da Lista: ");
						System.out.println("#######################");
						System.out.println("ID da vaga: " + item.getIdVaga());
						System.out.println("Salário: " + item.getSalario());
						System.out.println("Modelo: " + item.getModelo());
						System.out.println("Horário: " + item.getHorario() + "hrs");
						System.out.println("Candidatos: " + item.getCandidatos());
						System.out.println("#######################");
					} else {
						System.out.println("");
						System.out.println("*Item Apagado :(");
					}
				});
				continue;
			}
			case 3: {
				// Deletar Usuario
				System.out.println("");
				System.out.println("Digite o número do usuário que deseja deletar:");
				int index = input.nextInt();

				// procura o index
				if (vagas.get(index) != null) {
					System.out.println("Usuário Encontrado.");
					System.out.println("");

					System.out.println("");
					System.out.println("#######################");
					System.out.println("Deletando...");
					System.out.println("#######################");
					vagas.get(index).setIdVaga(0);
					vagas.get(index).setSalario(0);
					vagas.get(index).setModelo("");
					vagas.get(index).setHorario(0);
					vagas.get(index).setCandidatos(0);
					System.out.println("#######################");
					System.out.println("Usuário Deletado com Sucesso!!");
					System.out.println("#######################");

					System.out.println("");
				} else {
					System.err.println("Usuário não existe!");
				}
				continue;
			}
			case 4: {
				System.out.println("");
				System.out.println("Atualizar Usuário: ");
				System.out.println("##############");
				System.out.println("Qual usuário você quer atualizar ?");
				int index = input.nextInt();

				if (vagas.get(index) != null) {
					System.out.println("");
					System.out.println("#######################");
					System.out.println("Item da Lista Atualizado: ");
					System.out.println("#######################");

					do {
						System.out.println("Novo ID da vaga: ");
						try {
							intNewID = input.nextInt();
							if (intNewID < 0) {
								System.err.println("Por favor, insira somente valores positivos.");
							} else {
								vagas.get(index).setIdVaga(intNewID);
							}
						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido.");
							input.nextLine();
						}
					} while (intNewID <= 0);

					do {
						System.out.println("Novo Salário: ");
						try {
							intNewSalario = input.nextInt();
							if (intNewSalario < 0) {
								System.err.println("Por favor, insira somente valores positivos.");
							} else {
								vagas.get(index).setSalario(intNewSalario);
							}
						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido.");
							input.nextLine();
						}
					} while (intNewSalario <= 0);

					do {
						System.out.println("Qual é modelo? (P = Presencial / H = HomeOffice)");
						try {
							strNewModelo = input.next();

							if (strNewModelo.equalsIgnoreCase("P") || strNewModelo.equalsIgnoreCase("H")) {
								vagas.get(index).setModelo(strNewModelo);
							} else {
								System.err.println("Digite somente um dos valores indicados!");
							}
						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido.");
							input.nextLine();
						}
					} while (strNewModelo == "");

					do {
						System.out.println("Novo Horário: ");
						try {
							intNewHorario = input.nextInt();

							if (intNewHorario < 0) {
								System.err.println("Por favor, insira somente valores positivos.");
							} else {
								vagas.get(index).setHorario(intNewHorario);
							}

						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido.");
							input.nextLine();
						}
					} while (intNewHorario <= 0);

					do {
						System.out.println("Novo Nº de Candidatos: ");
						try {
							intNewCandidatos = input.nextInt();

							if (intNewCandidatos < 0) {
								System.err.println("Por favor, insira somente valores positivos.");
							} else {
								vagas.get(index).setCandidatos(intNewCandidatos);
								System.out.println("#######################");
							}
						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido.");
							input.nextLine();
						}
					} while (intNewCandidatos <= 0);

				}
				continue;

			}
			case 9: {
				System.exit(0);
			}
			default:
				System.out.println("");
				System.err.println("Número inválido, tente novamente: ");
				System.out.println("");
				continue;
			}

		} while (true);

	}

}
