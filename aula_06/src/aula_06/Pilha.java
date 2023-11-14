package aula_06;

import java.util.Stack;

public class Pilha {

	/// EM PILHA, O ULTIMO A ENTRAR É O PRIMEIRO A SAIR.

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();

		pilha.add("Aline");
		pilha.add("Pedro");
		pilha.add("Vinicius");
		pilha.add("Luiza");

		// ASSIM COMO .add o .push vai adicionar o elemento na lista
		pilha.push("Maria");

		System.out.println(pilha);

		// ASSIM COMO ".remove" o ".pop" REMOVE UM ELEMENTO DA FILA PORÉM, REMOVE O
		// ULTIMO!
		pilha.pop();

		System.out.println(pilha);

		// AQUI, ELE MOSTRA O ULTIMO ELEMENTO DA LISTA COMO SE FOSSE O TOPO DA LISTA, OU
		// SEJA, ESSE É O PROXIMO ELEMENTO A SER REMOVIDO
		System.out.println("O elemento que está no topo da pilha: " + pilha.peek());
		
		System.out.println("Aline está na pilha? " + pilha.contains("Aline"));

	}

}
