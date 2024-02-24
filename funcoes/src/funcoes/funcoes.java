package funcoes;

public class funcoes {

	public static void main(String[] args) {
		
		mensagem("Teste da Função");
		System.out.println(square(11));
		
	}
	
	static int square(int x) {
		return x * x;
	}

	static void mensagem(String msg) {
		System.out.println(msg);
	}
	
}
