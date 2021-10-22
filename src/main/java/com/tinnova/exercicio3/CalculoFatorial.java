package com.tinnova.exercicio3;

public class CalculoFatorial {

	private CalculoFatorial() {
		// não instanciar
	}

	/**
	 * Método para calcular o fatorial
	 * 
	 * @param Long fatorial
	 * @return Long fatorial
	 */
	public static Long calculoFatorial(Long fatorial) {
		Long numeroInicial = 1L;
		for (int i = 1; i <= fatorial ; i++) {
			numeroInicial *= i;
		}
		return numeroInicial;
	}
}
