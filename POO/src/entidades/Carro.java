package entidades;

public class Carro {
	
	// Atributos
	
	String marca;
	String modelo;
	String cor;
	int ano;
	int velocidade;
	double preco;

	public Carro(String marca, String modelo, String cor, int ano, int velocidade, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	
	// Metodos 
	public void acelerar() {
		System.out.println("Acelerando...");
	}
	
	public void frear() {
		System.out.println("Freando...");
	}
	
	public void marchaRe() {
		System.out.println("Marchando a ré...");
	}
	
	public void andar() {
		System.out.println("Andando...");
	}
	
	
	
}
