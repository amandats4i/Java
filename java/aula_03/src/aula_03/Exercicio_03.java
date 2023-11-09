package aula_03;

import java.util.Scanner;

public class Exercicio_03 {

	// Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de
	// um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número
	// inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto
	// que foi comprado.

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int lanche, quantidade;
		
		System.out.println("\nPRODUTOS E VALORES: ");
		System.out.println("1 - CACHORRO QUENTE - 10,00");
		System.out.println("2 - X-SALADA - 15,00");
		System.out.println("3 - X-BACON - 18,00");
		System.out.println("4 - BAURU - 12,00");
		System.out.println("5 - REFRIGERANTE - 8,00");
		System.out.println("6 - SUCO - 13,00");
		
		System.out.print("\nDigite o número do lanche desejado: ");
		lanche = leia.nextInt();
		
		System.out.print("Digite a quantidade do lanche desejado: ");
		quantidade = leia.nextInt();
		
		switch (lanche) {
		
		case 1:
			System.out.println("\nProduto: CACHORRO-QUENTE");
			System.out.println("Total do seu pedido:R$" + (10 * quantidade));
			break;
		case 2:
			System.out.println("\nProduto: X-SALADA");
			System.out.println("Total do seu pedido:R$" + (15 * quantidade));
			break;
		case 3:
			System.out.println("\nProduto: X-BACON");
			System.out.println("Total do seu pedido:R$" + (18 * quantidade));
			break;
		case 4:
			System.out.println("\nProduto: BAURU");
			System.out.println("Total do seu pedido:R$" + (12 * quantidade));
			break;	
		case 5:
			System.out.println("\nProduto: REFRIGERANTE");
			System.out.println("Total do seu pedido:R$" + (8 * quantidade));
			break;
		case 6:
			System.out.println("\nProduto: SUCO");
			System.out.println("Total do seu pedido:R$" + (13 * quantidade));
			break;
		
		}

	}

}
