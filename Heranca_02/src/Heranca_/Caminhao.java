package Heranca_;

public class Caminhao extends Veiculo {
	private int eixos;

	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public String exibirDados() {
		return "Caminhao [Placa: " + placa + "], [Ano: " + ano + "]  & Eixos: " + eixos + "]";
	}
	

}
