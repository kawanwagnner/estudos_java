package atividade2;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		String sexo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Olá! Por favor, digite seu nome: ");
		nome = sc.nextLine();

		System.out.println("Qual é seu sexo? M/F");
		sexo = sc.nextLine().toUpperCase();

		if (sexo.equals("M")) {
			System.out.println("");
			System.out.println("Seja Bem-Vindo " + nome + "!");
			System.out.println("");
		} else if (sexo.equals("F")) {
			System.out.println("");
			System.out.println("Seja Bem-Vinda " + nome + "!");
			System.out.println("");
		} else {
			System.err.println("Por favor, tente novamente com um valor válido.");
			System.exit(0);
		}

		System.out.print("Por favor, digite o 1º número: ");
		int num1 = sc.nextInt();

		System.out.print("Por favor, digite o 2º número: ");
		int num2 = sc.nextInt();
		
		System.out.print("Por favor, digite o 3º número p/ calcaular o intervalo entre os valores: ");
		int num3 = sc.nextInt();
		
		System.out.print("Informe o dia atual com um número de 1 à 7 para corresponder a um dia da semana: [Ex: 1: Seg, 2: Ter...] ");
		int diaSemana = sc.nextInt();

		System.out.print("Por favor, digite a temperatura atual: ");
		int clima = sc.nextInt();
		
		sc.close();

		for (int i = 0; i < 50; i++) {
			String line = "=";
			System.out.printf(line);
		}
		;
		System.out.println("");
		System.out.println("");

		if (num1 < 0) {
			System.out.println("O número é Negativo.");
		} else {
			System.out.println("O número é Positivo.");
		}

		if (num1 == num2 || num2 == num1) {
			System.out.println("Os números são iguais.");
		} else {
			System.out.println("Os números são diferentes.");
		}

		if (num1 > num2) {
			System.out.println("O 1º número é maior.");
		} else {
			System.out.println("O 2º número é maior.");
		}

		int resto1 = num1 % 2;
		int resto2 = num2 % 2;
		if (resto1 == 0) {
			System.out.println("O 1º número é par.");
		} else {
			System.out.println("O 1º número é impar.");
		}

		if (resto2 == 0) {
			System.out.println("O 2º número é par.");
		} else {
			System.out.println("O 2º número é impar.");
		}
		

        int restoMult1 = num1 % 5;
        int restoMult2 = num2 % 5;

        if (restoMult1 == 0) {
            System.out.println("O 1º número é um multiplo de 5.");
        } else {
            System.out.println("O 1º número não é um multiplo de 5.");
        }
        
        if (restoMult2 == 0) {
            System.out.println("O 2º número é um multiplo de 5.");
        } else {
            System.out.println("O 2º número não é um multiplo de 5.");
        }
		
        
		if (num3 >= num1 && num3 <= num2 || num3 >= num2 && num3 <= num1) {
			System.out.println("O 3º número - " + num3 + ": está dentro do intervalo dos dois primeiros números.");
		} else {
			System.out.println("O 3º número - " + num3 + ": não está dentro do intervalo dos dois primeiros números.");
		}
		
		
		if (diaSemana == 1) {
			System.out.println("Hoje é Segunda-feira.");
		} else if (diaSemana == 2) {
			System.out.println("Hoje é Terça-feira.");
		} else if (diaSemana == 3) {
			System.out.println("Hoje é Quarta-feira.");
		} else if (diaSemana == 4) {
			System.out.println("Hoje é Quinta-feira.");
		} else if (diaSemana == 5) {
			System.out.println("Hoje é Sexta-feira.");
		}else if (diaSemana == 6) {
			System.out.println("Hoje é Sábado.");
		} else if (diaSemana == 7) {
			System.out.println("Hoje é Domingo."); 
		} else {
			System.err.println("Por favor, tente novamente com um valor válido.");
			System.exit(0);
		}
		
		
		if (clima <= 18) {
            System.out.println("Com o clima em " + clima + "°C, atualmente está frio.");
        } else if (clima >= 19 && clima <= 23) {
            System.out.println("Com o clima em " + clima + "°C, atualmente está agradável.");
        } else if (clima >= 24 && clima <= 35){
            System.out.println("Com o clima em " + clima + "°C, atualmente está quente.");
        } else if(clima > 35){
            System.out.println("Com o clima em " + clima + "°C, atualmente está muito quente.");
        } else {
            System.out.println("Com o clima em " + clima + "°C, atualmente está muito frio.");
            
        }

		
		System.exit(0);

	}

}
