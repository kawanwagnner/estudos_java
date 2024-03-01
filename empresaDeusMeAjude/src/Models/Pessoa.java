package Models;

/**
 * Classe que representa uma pessoa no sistema, com informações como nome,
 * salário bruto, número de dependentes, benefícios (VR, VA, VT), plano de
 * saúde, etc.
 */
public class Pessoa {
	private String nome;
	private double salarioBruto;
	private int numeroDependentes;
	String direitoVR;
	private boolean vr;
	String direitoVA;
	private boolean va;
	String direitoVT;
	private boolean vt;
	private String planoDeSaude;
	private String direitoPlanoDeSaude;
	private String str;

	/**
	 * Construtor para criar uma instância de Pessoa com os parâmetros fornecidos.
	 *
	 * @param nome                Nome da pessoa.
	 * @param salarioBruto        Salário bruto da pessoa.
	 * @param numeroDependentes   Número de dependentes da pessoa.
	 * @param direitoVR           Indicação se a pessoa tem direito a Vale Refeição
	 *                            (VR).
	 * @param vr                  Valor booleano indicando se a pessoa recebe VR.
	 * @param direitoVA           Indicação se a pessoa tem direito a Vale
	 *                            Alimentação (VA).
	 * @param va                  Valor booleano indicando se a pessoa recebe VA.
	 * @param direitoVT           Indicação se a pessoa tem direito a Vale
	 *                            Transporte (VT).
	 * @param vt                  Valor booleano indicando se a pessoa recebe VT.
	 * @param planoDeSaude        Plano de saúde da pessoa.
	 * @param direitoPlanoDeSaude Indicação se a pessoa tem direito a plano de
	 *                            saúde.
	 */
	public Pessoa(String nome, double salarioBruto, int numeroDependentes, String direitoVR, boolean vr,
			String direitoVA, boolean va, String direitoVT, boolean vt, String planoDeSaude,
			String direitoPlanoDeSaude) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.numeroDependentes = numeroDependentes;
		this.direitoVR = direitoVR;
		this.vr = vr;
		this.direitoVA = direitoVA;
		this.va = va;
		this.direitoVT = direitoVT;
		this.vt = vt;
		this.planoDeSaude = planoDeSaude;
		this.direitoPlanoDeSaude = direitoPlanoDeSaude;
	}

	/**
	 * Obtém o nome da pessoa.
	 *
	 * @return Nome da pessoa.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome da pessoa.
	 *
	 * @param nome Novo nome da pessoa.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obtém o salário bruto da pessoa.
	 *
	 * @return Salário bruto da pessoa.
	 */
	public double getSalarioBruto() {
		return salarioBruto;
	}

	/**
	 * Define o salário bruto da pessoa.
	 *
	 * @param salarioBruto Novo salário bruto da pessoa.
	 */
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	/**
	 * Obtém o número de dependentes da pessoa.
	 *
	 * @return Número de dependentes da pessoa.
	 */
	public int getNumeroDependentes() {
		return numeroDependentes;
	}

	/**
	 * Define o número de dependentes da pessoa.
	 *
	 * @param numeroDependentes Novo número de dependentes da pessoa.
	 */
	public void setNumeroDependentes(int numeroDependentes) {
		this.numeroDependentes = numeroDependentes;
	}

	/**
	 * Obtém o direito ao Vale Refeição (VR) da pessoa.
	 *
	 * @return Indicação se a pessoa tem direito a VR.
	 */
	public String getDireitoVR() {
		return direitoVR;
	}

	/**
	 * Define o direito ao Vale Refeição (VR) da pessoa.
	 *
	 * @param direitoVR Novo valor indicando se a pessoa tem direito a VR.
	 */
	public void setDireitoVR(String direitoVR) {
		this.direitoVR = direitoVR;
	}

	/**
	 * Verifica se a pessoa recebe Vale Refeição (VR).
	 *
	 * @return Valor booleano indicando se a pessoa recebe VR.
	 */
	public boolean isVr() {
		return vr;
	}

	/**
	 * Define se a pessoa recebe Vale Refeição (VR).
	 *
	 * @param vr Novo valor booleano indicando se a pessoa recebe VR.
	 */
	public void setVr(boolean vr) {
		this.vr = vr;
	}

	/**
	 * Verifica se a pessoa recebe Vale Alimentação (VA).
	 *
	 * @return Valor booleano indicando se a pessoa recebe VA.
	 */
	public boolean isVa() {
		return va;
	}

	/**
	 * Define se a pessoa recebe Vale Alimentação (VA).
	 *
	 * @param va Novo valor booleano indicando se a pessoa recebe VA.
	 */
	public void setVa(boolean va) {
		this.va = va;
	}

	/**
	 * Obtém o direito ao Vale Alimentação (VA) da pessoa.
	 *
	 * @return Indicação se a pessoa tem direito a VA.
	 */
	public String getDireitoVA() {
		return direitoVA;
	}

	/**
	 * Define o direito ao Vale Alimentação (VA) da pessoa.
	 *
	 * @param direitoVA Novo valor indicando se a pessoa tem direito a VA.
	 */
	public void setDireitoVA(String direitoVA) {
		this.direitoVA = direitoVA;
	}

	/**
	 * Verifica se a pessoa recebe Vale Transporte (VT).
	 *
	 * @return Valor booleano indicando se a pessoa recebe VT.
	 */
	public boolean isVt() {
		return vt;
	}

	/**
	 * Define se a pessoa recebe Vale Transporte (VT).
	 *
	 * @param vt Novo valor booleano indicando se a pessoa recebe VT.
	 */
	public void setVt(boolean vt) {
		this.vt = vt;
	}

	/**
	 * Obtém o direito ao Vale Transporte (VT) da pessoa.
	 *
	 * @return Indicação se a pessoa tem direito a VT.
	 */
	public String getDireitoVT() {
		return direitoVT;
	}

	/**
	 * Define o direito ao Vale Transporte (VT) da pessoa.
	 *
	 * @param direitoVT Novo valor indicando se a pessoa tem direito a VT.
	 */
	public void setDireitoVT(String direitoVT) {
		this.direitoVT = direitoVT;
	}

	/**
	 * Obtém o direito ao plano de saúde da pessoa.
	 *
	 * @return Indicação se a pessoa tem direito a plano de saúde.
	 */
	public String getDireitoPlanoDeSaude() {
		return direitoPlanoDeSaude;
	}

	/**
	 * Define o direito ao plano de saúde da pessoa.
	 *
	 * @param direitoPlanoDeSaude Novo valor indicando se a pessoa tem direito a
	 *                            plano de saúde.
	 */
	public void setDireitoPlanoDeSaude(String direitoPlanoDeSaude) {
		this.direitoPlanoDeSaude = direitoPlanoDeSaude;
	}

	/**
	 * Obtém o plano de saúde da pessoa.
	 *
	 * @return Plano de saúde da pessoa.
	 */
	public String getPlanoDeSaude() {
		return planoDeSaude;
	}

	/**
	 * Define o plano de saúde da pessoa.
	 *
	 * @param planoDeSaude Novo plano de saúde da pessoa.
	 */
	public void setPlanoDeSaude(String planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	/**
	 * Faz uma validação para verificar se a String contém números.
	 *
	 * @return um boolean _ true or false.
	 */
	public static boolean isName(String str) {
		boolean retorno = false;
		int contador = str.length();
		if (contador < 3) {
			System.err.println("*Digite um valor maior que 3(três) caracteres");
		} else {
			if (str != null && str.matches("[a-z]*")) {
				retorno = true;
			}
		}

		return retorno;
	}

	/**
	 * Calcula o salário líquido da pessoa, levando em consideração descontos como
	 * INSS, IRRF, benefícios (VR, VA, VT) e plano de saúde.
	 *
	 * @return Salário líquido da pessoa.
	 */
	public double calcularSalarioLiquido() {
		double descontoINSS = this.salarioBruto * 0.11;
		double acrescimoDependentes = this.numeroDependentes * 50;
		double descontoIRRF = this.salarioBruto * 0.15;
		double descontoVR = this.vr ? 0.03 * this.salarioBruto : 0.0;
		double descontoVA = this.va ? 0.05 * this.salarioBruto : 0.0;
		double descontoVT = this.vt ? 0.06 * this.salarioBruto : 0.0;
		double descontoPlanoDeSaude = 0.0;

		if (this.planoDeSaude.equalsIgnoreCase("Básico")) {
			descontoPlanoDeSaude = 100.0;
		} else if (this.planoDeSaude.equalsIgnoreCase("Premium")) {
			descontoPlanoDeSaude = 250.0;
		} else if (this.planoDeSaude.equalsIgnoreCase("Premium Platium Plus")) {
			descontoPlanoDeSaude = 500.0;
		}
		double totalDescontos = descontoINSS + descontoIRRF + descontoVR + descontoVA + descontoVT
				+ descontoPlanoDeSaude;
		double salarioLiquido = (this.salarioBruto - totalDescontos) + acrescimoDependentes;

		// Adicione impressões para depuração
		System.out.println("Desconto INSS: " + descontoINSS);
		System.out.println("Acrescimo de dependentes: " + acrescimoDependentes);
		System.out.println("Desconto IRRF: " + descontoIRRF);
		System.out.println("Desconto VR: " + descontoVR);
		System.out.println("Desconto VA: " + descontoVA);
		System.out.println("Desconto VT: " + descontoVT);
		System.out.println("Desconto Plano de Saúde: " + descontoPlanoDeSaude);
		System.out.println("Total Descontos: " + totalDescontos);
		System.out.println("Salário Bruto: " + this.salarioBruto); // Adicionado para verificar o salário bruto
		System.out.println("Salário Líquido: " + salarioLiquido);

		return salarioLiquido;
	}
}