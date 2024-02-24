package models;

public class Cliente extends Usuario {
	private int numeroCadastro;
	
	@Override
	public void Login() {
		
	}
	
		public Cliente(String nome, int idade, String cpf, int numeroCadastro) {
		super(nome, idade, cpf);
 
		this.numeroCadastro= numeroCadastro;
	}
 
		
		public int getNumeroCadastro() {
			return numeroCadastro;
		}
 
		public void setNumeroCadastro(int numeroCadastro) {
			this.numeroCadastro = numeroCadastro;
		}
	}
 