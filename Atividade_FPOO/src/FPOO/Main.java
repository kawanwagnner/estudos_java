package FPOO;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat formato = new DecimalFormat ("#.##");
		
		Retangle Retangulo = new Retangle(5, 3);
		System.out.println("");
		
		System.out.println("A área do seu retângulo é: " + formato.format(Retangulo.calcArea()));
		System.out.println("A área do seu retângulo é: " + formato.format(Retangulo.calcPerimetro()));
		System.out.println("A área do seu retângulo é: " + formato.format(Retangulo.calcDiagonal()));

	}
}
