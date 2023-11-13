package aula_04;

import java.util.Scanner;

public class Exercicio04_WHILE {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, genero, dev, back = 0, front = 0, full = 0, somaIdade = 0;
		float media = 0.0f;
		String continua = "s";
		
		while (continua.equalsIgnoreCase("s")) {
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();

			
		do {
			System.out.println("Digite o genero: (1-MC / 2-HC/ 3-NB / 4-MT / 5 - HT / 6 - Outros: ");
			genero = leia.nextInt();
			
		} if (genero < 1 || genero > 4) {
		
			System.out.println("Digite um valor entre 1 e 6");	
		
		}

	}
			
			
		}