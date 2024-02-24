package FPOO3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double notaPrimeiroTri, notaSegundoTri, notaTerceiroTri;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo(a) ao programa.");
		System.out.println("");
		
		System.out.println("Para começarmos, qual é o nome do aluno? ");
		String aluno = input.next();
		
		System.out.println("Digite a nota do 1º Trimestre: ");
		notaPrimeiroTri = input.nextDouble();
		
		System.out.println("Digite a nota do 2º Trimestre: ");
		notaSegundoTri = input.nextDouble();
		
		System.out.println("Digite a nota do 3º Trimestre: ");
		notaTerceiroTri = input.nextDouble();
		
		Student Aluno = new Student(aluno, notaPrimeiroTri, notaSegundoTri, notaTerceiroTri);
		Aluno.calcAprovacao();
		
		input.close();
	}
}
