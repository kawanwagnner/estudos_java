package FPOO3;

public class Student {
	
	String aluno;
	double notaPrimeiroTri;
	double notaSegundoTri;
	double notaTerceiroTri;
	
	public Student(String aluno, double notaPrimeiroTri, double notaSegundoTri, double notaTerceiroTri) {
		super();
		this.aluno = aluno;
		this.notaPrimeiroTri = notaPrimeiroTri;
		this.notaSegundoTri = notaSegundoTri;
		this.notaTerceiroTri = notaTerceiroTri;
	}

	public void calcAprovacao() {
		double soma = notaPrimeiroTri + notaSegundoTri + notaTerceiroTri;
		if (soma >= 60) {
			System.out.println("Parabéns "+ aluno +", você foi APROVADO!");
		} else {
			System.out.println("Infelizmente "+ aluno +", você foi REPROVADO.");
			double qtdFaltante = 60 - soma;
			System.out.println("Quantidade que falta para passar: " + qtdFaltante);
		}
	}
	

}
