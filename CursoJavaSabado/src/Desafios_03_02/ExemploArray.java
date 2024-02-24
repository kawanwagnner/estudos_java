package Desafios_03_02;

import models.Aquario;

public class ExemploArray {

	public static void main(String[] args) {

		int numeros[] = new int[5];
		numeros[0] = 12;
		numeros[1] = 19;
		numeros[2] = 5;
		numeros[3] = 1;
		numeros[4] = 321;

		for (int i = 0; i < 5; i++) {
			System.out.println(numeros[i]);
		}
		
		// Array de Aquário 1..* objetos de aquario
		Aquario[] aquarios = new Aquario[5];
		
		// Água grande => tem tubarao, tem animais silvestres
		Aquario aquario = new Aquario();
		aquario.setAgua(true);
		aquario.setLuz(true);
		if (aquario.isAgua()) {
			aquario.setPeixe(true); 
		}
		
		aquarios[2] = aquario;
	}

}
