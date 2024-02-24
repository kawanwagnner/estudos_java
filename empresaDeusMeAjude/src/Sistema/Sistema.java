package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Pessoa;

public class Sistema {

	static public void menu() {
		System.out.println("");
		System.out.println("===================");
		System.out.println("1 - Cadastar ");
		System.out.println("2 - Listar Usuários");
		System.out.println("3 - Deletar Usuário");
		System.out.println("4 - Atualizar Dados");
		System.out.println("5 - Atualizar Dados");
		System.out.println("6 - Atualizar Dados");
		System.out.println("10 - Sair do Sistema");
		System.out.println("===================");
	}

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		String nome = "", planoDeSaude = "", direitoVR = null, direitoVA = null, direitoVT = null;
		int intSalarioBruto = 0, intDependentes = 0, intValorPlanoDeSaude = 0;
		boolean vr = false, va = false, vt = false;
		boolean validador = false;

		String newName = "";
		int NewSalario = 0, newDependentes = 0;

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
						System.out.println("Qual é nome do funcionário?");
						nome = input.next();
					} catch (Exception e) {
						System.err.println("Por favor digite um valor válido!!");
						input.nextLine();
					}

				} while (nome == "");

				do {
					try {
						System.out.println("Qual é o salário Bruto?");
						intSalarioBruto = input.nextInt();
					} catch (Exception e) {
						System.err.println("Por favor digite um valor válido!!");
					}

					if (intSalarioBruto < 0) {
						System.err.println("Somente valores positivos são permitidos!");
					}
				} while (intSalarioBruto < 0);

				do {
					try {
						System.out.println("Quantos dependetes o funcionário tem?");
						intDependentes = input.nextInt();
					} catch (Exception e) {
						System.err.println("Por favor digite um valor válido!!");
					}

					if (intDependentes < 0) {
						System.err.println("Somente valores positivos são permitidos!");
					}
				} while (intDependentes < 0);

				do {
					try {
						System.out.println("Tem direito á VR? S/N");
						direitoVR = input.next();
						if (direitoVR.equalsIgnoreCase("S")) {
							vr = true;
							validador = true;
						} else if (direitoVR.equalsIgnoreCase("N")) {
							vr = false;
							validador = true;
						} else {
							System.err.println("Digite um valor válido");
							System.out.println("");
						}

					} catch (Exception e) {
						System.err.println("Por favor digite um valor válido!!");
						input.nextLine();
					}

				} while (validador == false);

				do {
					try {
						System.out.println("Tem direito á VA? S/N");
						direitoVA = input.next();
						if (direitoVA.equalsIgnoreCase("S")) {
							va = true;
							validador = true;
						} else if (direitoVA.equalsIgnoreCase("N")) {
							va = false;
							validador = true;
						} else {
							System.err.println("Digite um valor válido");
							System.out.println("");
						}

					} catch (Exception e) {
						System.err.println("Por favor digite um valor válido!!");
						input.nextLine();
					}

				} while (validador == false);

				do {
					try {
						System.out.println("Tem direito á VT? S/N");
						direitoVT = input.next();
						if (direitoVT.equalsIgnoreCase("S")) {
							vt = true;
							validador = true;
						} else if (direitoVT.equalsIgnoreCase("N")) {
							vt = false;
							validador = true;
						} else {
							System.err.println("Digite um valor válido");
							System.out.println("");
						}

					} catch (Exception e) {
						System.err.println("Por favor digite um valor válido!!");
						input.nextLine();
					}

				} while (validador == false);

				do {

					try {
						System.out.println(
								"Qual é o plano de saúde do funcionário? B = Básico, P = Premium, PPP = Platinum Premium Plus");
						planoDeSaude = input.next();
						if (planoDeSaude.equalsIgnoreCase("B")) {
							intValorPlanoDeSaude = 100;
							validador = true;
						} else if (planoDeSaude.equalsIgnoreCase("P")) {
							intValorPlanoDeSaude = 250;
							validador = true;
						} else if (planoDeSaude.equalsIgnoreCase("PPP")) {
							intValorPlanoDeSaude = 500;
							validador = true;
						} else {
							System.err.println(
									"Valor inválido, por favor digite somente um dos valores pedidos à cima!!");
						}

					} catch (Exception e) {
						System.err.println("Por favor digite um valor válido!!");
					}


				} while (validador == false);

				Pessoa pessoa = new Pessoa(nome, intSalarioBruto, intDependentes, vr, va, vt, planoDeSaude);
				pessoas.add(pessoa);

			}
			case 2: {
				pessoas.forEach(item -> {
					if (!(item.getNome() == "" && item.getPlanoDeSaude() == "")) {
						System.out.println("");
						System.out.println("#######################");
						System.out.println("Item da Lista: ");
						System.out.println("#######################");
						System.out.println("Nome do funcionário: " + item.getNome());
						System.out.println("Salário Bruto: " + item.getSalarioBruto());
						System.out.println("Nº de Dependetes: " + item.getNumeroDependentes());
						System.out.println("Plano de Saúde: " + item.getPlanoDeSaude());
						System.out.println("VR: " + item.isVr());
						System.out.println("VA: " + item.isVa());
						System.out.println("VT: " + item.isVt());
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
				if (pessoas.get(index) != null) {
					System.out.println("Usuário Encontrado.");
					System.out.println("");

					System.out.println("");
					System.out.println("#######################");
					System.out.println("Deletando...");
					System.out.println("#######################");
					pessoas.get(index).setNome("");
					pessoas.get(index).setSalarioBruto(0);
					pessoas.get(index).setNumeroDependentes(0);
					pessoas.get(index).setPlanoDeSaude("");
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

				if (pessoas.get(index) != null) {
					System.out.println("");
					System.out.println("#######################");
					System.out.println("Item da Lista Atualizado: ");
					System.out.println("#######################");

					do {
						System.out.println("Novo nome do funcionário: ");
						try {
							newName = input.next();
							pessoas.get(index).setNome(newName);
						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido.");
							input.nextLine();
						}
					} while (newName == "");

					do {
						System.out.println("Novo Salário Bruto: ");
						try {
							NewSalario = input.nextInt();
							if (NewSalario < 0) {
								System.err.println("Por favor, insira somente valores positivos.");
							} else {
								pessoas.get(index).setSalarioBruto(NewSalario);
							}
						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido.");
							input.nextLine();
						}
					} while (NewSalario <= 0);

					do {
						System.out.println("Digite o novo Nº de dependetes: ");
						try {
							newDependentes = input.nextInt();

							if (newDependentes < 0) {
								System.err.println("Por favor, insira somente valores positivos.");
							} else {
								pessoas.get(index).setNumeroDependentes(newDependentes);
							}

						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido.");
							input.nextLine();
						}
					} while (newDependentes <= 0);

					do {
						System.out.println("Tem direito á VR? S/N");
						try {
							direitoVR = input.next();
							if (direitoVR.equalsIgnoreCase("S")) {
								vr = true;
								System.out.println("SET TRUEE");
							} else if (direitoVR.equalsIgnoreCase("N")) {
								vr = false;
								System.out.println("SET FALSEE");
							}

						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido!!");
							input.nextLine();
						}

//						if (!(direitoVR.equalsIgnoreCase("S") || direitoVR.equalsIgnoreCase("N"))) {
//							System.err.println("Por favor, digite somente um dos valores requisitados!!");
//						}

					} while (!(direitoVR.equalsIgnoreCase("S")) || !(direitoVR.equalsIgnoreCase("N")));

					do {

						try {
							System.out.println("Tem direito á VA? S/N");
							direitoVA = input.next();
							if (direitoVA.equalsIgnoreCase("S")) {
								va = true;
							} else if (direitoVA.equalsIgnoreCase("N")) {
								va = false;
							} else {
								System.err.println(
										"Valor inválido, por favor digite somente um dos valores pedidos à cima!!");
							}

						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido!!");
						}

//						if (!(direitoVA.equalsIgnoreCase("S") || direitoVA.equalsIgnoreCase("N"))) {
//							System.err.println("Por favor, digite somente um dos valores requisitados!!");
//						}

					} while (!(direitoVA.equalsIgnoreCase("S")) || !(direitoVA.equalsIgnoreCase("N")));

					do {

						try {
							System.out.println("Tem direito á VT? S/N");
							direitoVT = input.next();
							if (direitoVT.equalsIgnoreCase("S")) {
								vt = true;
							} else if (direitoVT.equalsIgnoreCase("N")) {
								vt = false;
							} else {
								System.err.println(
										"Valor inválido, por favor digite somente um dos valores pedidos à cima!!");
							}

						} catch (Exception e) {
							System.err.println("Por favor digite um valor válido!!");
						}

//						if (!(direitoVT.equalsIgnoreCase("S") || direitoVT.equalsIgnoreCase("N"))) {
//							System.err.println("Por favor, digite somente um dos valores requisitados!!");
//						}

					} while (direitoVT.equalsIgnoreCase("S") || direitoVT.equalsIgnoreCase("N"));

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
