package aula_06;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;


public class Exercicio02_PILHA {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		int numero;
		String livro;
		
		boolean exibirMenu = true;
		while (exibirMenu) {
			
			System.out.println("\n ** MENU BIBLIOTECA DIGITAL: LISTA DE LEITURA**");
			System.out.println(" 1 - Adicionar um livro na lista");
			System.out.println(" 2 - Listar todos os livros");
			System.out.println(" 3 - Retirar livro da lista");
			System.out.println(" 0 - Sair");
			System.out.println("\nEscolha uma das opções acima: ");
			numero = leia.nextInt();
			
			switch (numero) {

			case 1:
				System.out.println("ADICIONAR LIVRO NA LISTA");
				System.out.println("\nDigite o nome do livro: ");
				leia.skip("\\R");
				livro = leia.nextLine();

				pilha.push(livro);
				System.out.println(pilha);
				System.out.println("Livro adicionado.");
				break;

			case 2:
				if (pilha.isEmpty() == true)
					System.out.println("A Lista está vazia.");
				else {
					System.out.println("\n**** LISTA DE LIVROS: ****");
					Iterator<String> iPilha = pilha.iterator();
					while (iPilha.hasNext())
						System.out.println(iPilha.next());
				}
				break;

			case 3:
				if (pilha.isEmpty() == true)
					System.out.println("A Lista está vazia.");
				else {
					pilha.pop();
					System.out.println("Livro removido da lista.");
					System.out.println("Livro restante: " + pilha);

				} break;
				

			case 0:
				exibirMenu = false;
				System.out.println("Programa finalizado.");
				break;
				
			default:
				System.out.println("Opção inválida.");
	            break;
				
			} 

		}

	}
	

	

}

