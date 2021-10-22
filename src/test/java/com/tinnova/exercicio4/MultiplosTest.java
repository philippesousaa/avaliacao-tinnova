package com.tinnova.exercicio4;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class MultiplosTest {

	
	@Test
	public void calcularMultiplos() {
		//criando array de 3 e 5
		Long intervalo = 10L;
		Multiplos.calcularMultiplos(3L, 5L, intervalo);
	}
}
