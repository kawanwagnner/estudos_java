package desafioFuncionarios;

import java.util.Scanner;

public class desafioFuncionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite quantos funcionários você tem: ");
        int funcionarios = sc.nextInt();
        sc.nextLine();

        String[] nomesFuncionarios = new String[funcionarios];
        int[] qtdMesesDeTrabalho = new int[funcionarios];

        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Qual é o nome do funcionário? ");
            nomesFuncionarios[i] = sc.nextLine();

            System.out.println("Quantos meses o funcionário trabalhou? ");
            qtdMesesDeTrabalho[i] = sc.nextInt();
            sc.nextLine();
            
            System.out.println("");
        }

        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Nome do funcionário: " + nomesFuncionarios[i]);
            System.out.println("Meses trabalhados: " + qtdMesesDeTrabalho[i] + " meses.");

            if (qtdMesesDeTrabalho[i] <= 12) {
                System.out.println("O funcionário NÃO tem direito a férias.");
            } else {
                System.out.println("Com " + qtdMesesDeTrabalho[i] + " meses de trabalho o funcionário TEM direito a férias.");
            }
            System.out.println("");

		}

		System.exit(0);

	}

}
