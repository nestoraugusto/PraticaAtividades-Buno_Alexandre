package br.senai.sc.util;

public class OperacoesMatematicas {

	public static Double somaDoisValoresReais(Double num1, Double num2) {
		if (num1 != null && num2 != null) {
			return num1 + num2;
		}
		throw new NumberFormatException(
				"Você deve passar dois valores para o cálculo.");
	}

	public static Double subtraiDoisValoresReais(Double num1, Double num2) {
		if (num1 != null && num2 != null) {
			return num1 - num2;
		}
		throw new NumberFormatException(
				"Você deve passar dois valores para o cálculo.");
	}

	public static Double multiplicaDoisValoresReais(Double num1, Double num2) {
		if (num1 != null && num2 != null) {
			return num1 * num2;
		}
		throw new NumberFormatException(
				"Você deve passar dois valores para o c�lculo.");
	}

	public static Double divideDoisValoresReais(Double num1, Double num2) {
		if (num2 == 0) {
			throw new NumberFormatException(
					"Não é possível dividir um número por zero.");
		}
		if (num1 != null && num2 != null) {
			return num1 / num2;
		}
		throw new NumberFormatException(
				"Você deve passar dois valores para o cálculo.");
	}

}
