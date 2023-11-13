package aula_05;

import java.util.Scanner;

public class Exercicio1_VETORES {

	// construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
	// irá digitar um número e o programa deve exibir na tela a posição deste número
	// no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
	// encontrado!” deve ser exibida na tela

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		int[] numero = { 10, 5, 2, 8, 3, 4, 1, 6, 9, 97};
		int numeroInteiro, resultado = -1;
		
		System.out.println("Digite um dos números da lista para saber em qual posiçao ele está: 10,5,2,8,3,4,1,6,7,9 ");
		numeroInteiro = leia.nextInt();
		
		for (int indice = 0; indice < 10; indice++) {
					if(numero[indice] == numeroInteiro) 
					resultado = indice;			
					
			}
			if (resultado == -1) {
				
				System.out.println("Não encontrado.");
				
			} else {
				
				System.out.println("O numero " + numeroInteiro + " esta na posiçao: " + resultado);
			}
		} 
		
		}
		
	
