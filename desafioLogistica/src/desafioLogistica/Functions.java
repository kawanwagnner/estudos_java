package desafioLogistica;

import java.text.DecimalFormat;

public class Functions {

	static // Default of format - 1
	DecimalFormat formato = new DecimalFormat("#.##");
	// Default of format - 2
	static
	DecimalFormat formatoDois = new DecimalFormat("#.####");

	public static void Lines(String line) {
		System.out.println("");
		for (int i = 0; i < 100; i++) {
			System.out.printf(line);
		}
	}
	
	public static void Msg(String msg) {
			System.out.println(msg);
			System.out.println("");
	}

	public static void CargaUtilEPeso(int intPesoBruto, int pesoVeiculo) {
		int intCargaUtil = intPesoBruto - pesoVeiculo;

		System.out.println("O Peso do veículo é: " + pesoVeiculo + "Kg.");
		System.out.println("A Carga Útil do do veículo é: " + intCargaUtil + "Kg.");
	}

	public static void NumeroTotalViagens(Double intViagensMensais, Double intCargaTotal) {
		System.out.println("");

		System.out.println("O veículo pode fazer: " + formato.format(intViagensMensais) + " viagens/mês.");
	}

	public static void TempoTotaldeViagens(Double intTempoIdaEmMin, Double intTempoVoltaEmMin, Double intPesoTotalCargaEDesacarga,
			Double intTotalTempo) {
		System.out.println("O tempo de ida do veículo é: " + formato.format(intTempoIdaEmMin) + " min.");
		System.out.println("O tempo de volta do veículo é: " + formato.format(intTempoVoltaEmMin) + " min.");
		System.out.println("O tempo total da viagem é: " + formato.format(intTotalTempo) + " min.");
	}

	public static void TempoDiariodeOperacao(int intTotalTempoOperacao,
			Double intViagensPorDia) {

		System.out.println("O tempo diário da operação é: " + formato.format(intTotalTempoOperacao) + " min./dia.");
		System.out.println("O número de viagens do veículo por dia: " + formatoDois.format(intViagensPorDia) + " viagens / dia.");
	}

	public static void DimensionamentoDeFrota(Double intTotalDiasDisponiveisMes, Double intViagensMesaisVeiculo,
			Double Frota) {
		Double FrotaArredondada = Math.ceil(Frota);

		System.out.println(
				"O número total de dias disponíveis por mês é: " + formato.format(intTotalDiasDisponiveisMes) + " dias mensais.");
		System.out.println("O número total de viagens mensais de um veículo: " + formato.format(intViagensMesaisVeiculo)
				+ " viagens mensais / Veic.");
		System.out.println(
				"A frota de veículos necessários é: " + formato.format(Frota) + " veic. Ou seja, " + FrotaArredondada + " veículos.");
	}

}