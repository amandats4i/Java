package aula_05;

import java.util.Scanner;

public class Exercicio1_VETORES {

	// construa um algoritmo que consiga pesquisar dados no vetor, onde o usu�rio
	// ir� digitar um n�mero e o programa deve exibir na tela a posi��o deste n�mero
	// no vetor. Caso o n�mero n�o seja encontrado, a mensagem: �N�o foi
	// encontrado!� deve ser exibida na tela

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// Dado um vetor contendo 10 n�meros inteiros n�o ordenados e n�o repetidos,
		int[] numero = { 10, 5, 2, 8, 3, 4, 1, 6, 9, 97};
		int numeroInteiro, resultado = -1;
		
		System.out.println("Digite um dos n�meros da lista para saber em qual posi�ao ele est�: 10,5,2,8,3,4,1,6,7,9 ");
		numeroInteiro = leia.nextInt();
		
		for (int indice = 0; indice < 10; indice++) {
					if(numero[indice] == numeroInteiro) 
					resultado = indice;			
					
			}
			if (resultado == -1) {
				
				System.out.println("N�o encontrado.");
				
			} else {
				
				System.out.println("O numero " + numeroInteiro + " esta na posi�ao: " + resultado);
			}
		} 
		
		}
		
	
