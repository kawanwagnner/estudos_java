package POO;

import POO.Carro;

public class Sistema {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Roxo", "Ferrari", "F9");
		
		System.out.println("A marca é " + carro1.marca);
		carro1.acelerar();
		carro1.acelerar(" Pápápá");
	}

} 
