package POO;

public class Carro {

	//cor, marca, modelo
	public String cor;
	public String marca;
	public String modelo;
	
	public Carro(String cor, String marca, String modelo) {
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void acelerar() {
		System.out.println("Acelerandoooo");
	}

	public void acelerar(String estouro) {
		System.out.println("Acelerandoooo" + estouro);
	}
	
	public void freando() {
		 System.out.println("Freandooo");
	}

} 
