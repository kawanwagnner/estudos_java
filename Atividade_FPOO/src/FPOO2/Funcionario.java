package FPOO2;

import java.text.DecimalFormat;

public class Funcionario {
	public DecimalFormat formato = new DecimalFormat ("#.####");

	String nome;
	double salarioBruto;
	double imposto;
	double aumento;
	double salarioLiquido;

	public Funcionario(String nome, double salarioBruto, double imposto) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}
	
	
	public void exibirDados() {
		salarioLiquido = salarioBruto - imposto;
		
		System.out.println("Olá " + nome + "! Seu salário líquido é: R$ " + formato.format(salarioLiquido) + " reais.");
	}
	
	public void aumentoSalario(double taxa) {
		double aumento = salarioBruto * taxa;
		System.out.println("Dado atualizado: " + nome + ", seu salário bruto agora é: R$ " + (salarioLiquido + aumento));
	}
	

}
