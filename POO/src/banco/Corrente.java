package banco;

public class Corrente {
	String tipo;
	double tarifa;
	double rendimento;
	double saldo;
	
	public Corrente(double tarifa, double rendimento, String tipo) {
		super();
		this.tipo = tipo;
		this.tarifa = tarifa;
		this.rendimento = rendimento;
	}

	public void depositarSaldo() {
		System.out.println("Seu saldo é");
	}
	
	public void retirarSaldo() {
		System.out.println("Seu saldo é");
	}
	
	public void verificarSaldo() {
		System.out.println("Seu saldo é" + saldo);
	}
	

}