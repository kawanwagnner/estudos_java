package desafioLogistica;

import java.util.Scanner;

public class desafioLogistica {

	public static void main(String[] args) {

		String[] strNomesEquipamentos = { "Chassi", "Semi-roboque", "Carroceira", "Outros equipamentos" };
		int[] intPesoEquipamentos = new int[4];

		int pesoVeiculo = 0, intPesoBruto;
		Double intNumDiasUteis, intCargaTotal;
		Double intTempoIda, intTempoVolta, intTempoIdaEmMin, intTempoVoltaEmMin, intPesoTotalCargaEDesacarga;
		int intTurnoDiario, intJornadaUtil;

		Scanner sc = new Scanner(System.in);
		Functions.Msg("Olá, bem vindo(a)! Por favor, digite os dados do equipamento:");

		for (int i = 0; i < strNomesEquipamentos.length; i++) {
			System.out.println("Digite o peso do equipamento " + strNomesEquipamentos[i] + ":");
			intPesoEquipamentos[i] = sc.nextInt();

		}

		for (int index = 0; index < intPesoEquipamentos.length; index++) {
			pesoVeiculo += intPesoEquipamentos[index];
		}

		System.out.println("Digite o peso bruto total:");
		intPesoBruto = sc.nextInt();
		System.out.println("");

		Functions.CargaUtilEPeso(intPesoBruto, pesoVeiculo);

		Functions.Lines("=");

		System.out.println("");
		Functions.Msg("Por favor digite os dados para o número de total de viagnes:");

		System.out.println("Digite a carga total do veículo:");
		intCargaTotal = sc.nextDouble();

		Double intViagensMensais = intCargaTotal / 30;
		Functions.NumeroTotalViagens(intViagensMensais, intCargaTotal);

		Functions.Lines("=");

		System.out.println("");
		Functions.Msg("Por favor digite os dados para o tempo de total de viagens:");

		System.out.println("Digite o tempo de ida do veículo:");
		intTempoIda = sc.nextDouble();

		System.out.println("Digite o tempo de volta do veículo:");
		intTempoVolta = sc.nextDouble();

		System.out.println("Digite o valor total de carga e desacarga do veículo:");
		intPesoTotalCargaEDesacarga = sc.nextDouble();
		System.out.println("");

		intTempoIdaEmMin = (intTempoIda / 55) * 60;
		intTempoVoltaEmMin = (intTempoVolta / 65) * 60;
		Double intTotalTempo = intTempoIdaEmMin + intTempoVoltaEmMin + intPesoTotalCargaEDesacarga;

		Functions.TempoTotaldeViagens(intTempoIdaEmMin, intTempoVoltaEmMin, intPesoTotalCargaEDesacarga, intTotalTempo);

		Functions.Lines("=");

		System.out.println("");
		Functions.Msg("Por favor digite os dados para o tempo diário de operação:");

		System.out.println("Digite os turnos diários do veículo:");
		intTurnoDiario = sc.nextInt();

		System.out.println("Digite ás horas da jornada útil do veículo:");
		intJornadaUtil = sc.nextInt();
		System.out.println("");

		Double intTotalTempoOperacao = (double) ((intTurnoDiario * intJornadaUtil) / intTurnoDiario * 60);
		Double intViagensPorDia = intTotalTempoOperacao / intTotalTempo;
		Functions.TempoDiariodeOperacao(intJornadaUtil, intViagensPorDia);

		Functions.Lines("=");

		System.out.println("");
		Functions.Msg("Calcúlo do número total de dias disponíveis por mês:");

		System.out.println("Digite os dias úteis do veículo:");
		intNumDiasUteis = sc.nextDouble();

		System.out.println("Digite os dias de manutenção:");
		int intNumDiasManutencao = sc.nextInt();
		System.out.println("");

		Double intTotalDiasDisponiveisMes = intNumDiasUteis - intNumDiasManutencao;
		Double intViagensMesaisVeiculo = intViagensPorDia * intTotalDiasDisponiveisMes;
		Double Frota = intViagensMensais / intViagensMesaisVeiculo;

		Functions.DimensionamentoDeFrota(intTotalDiasDisponiveisMes, intViagensMesaisVeiculo, Frota);

		sc.close();

	}
}
