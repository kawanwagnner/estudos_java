package ExemploSistema;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Vaga;

public class Sistema {

	public static void main(String[] args) {
		int[] numeros = new int[10];

		// Instancia o ArrayList
		ArrayList<String> palavras = new ArrayList<String>();

		// Adiciona mais valores
		palavras.add("Abóbora");
		palavras.add("sla");
		palavras.add("498");
		palavras.add("Abacaxi");

		palavras.forEach(item -> {
			
			if (item.equals("Abacaxi")) {
				System.out.println(item);
			}
			
			// Caontains => varificar se existe
			boolean existe = palavras.contains("498");
			if (existe) {
				// Busca a posição da palavra/variável
				int posicao = palavras.indexOf("498");
				// get => trazer a variavel de acordo com posicao
				System.out.println(palavras.get(posicao));
			}
			
			System.out.println("");
			System.out.println(palavras.contains("498"));
			System.out.println(palavras.indexOf("498"));
			
			System.out.println("");
			System.out.println("Setando novo valor");
			palavras.set(0, "449");
			System.out.println(palavras.get(0));
			
			
			ArrayList<Vaga> vagas = new ArrayList<Vaga>();
//			Vaga vaga = new Vaga();
//			vaga.setSalario(19000);
//			vaga.setModelo("7x0");
//			vaga.setHorario("06 às 06");
//			vaga.setCandidatos(2);
//			vagas.add(vaga);
		});			
			
	}

}
