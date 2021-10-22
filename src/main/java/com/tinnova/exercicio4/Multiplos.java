package com.tinnova.exercicio4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Multiplos {

	private static final Logger LOGGER = LoggerFactory.getLogger(Multiplos.class);

	private Multiplos() {
		// não instanciar
	}

	public static Long calcularMultiplos(Long numeroUm, Long numeroDois, Long intervalo) {
		Long resultado = 0L;
		for (Long i = 0L; i < intervalo; i++) {
			if (i % numeroUm == 0 || i % numeroDois == 0) {
				resultado += i;
			}
		}
		LOGGER.info(resultado.toString());
		return resultado;
	}
}
