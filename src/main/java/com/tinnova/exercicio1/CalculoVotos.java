package com.tinnova.exercicio1;

public class CalculoVotos {

	private CalculoVotos() {
		// não instanciar
	}

	/**
	 * Método para calcular porcentagem dos votos válidos
	 * 
	 * @param Double votosValidos
	 * @param Double valorTotal
	 * 
	 * @return Double porcentagem
	 */
	public static Double calcularVotoValidos(Double votosValidos, Double valorTotal) {
		return calcularPorcentagem(votosValidos, valorTotal);
	}

	/**
	 * Método para calcular porcentagem de votos em branco
	 * 
	 * @param Double votosEmBraco
	 * @param Double valorTotal
	 * @return Double porcentagem
	 */
	public static Double calcularVotosEmBraco(Double votosEmBraco, Double valorTotal) {
		return calcularPorcentagem(votosEmBraco, valorTotal);
	}

	/**
	 * Método para calcular porcentagem dos votos nulos
	 * 
	 * @param Double VotosNulos
	 * @param Double valorTotal
	 * @return Double porcentagem
	 */

	public static Double calcularVotosNulos(Double VotosNulos, Double valorTotal) {
		return calcularPorcentagem(VotosNulos, valorTotal);
	}

	/**
	 * Método que calcula porcentagem
	 * 
	 * @param Double votos
	 * @param Double totalVotos
	 * @return Double porcentagem
	 */
	private static Double calcularPorcentagem(Double votos, Double totalVotos) {
		return votos / totalVotos * 100;
	}

}
