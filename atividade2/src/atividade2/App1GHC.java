package atividade2;

public class App1GHC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma = 10;
		int resto = soma % 11;
		int primeiroDigito;
		
		if (resto < 2) {
			primeiroDigito = 0;
		} else {
			primeiroDigito = 11 - resto;
		}

		System.out.println(primeiroDigito);
		
		System.exit(0);

	}

}
