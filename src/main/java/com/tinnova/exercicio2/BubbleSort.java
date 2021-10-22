package com.tinnova.exercicio2;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BubbleSort {

	private static final Logger LOGGER = LoggerFactory.getLogger(BubbleSort.class);

	private BubbleSort() {
		// não instanciar
	}

	/**
	 * 	
	 * @param int[] vector
	 * 
	 * @return int[] vector
	 */
	
	public static int[] bubbleSort(int[] listaParaOrganizar) {
		LOGGER.debug(Arrays.toString(listaParaOrganizar));
		bubble(listaParaOrganizar);
		LOGGER.debug(Arrays.toString(listaParaOrganizar));
		return listaParaOrganizar;

	}
	
	
	
	/**
	 * 
	 * Método para verificar se precisa trocar de posição
	 * 
	 * @param int[] v
	 */

	private static void bubble(int[] v) {
		for (int ultimoElemento = v.length - 1; ultimoElemento > 0; ultimoElemento--) {
			for (int i = 0; i < ultimoElemento; i++) {
				if (v[i] > v[i + 1]) {
					trocar(v, i, i + 1);
				}
			}
		}
	}

	
	/**
	 * Método para realizar a troca de posição
	 * 
	 * 
	 * @param int[] v
	 * @param int i
	 * @param int j
	 */
	
	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

}
