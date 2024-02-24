package Heranca_;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Veiculo SI = new Veiculo ("10GYUSA", 2023);
		System.out.println(SI.exibirDados());
		
		Caminhao Muriçoca = new Caminhao ("304Y5SA", 2023, 7);
		System.out.println(Muriçoca.exibirDados());
		
		Onibus Volvo = new Onibus ("479YYFF", 2023, 15);
		System.out.println(Volvo.exibirDados());
	}

}
	