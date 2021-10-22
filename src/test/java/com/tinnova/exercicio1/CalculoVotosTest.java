package com.tinnova.exercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CalculoVotosTest {

	@Test
	public void calcularVotoValidos() {
		// Calculo votos válidos igual a 800
		Assertions.assertEquals(80.00, CalculoVotos.calcularVotoValidos(800.00, 1000.00));

	}

	@Test
	public void calcularVotosEmBraco() {
		// Calculo de votos em branco igual a 150
		Assertions.assertEquals(15.00, CalculoVotos.calcularVotosEmBraco(150.00, 1000.00));

	}

	@Test
	public void calcularVotosNulos() {
		// Calculo de votos nulos igual a 50
		Assertions.assertEquals(5.00, CalculoVotos.calcularVotosNulos(50.00, 1000.00));
	}

	@Test
	public void calcularPorCentagem() {
		// Calculo de porcentagem igual a 500
		Assertions.assertEquals(50.00, CalculoVotos.calcularVotosNulos(500.00, 1000.00));
	}

}
