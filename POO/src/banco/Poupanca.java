package banco;

public class Poupanca {
	double tarifa;
	double rendimento;
	String tempo;
	String tipo;

	public Poupanca(double tarifa, double rendimento, String tempo, String tipo) {
		super();
		this.tarifa = tarifa;
		this.rendimento = rendimento;
		this.tempo = tempo;
		this.tipo = tipo;
	}

	public void verificarSaldo() {
		System.out.println("Seu saldo é");
	}
	

}