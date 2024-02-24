package exemplo_01;

import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [][] dblNotaAluno = new double [4][5];
		double dblSomaNota;
		String[] strDisciplina = {"Língua Portuguesa", "Matemática", "Química", "Física"};
		
		Scanner scnLeitura = new Scanner(System.in);
		
		for (int intDisciplina = 0;intDisciplina < 4;intDisciplina++) {
			System.out.println("Entre com as notas da disciplina de " + strDisciplina[intDisciplina]);
		
		dblSomaNota = 0;
		
		for (int intNota = 1;intNota < 5;intNota++) {
			System.out.printf("Por favor, digite a nota do %do trimestre: %n", intNota);
			dblNotaAluno[intDisciplina] [intNota-1] = scnLeitura.nextDouble();
			dblSomaNota += dblNotaAluno[intDisciplina] [intNota-1];
		}
		
		dblNotaAluno[intDisciplina] [4] = dblSomaNota / 4;
		
		System.out.println();
		}
		
		if ((dblNotaAluno[0][4] > 5) && (dblNotaAluno[1][4] > 5) && (dblNotaAluno[2][4] > 5) && (dblNotaAluno[3][4] > 5)) {
			System.out.println("O aluno foi aprovado!!!");
		} else {
			System.out.println("O aluno foi reprovado...");
			scnLeitura.close();
		}
		
		
		
	}

}
