package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;

		do {

			try {
				System.out.println("Digite o Dividendo: ");
				dividendo = leia.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = leia.nextInt();

				divide(dividendo, divisor);

				loop = false; //O FALSE AQUI É PARA INTERROMPER O CÓDIGO QUANDO ELE DÁ CERTO.

			} catch (InputMismatchException e) {
				// System.err.println ("Exception: " + e); Aqui, a mensagem "Exception" será
				// impressa em vermelho, indicando um erro, graças ao System.err

				// PRECISAMOS COLOCAR ESSE CÓDIGO AQUI PQ ELE VAI PEGAR A MSG ABAIXO QUANDO ELE
				// RECEBER UMA STRING, EVITANDO
				// ASSIM UM LOOP
				leia.nextLine();
				System.out.println("Digite valores inteiros.");

			} catch (ArithmeticException e) {
				// System.err.println ("Exception: " + e);
				leia.nextLine();
				System.out.println("Digite número inteiros positivos.");
				
			} //O FINALLY É OPCIONAL //
			finally {
				System.out.println("O Finally foi executado.");
			}

		} while (loop);

	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
