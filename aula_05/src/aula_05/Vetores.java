package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		// ESSA AQUI � A MATRIZ. PARECE UMA STRING COMUM, MAS AO ADICIONAR "[]" E OS
		// ELEMENTOS DENTRO DE "{}", SE TORNA UMA MATRIZ
		String pessoas[] = { "Luiza", "Aline", "Vinicius", "Antonio", "Vitor", "Samara" };


		float[] notas = new float[5];

		for (int indice = 0; indice < 6; indice++)
			System.out.println("Posi��o " + indice + " = " + pessoas[indice]);

		System.out.println("\n");

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite um valor para posi�ao " + "[" + indice + "]" + " = ");
			notas[indice] = leia.nextFloat();
		}
		// "notas.length" vai pegar o tamanho da sua matriz "notas"
		for (int indice = 0; indice < notas.length; indice++)
			System.out.println("Posicao " + indice + " = " + notas[indice]);

		// Arrays.sort ir� organizar a matriz de String "pessoas" em ordem alfab�tica.
		Arrays.sort(pessoas);
		System.out.println("\n");

		for (int indice = 0; indice < pessoas.length; indice++)
			System.out.println("Posi��o " + indice + " = " + pessoas[indice]);

		System.out.println("\n");
		for (int indice = pessoas.length - 1; indice >= 0; indice--) {
			System.out.println("Posi��o " + indice + " = " + pessoas[indice]);

		}

		// ESSE � O "FOR / EACH" que percorre o vetor, elemento por elemento, � mais
		// simples do que escrever toda a sintaxe do "if" e so funciona com vetores e
		// matrizes, por�m, n�o recupera a MATRIZ, ele � bom quando vc s� quer listar uma matriz
		System.out.println("\n");
		for (String pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}