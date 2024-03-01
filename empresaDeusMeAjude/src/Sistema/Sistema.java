package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Pessoa;

public class Sistema {

	// Método para exibir o menu
	static public void menu() {
		System.out.println("");
		System.out.println("===================");
		System.out.println("1 - Cadastrar ");
		System.out.println("2 - Listar Usuários");
		System.out.println("3 - Deletar Usuário");
		System.out.println("4 - Atualizar Dados");
		System.out.println("5 - Informações Únicas");
		System.out.println("6 - Calcular salário líquido");
		System.out.println("10 - Sair do Sistema");
		System.out.println("===================");
	}

	public static void main(String[] args) {

		// Lista para armazenar objetos Pessoa
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		String nome = "", planoDeSaude = "N/D", direitoVR = null, direitoVA = null, direitoVT = null;
		double dblSalarioBruto = 0;
		int intDependentes = 0;
		boolean vr = false, va = false, vt = false;
		boolean validador = false;

		String newName = "";
		int newSalario = 0, newDependentes = 0;

		Scanner input = new Scanner(System.in);

		do {
			int escolha = 0;
			int intCandidatos = 0;

			menu();
			escolha = input.nextInt();

			switch (escolha) {
			case 1: {
				// Cadastrar Pessoa
				System.out.println("Cadastrando Usuário:");
				System.out.println("");

				validador = false;
				do {
					System.out.println("Qual é o nome do funcionário?");
					nome = input.next();
					try {
						if (Pessoa.isName(nome)) {
							validador = true;
						} else {
							System.err.println("Por favor, digite um valor válido. Números não são permitidos!!");
							nome = "";
						}
					} catch (Exception e) {
						System.err.println("Precisamos de um valor válido!!");
						System.err.println("[ERRO!!] Por favor, reinicie o Sistema e tente novamente :(");
						System.exit(0);
					}

				} while (validador == false);

				do {
					try {
						System.out.println("Qual é o salário Bruto?");
						dblSalarioBruto = input.nextDouble();
					} catch (Exception e) {
						System.err.println("Precisamos de um valor válido!!");
						System.err.println("[ERRO!!] Por favor, reinicie o Sistema e tente novamente :(");
						System.exit(0);
					}

					if (dblSalarioBruto < 500) {
						System.err
								.println("Somente valores positivos são permitidos e maior ou igual a R$ 500 reais!!");
					}
				} while (dblSalarioBruto < 500);

				validador = false;
				do {
					try {
						System.out.println("Quantos dependentes o funcionário tem?");
						intDependentes = input.nextInt();
						if (!(intDependentes >= 0 && intDependentes <= 75)) {
							System.err.println(
									"Somente valores positivos são permitidos e menor que 75 dependentes são permitidos!");
						} else {
							validador = true;
						}
					} catch (Exception e) {
						System.err.println("Precisamos de um valor válido!!");
						System.err.println("[ERRO!!] Por favor, reinicie o Sistema e tente novamente :(");
						System.exit(0);
					}

				} while (!validador);

				validador = false;
				do {
					try {
						System.out.println("Tem direito à VR? S/N");
						direitoVR = input.next();
						if (direitoVR.equalsIgnoreCase("S")) {
							vr = true;
							direitoVR = "Sim";
							validador = true;
						} else if (direitoVR.equalsIgnoreCase("N")) {
							vr = false;
							direitoVR = "Não";
							validador = true;
						} else {
							System.err.println("Digite um valor válido");
							System.out.println("");
						}

					} catch (Exception e) {
						System.err.println("Por favor, digite um valor válido!!");
						input.nextLine();
					}

				} while (!validador);

				validador = false;
				do {
					try {
						System.out.println("Tem direito à VA? S/N");
						direitoVA = input.next();
						if (direitoVA.equalsIgnoreCase("S")) {
							va = true;
							direitoVA = "Sim";
							validador = true;
						} else if (direitoVA.equalsIgnoreCase("N")) {
							va = false;
							direitoVA = "Não";
							validador = true;
						} else {
							System.err.println("Digite um valor válido");
							System.out.println("");
						}

					} catch (Exception e) {
						System.err.println("Por favor, digite um valor válido!!");
						input.nextLine();
					}

				} while (!validador);

				validador = false;
				do {
					try {
						System.out.println("Tem direito à VT? S/N");
						direitoVT = input.next();
						if (direitoVT.equalsIgnoreCase("S")) {
							vt = true;
							direitoVT = "Sim";
							validador = true;
						} else if (direitoVT.equalsIgnoreCase("N")) {
							vt = false;
							direitoVT = "Não";
							validador = true;
						} else {
							System.err.println("Digite um valor válido");
							System.out.println("");
						}

					} catch (Exception e) {
						System.err.println("Por favor, digite um valor válido!!");
						input.nextLine();
					}

				} while (!validador);

				validador = false;
				String direitoPlanoDeSaude = "";
				do {

					try {
						System.out.println("O funcionário tem direito à plano de saúde? S/N");
						direitoPlanoDeSaude = input.next();
						if (direitoPlanoDeSaude.equalsIgnoreCase("S")) {
							direitoPlanoDeSaude = "Sim";
							do {
								System.out.println("Qual é o plano de saúde do funcionário? ");
								System.out.println("* B = Básico");
								System.out.println("* P = Premium");
								System.out.println("* PPP = Platinum Premium Plus");
								planoDeSaude = input.next();

								if (planoDeSaude.equalsIgnoreCase("B")) {
									planoDeSaude = "Básico";
									validador = true;
								} else if (planoDeSaude.equalsIgnoreCase("P")) {
									planoDeSaude = "Premium";
									validador = true;
								} else if (planoDeSaude.equalsIgnoreCase("PPP")) {
									planoDeSaude = "Platinum Premium Plus";
									validador = true;
								} else {
									System.err.println(
											"Valor inválido, por favor, digite somente um dos valores pedidos acima!!");
								}
							} while (!validador);
						} else if (direitoPlanoDeSaude.equalsIgnoreCase("N")) {
							direitoPlanoDeSaude = "Não";
							validador = true;
							continue;
						} else {
							System.err.println(
									"Valor inválido, por favor, digite somente um dos valores pedidos acima!!");
						}

					} catch (Exception e) {
						System.err.println("Por favor, digite um valor válido!!");
					}

				} while (!validador);

				// Criar objeto Pessoa e adicionar à lista
				Pessoa pessoa = new Pessoa(nome, dblSalarioBruto, intDependentes, direitoVR, vr, direitoVA, va,
						direitoVT, vt, planoDeSaude, direitoPlanoDeSaude);
				pessoas.add(pessoa);
				break;
			}
			case 2: {
				// Listar Usuários
				pessoas.forEach(item -> {
					if (!(item.getNome().equals("") && item.getDireitoPlanoDeSaude().equals(""))) {
						System.out.println("");
						System.out.println("#######################");
						System.out.println("Item da Lista: ");
						System.out.println("#######################");
						System.out.println("Nome do funcionário: " + item.getNome());
						System.out.println("Salário Bruto: " + item.getSalarioBruto());
						System.out.println("Nº de Dependentes: " + item.getNumeroDependentes());
						System.out.println("Tem direito à Plano de Saúde: " + item.getDireitoPlanoDeSaude());
						System.out.println("Plano de Saúde: " + item.getPlanoDeSaude());
						System.out.println("VR: " + item.getDireitoVR());
						System.out.println("VA: " + item.getDireitoVA());
						System.out.println("VT: " + item.getDireitoVT());
						System.out.println("#######################");
					} else {
						System.out.println("");
						System.out.println("*Item Apagado :(");
					}
				});
				continue;
			}
			case 3: {
				// Deletar Usuário
				System.out.println("");
				System.out.println("Digite o número do usuário que deseja deletar:");
				int index = input.nextInt();

				// Verifica se o índice existe
				if (index >= 0 && index < pessoas.size()) {
					System.out.println("Usuário Encontrado.");
					System.out.println("");

					System.out.println("");
					System.out.println("#######################");
					System.out.println("Deletando...");
					System.out.println("#######################");
					// Remove as informações do usuário
					pessoas.get(index).setNome("");
					pessoas.get(index).setSalarioBruto(0);
					pessoas.get(index).setNumeroDependentes(0);
					pessoas.get(index).setDireitoPlanoDeSaude("");
					pessoas.get(index).setPlanoDeSaude("");
					pessoas.get(index).setVr(false);
					pessoas.get(index).setVa(false);
					pessoas.get(index).setVt(false);
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
				// Atualizar Dados do Usuário
				System.out.println("");
				System.out.println("Atualizar Usuário: ");
				System.out.println("##############");

				try {
					System.out.println("Qual usuário você quer atualizar ?");
					int index = input.nextInt();

					// Verifica se o índice existe
					if (index >= 0 && index < pessoas.size()) {
						System.out.println("");
						System.out.println("#######################");
						System.out.println("Item da Lista Atualizado: ");
						System.out.println("#######################");

						// Atualiza o nome
						do {
							System.out.println("Novo nome do funcionário: ");
							try {
								newName = input.next();
								pessoas.get(index).setNome(newName);
							} catch (Exception e) {
								System.err.println("Por favor, digite um valor válido.");
								input.nextLine();
							}
						} while (newName.equals(""));

						// Atualiza o salário bruto
						do {
							System.out.println("Novo Salário Bruto: ");
							try {
								newSalario = input.nextInt();
								if (newSalario < 0) {
									System.err.println("Por favor, insira somente valores positivos.");
								} else {
									pessoas.get(index).setSalarioBruto(newSalario);
								}
							} catch (Exception e) {
								System.err.println("Por favor, digite um valor válido.");
								input.nextLine();
							}
						} while (newSalario <= 0);

						// Atualiza o número de dependentes
						validador = false;
						do {
							try {
								System.out.println("Digite o novo Nº de dependentes: ");
								intDependentes = input.nextInt();
								if (!(intDependentes >= 0 && intDependentes <= 75)) {
									System.err.println(
											"Somente valores positivos são permitidos e menor que 75 dependentes são permitidos!");
								} else {
									validador = true;
								}
							} catch (Exception e) {
								System.err.println("Precisamos de um valor válido!!");
								System.err.println("[ERRO!!] Por favor, reinicie o Sistema e tente novamente :(");
								System.exit(0);
							}

						} while (!validador);

						validador = false;
						do {
							// Atualiza o direito à VR
							try {
								System.out.println("Tem direito à VR? S/N");
								direitoVR = input.next();
								if (direitoVR.equalsIgnoreCase("S")) {
									pessoas.get(index).setVr(true);
									pessoas.get(index).setDireitoVR("Sim");
									validador = true;
								} else if (direitoVR.equalsIgnoreCase("N")) {
									pessoas.get(index).setVr(false);
									pessoas.get(index).setDireitoVR("Não");
									validador = true;
								} else {
									System.err.println("Digite um valor válido");
									System.out.println("");
								}

							} catch (Exception e) {
								System.err.println("Por favor, digite um valor válido!!");
								input.nextLine();
							}

						} while (!validador);

						validador = false;
						do {
							// Atualiza o direito à VA
							try {
								System.out.println("Tem direito à VA? S/N");
								direitoVA = input.next();
								if (direitoVA.equalsIgnoreCase("S")) {
									pessoas.get(index).setVa(true);
									pessoas.get(index).setDireitoVA("Sim");
									validador = true;
								} else if (direitoVA.equalsIgnoreCase("N")) {
									pessoas.get(index).setVa(false);
									pessoas.get(index).setDireitoVA("Não");
									validador = true;
								} else {
									System.err.println("Digite um valor válido");
									System.out.println("");
								}

							} catch (Exception e) {
								System.err.println("Por favor, digite um valor válido!!");
								input.nextLine();
							}

						} while (!validador);

						validador = false;
						do {
							// Atualiza o direito à VT
							try {
								System.out.println("Tem direito à VT? S/N");
								direitoVT = input.next();
								if (direitoVT.equalsIgnoreCase("S")) {
									pessoas.get(index).setVt(true);
									pessoas.get(index).setDireitoVT("Sim");
									validador = true;
								} else if (direitoVT.equalsIgnoreCase("N")) {
									pessoas.get(index).setVt(false);
									pessoas.get(index).setDireitoVT("Não");
									validador = true;
								} else {
									System.err.println("Digite um valor válido");
									System.out.println("");
								}

							} catch (Exception e) {
								System.err.println("Por favor, digite um valor válido!!");
								input.nextLine();
							}

						} while (!validador);

						validador = false;
						String direitoPlanoDeSaude = "";
						do {
							// Atualiza o direito ao plano de saúde
							try {
								System.out.println("O funcionário continuará com o direito ao plano de saúde? S/N");
								direitoPlanoDeSaude = input.next();
								if (direitoPlanoDeSaude.equalsIgnoreCase("S")) {
									pessoas.get(index).setPlanoDeSaude("Sim");
									do {
										System.out.println("Qual é o plano de saúde do funcionário? ");
										System.out.println("* B = Básico");
										System.out.println("* P = Premium");
										System.out.println("* PPP = Platinum Premium Plus");
										planoDeSaude = input.next();

										if (planoDeSaude.equalsIgnoreCase("B")) {
											pessoas.get(index).setDireitoPlanoDeSaude("Básico");
											validador = true;
										} else if (planoDeSaude.equalsIgnoreCase("P")) {
											pessoas.get(index).setDireitoPlanoDeSaude("Premium");
											validador = true;
										} else if (planoDeSaude.equalsIgnoreCase("PPP")) {
											pessoas.get(index).setDireitoPlanoDeSaude("Platinum Premium Plus");
											validador = true;
										} else {
											System.err.println(
													"Valor inválido, por favor, digite somente um dos valores pedidos acima!!");
										}
									} while (!validador);
								} else if (direitoPlanoDeSaude.equalsIgnoreCase("N")) {
									pessoas.get(index).setPlanoDeSaude("Não");
									validador = true;
									continue;
								} else {
									System.err.println(
											"Valor inválido, por favor, digite somente um dos valores pedidos acima!!");
								}

							} catch (Exception e) {
								System.err.println("Por favor, digite um valor válido!!");
							}

						} while (!validador);

					}
				} catch (Exception e) {
					System.err.println("Precisamos de um valor válido!!");
					System.err.println("[ERRO!!] Por favor, reinicie o Sistema e tente novamente :(");
					System.exit(0);
				}
				continue;

			}

			case 5: {
				// Informações Únicas
				System.out.println("");
				System.out.println("Digite o número do usuário que deseja se informar:");
				int index = input.nextInt();

				if (index >= 0 && index < pessoas.size()) {
					System.out.println("");
					System.out.println("#######################");
					System.out.println("Item Específico: ");
					System.out.println("#######################");
					System.out.println("Nome do funcionário: " + pessoas.get(index).getNome());
					System.out.println("Salário Bruto: " + pessoas.get(index).getSalarioBruto());
					System.out.println("Nº de Dependentes: " + pessoas.get(index).getNumeroDependentes());
					System.out.println("Tem direito à Plano de Saúde: " + pessoas.get(index).getPlanoDeSaude());
					System.out.println("Plano de Saúde: " + pessoas.get(index).getDireitoPlanoDeSaude());
					System.out.println("VR: " + pessoas.get(index).getDireitoVR());
					System.out.println("VA: " + pessoas.get(index).getDireitoVA());
					System.out.println("VT: " + pessoas.get(index).getDireitoVT());
					System.out.println("#######################");
				} else {
					System.err.println("Usuário não encontrado...");
				}

				continue;
			}
			case 6: {
				// Calcular Salário Líquido
				System.out.println("");
				System.out.println("Calcular Salário Líquido: ");
				System.out.println("#######################");
				System.out.println("Digite o número do usuário para calcular o salário líquido:");
				int index = input.nextInt();

				if (index >= 0 && index < pessoas.size()) {
					System.out.println("");
					System.out.println("#######################");
					System.out.println("Calculando Salário Líquido...");
					System.out.println("#######################");

					double salarioLiquido = pessoas.get(index).calcularSalarioLiquido();

					System.out.println("");
					System.out.println("Salário Líquido: R$" + salarioLiquido);
					System.out.println("#######################");
				} else {
					System.err.println("Usuário não encontrado...");
				}

				continue;
			}
			case 10: {
				// Sair do Sistema
				System.out.println("Saindo do Sistema...");
				input.close();
				System.exit(0);
				break;
			}
			default: {
				// Opção Inválida
				System.out.println("Opção Inválida. Tente novamente.");
				continue;
			}
			}

		} while (true);
	}
}