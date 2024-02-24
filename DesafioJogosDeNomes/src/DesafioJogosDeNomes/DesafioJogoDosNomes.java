package DesafioJogosDeNomes;

import java.util.Scanner;

public class DesafioJogoDosNomes {

    public static void main(String[] args) {

        String[] strNomes = {"Maria", "João", "Pedro", "Anastacia", "Gisele", "Cleiton", "Lucas", "José", "Rafael", "Kawan"};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome:");
            String strNomePessoa = sc.nextLine();

            boolean venceu = false;

            try {
                for (String nome : strNomes) {
                    if (strNomePessoa.equalsIgnoreCase(nome)) {
                        System.out.println("\u001B[32mParabéns você acertou!!!");
                        venceu = true;
                        break;
                    }
                }

                if (!venceu) {
                    System.err.println("Você errou! Tente novamente.");
                    System.out.println();
                }
            } catch (Exception e) {
                System.err.println("Ocorreu um erro: " + e.getMessage());
            }
        }

        sc.close();
    }
}