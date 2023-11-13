package aula_04;

import java.util.Scanner;

public class Pesquisa {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, esporte, futebol = 0, voleibolM18 = 0, basquetebolMen18 = 0, outros = 0;
		String continua = "s";

		while (continua.equalsIgnoreCase("s")) {

			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();

			
		do {
			System.out.println("Digite seu esporte favorito: (1-Fut / 2-Vol/ 3-Basq / 4-Outros) ");
			esporte = leia.nextInt();
			
		} while (esporte < 1 || esporte > 4);
			
			// QUANTAS PESSOAS GOSTAM DE FUTEBOL
			if(esporte == 1)
				futebol ++;
			
			//QUANTAS PESSOAS GOSTAM DE VOLEI E SAO MAIOR DE 18
			
			if(esporte == 2 && idade > 18 )
				voleibolM18 ++;
			
			// QUANTAS PESSOAS GOSTAM DE FUTEBOL E SAO MENORES QUE 18
			if(esporte == 3 && idade < 18 )
				basquetebolMen18 ++;
			
			//QUANTAS PESSOAS GOSTAM DE OUTROS ESPORTES
			if(esporte == 4)
				outros ++;
			
			System.out.println("Deseja continuar? (S/N) ");
			leia.skip("\\R");
			continua = leia.nextLine();
			
		}
		
		System.out.println("Total de pessoas que gostam de futebol: " + futebol);
		System.out.println("Total de pessoas que gostam de voleibol e sao maiores de 18 anos: " + voleibolM18);
		System.out.println("Total de pessoas que gostam de basquetebol e sao menores de 18 anos: " + basquetebolMen18);
		System.out.println("Total de pessoas que gostam de outros esportes: " + outros);

	}
}
