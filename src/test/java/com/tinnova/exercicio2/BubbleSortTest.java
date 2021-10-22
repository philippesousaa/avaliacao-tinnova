package com.tinnova.exercicio2;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class BubbleSortTest {
	
	
	@Test
	public void bubbleSort() {
		int[] listaParaOrganizar = {5, 2, 3, 5, 1, 5};
		int[] listaOrganizada = {1, 2, 3, 5, 5, 5};
		
		Assertions.assertEquals(Arrays.toString(listaOrganizada), Arrays.toString(BubbleSort.bubbleSort(listaParaOrganizar)));
		Assertions.assertEquals(listaOrganizada[0],  BubbleSort.bubbleSort(listaParaOrganizar)[0]);
	}

}
