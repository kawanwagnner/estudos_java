package Desafios_26_01;

public class Desafios_01 {

	public static void main(String[] args) {
		int[][] coluna = new int[3][3];

		coluna[0][0] = 1;
		coluna[1][1] = 2;
		coluna[2][2] = 3;

		for (int i = 0; i < coluna.length; i++) {
			System.out.println("Eu Sou I " + i);
			for (int j = 0; j < coluna.length; j++) {
				System.out.println("Eu Sou J " + j);
				System.out.println("Eu Sou I e o J " + i + "" + j);
			}
			System.out.println("");
		}
	}

}
