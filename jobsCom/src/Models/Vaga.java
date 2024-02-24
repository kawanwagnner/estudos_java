package Models;

public class Vaga {
	int idVaga;
	private double salario;
	private String modelo; // 7x0, 6x1, presencial
	private int horario;
	private int candidatos;

//	

	public Vaga(int idVaga, double salario, String modelo, int horario, int candidatos) {
		super();
		this.idVaga = idVaga;
		this.salario = salario;
		this.modelo = modelo;
		this.horario = horario;
		this.candidatos = candidatos;
	}

	public int getIdVaga() {
		return idVaga;
	}

	public void setIdVaga(int idVaga) {
		this.idVaga = idVaga;
	}

	public int getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(int candidatos) {
		this.candidatos = candidatos;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
