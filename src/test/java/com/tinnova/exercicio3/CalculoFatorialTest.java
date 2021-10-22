package com.tinnova.exercicio3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CalculoFatorialTest {

	@Test
	public void calculoFatorial() {
		// !5
		Assertions.assertEquals(120L, CalculoFatorial.calculoFatorial(5L));
	}

	@Test
	public void calculoFatorial2() {
		// !6
		Assertions.assertEquals(720L, CalculoFatorial.calculoFatorial(6L));
	}
}
