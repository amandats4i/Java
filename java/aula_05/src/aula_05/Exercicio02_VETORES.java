package aula_05;

import java.util.Scanner;

public class Exercicio02_VETORES {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int vetor[] = new int[10];
	
		float media;

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Escreva um número: ");
			vetor[indice] = leia.nextInt();

		}
		// ELEMENTOS IMPARES
		System.out.print("\nElementos nos indices impares: ");
		for (int indice = 1; indice < 10; indice += 2) {
			System.out.print(vetor[indice] + " ");
		}

		// ELEMENTOS PARES
		System.out.print("\nElementos pares: ");
		for (int indice = 0; indice < 10; indice++) {
			if (vetor[indice] % 2 == 0)
				System.out.print(vetor[indice] + " ");
		}

		// SOMA DOS ELEMENTOS

		int soma = 0;
		for (int indice = 0; indice < 10; indice++) {
			soma += vetor[indice];
		}
		System.out.print("\nSoma: " + soma);

		// MEDIA EM REAL
		
		media = ((float)soma / vetor.length);
		System.out.printf("\nMedia: %.2f ", media);

	}
}
