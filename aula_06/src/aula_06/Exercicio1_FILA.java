package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1_FILA {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		String nome;

		Queue<String> fila = new LinkedList<String>();

		
		boolean exibirMenu = true;
		while (exibirMenu) {
			
			System.out.println("\n *************** FILA BANCO SOROPIM *************");
			System.out.println("\n         1 - Adicionar cliente na fila        ");
			System.out.println("\n         2 - Listar todos os clientes         ");
			System.out.println("\n         3 - Retirar cliente da fila          ");
			System.out.println("\n         0 - Sair                             ");
			System.out.println("\n******** Escolha uma das opções acima: *******");
			numero = leia.nextInt();
		
		switch (numero) {

		case 1:

			System.out.println("\nDigite seu nome: ");
			nome = leia.next();

			fila.add(nome);
			System.out.println(fila);
			System.out.println("Cliente adicionado.");
			System.out.println("\n");
			break;

		case 2:
			if (fila.isEmpty() == true)
				System.out.println("A Fila está vazia.");
			else {
				System.out.println("Lista de clientes na fila:");
				System.out.println(fila);
			}
			break;

		case 3:
			if (fila.isEmpty() == true)
				System.out.println("A Fila está vazia.");
			else {
				fila.remove();
				System.out.println("Cliente foi chamado.");

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
