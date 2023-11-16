package aula_07;

import java.util.Scanner;

public class Calculadora {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float numero1, numero2;
		int opcao;

		while (true) {

			System.out.println("\nQual a operação Matemática você deseja realizar?");
			System.out.println("\n1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Sair");
			System.out.println("\n");
			opcao = leia.nextInt();

			if (opcao == 0) {
				sobre();
				System.exit(0);
			}

			System.out.println("Digite o primeiro numero: ");
			numero1 = leia.nextInt();

			System.out.println("Digite o segundo numero: ");
			numero2 = leia.nextInt();

			switch (opcao) {
			/*
			 * essa setinha significa lambda, ->, com ela, não preciso colocar dois pontos
			 * após case e nem colocar break. Ela serve para simplificar o switch
			 */

			case 1 -> System.out.println("Soma: " + somar(numero1, numero2));
			case 2 -> System.out.println("Subtração: " + subtrair(numero1, numero2));
			case 3 -> System.out.println("Multiplicação: " + multiplicar(numero1, numero2));
			case 4 -> System.out.println("Divisão: " + dividir(numero1, numero2));
			default -> System.out.println("Opção inválida.");

			}

		}

	}

	/* esses métodos sempre vão antes da última chave. */
	/*
	 * Metodos com mesmo nome e assinaturas diferentes se trata de uma SOBRECARGA DE
	 * METODO, como vemos abaixo nos metodos de soma
	 *
	 */
	static int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	static float somar(float numero1, float numero2) {
		return numero1 + numero2;
	}

	static float subtrair(float numero1, float numero2) {
		return numero1 - numero2;
	}

	static float multiplicar(float numero1, float numero2) {
		return numero1 * numero2;

	}

	static float dividir(float numero1, float numero2) {
		return numero1 / numero2;
	}

	static void sobre() {
		System.out.println("Calculadora com Métodos");
		System.out.println("Feito por: Amanda");
	}
}
