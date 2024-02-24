package models;

public class Aquario {
	private boolean agua;
	private boolean luz;
	private boolean peixe;
	
	private int qtdFuncionarios;
	private int qtdPeixes;
	
	public boolean getPeixe() {
		return this.peixe;
	}
	
	public void setPeixe(boolean peixe) {
		this.peixe = peixe;
	}

	public boolean isAgua() {
		return agua;
	}

	public void setAgua(boolean agua) {
		this.agua = agua;
	}

	public boolean isLuz() {
		return luz;
	}

	public void setLuz(boolean luz) {
		this.luz = luz;
	}

	
}
