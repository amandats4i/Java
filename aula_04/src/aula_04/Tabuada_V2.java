package aula_04;

import java.util.Scanner;

public class Tabuada_V2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, contador = 1;

		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		
		//ADIÇAO//
	
		//TABUADA//
		while (contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
			contador ++;

		}

	}
}
