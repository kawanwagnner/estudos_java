package models;

public class Usuario extends User {
	private String nome;
	private String CPF;
	private int idade;
	
	@Override
	public void acessar() {
		// TODO Auto-generated method stub
		
	}
	
	public void Login() {
		System.out.println("Estou realizando login");
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCPF() {
		return this.CPF;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public Usuario(String nome, int idade, String CPF) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
	}

	public void exibirDados(String nome, int idade, String CPF) {
		System.out.println("");
		System.out.println("======================================");
		System.out.println("Bem-vindo(a), cadastro bem-sucedido.");
		System.out.printf("Olá " + nome + "! Você tem " + idade + " anos e seu CPF é " + CPF + ".");
	}

	
	
}
