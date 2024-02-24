package Heranca_;

public class Onibus extends Veiculo {

	private int assentos;

	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

	public int getEixos() {
		return assentos;
	}

	public void setEixos(int eixos) {
		this.assentos = eixos;
	}
	
	public String exibirDados() {
		return "Ônibus [Placa: " + placa + "], [Ano: " + ano + "]  & Eixos: " + assentos + "]";
	}

}
