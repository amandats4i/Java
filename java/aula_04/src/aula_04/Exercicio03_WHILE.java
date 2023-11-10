package aula_04;

import java.util.Scanner;

public class Exercicio03_WHILE {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números
		// inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja
		// menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A
		// leitura dos dados deve ser finalizada ao digitar uma idade negativa.

		int idade = 0, menores21 = 0, maiores50 = 0;

		while (idade >= 0) {
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();
			
			if (idade < 21 && idade >= 0) 
				menores21++;
				

			if (idade > 50)
				maiores50++;

		}

		System.out.println("Total de pessoas +50: " + maiores50);
		System.out.println("Total de pessoas menores de 21 anos: " + menores21);
			
				

	}

}
