package entidades;

public class FPOO {

	public static void main(String[] args) {
		Carro carroUm;
		carroUm = new Carro("BMW", "320i", "Preta", 2024, 240, 315.000);
		
		Carro carroDois;
		carroDois = new Carro("Honda", "SI", "Preta", 2024, 240, 315.000);
		
		
		System.out.println("Modelo: " + carroUm.modelo);
		System.out.println("Modelo: " + carroDois.modelo);
		
		
		/*CarroUm.marca = "BMW";
		CarroUm.modelo = "320i";
		CarroUm.cor = "Blue";
		CarroUm.ano = 2024;
		CarroUm.velocidade = 240;
		CarroUm.preco = 315.000;*/
	}

}
