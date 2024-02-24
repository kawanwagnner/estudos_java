package entidades;

public class Aluno {
	String nome;
	int idade;
	String genero;
	int identidade;
	String curso;
	String periodo;
	int matricula;
	double media;
	
	public Aluno(String nome, int idade, String genero, int identidade, String curso, String periodo,
			 int matricula, double media) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.identidade = identidade;
		this.curso = curso;
		this.periodo = periodo;
		this.matricula = matricula;
		this.media = media;
	}
	
	public void calcMedia() {
		System.out.println(media);
	}
}