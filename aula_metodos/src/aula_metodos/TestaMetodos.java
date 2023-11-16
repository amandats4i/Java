package aula_metodos;

// PARA USAR UMACLASSE QUE ESTÁ EM OUTRO PACOTE, DEVEMOS IMPORTAR PELO MÉTODO ABAIXO
import static aula_metodos.pacote01.Classe02.*;

public class TestaMetodos {

	public static void main(String[] args) {

		// Chamadas para os Metodos Locais

		metodoPublico();
		metodoFriendly();
		metodoProtegido();
		metodoPrivado();

		// Chamadas para os metodos da Classe 01

		Classe01.metodoPublico01();
		Classe01.metodoFriendly01();
		Classe01.metodoProtegido01();
		//Classe01.metodoPrivado01(); // não dá pra chamar pq ela é PRIVADA
		
		//Chamadas para os medotodos da classe 02 - pacote 01
		
		metodoPublico02(); // Como importamos a Classe 02 lá em cima, nao precisamos escrever Classe 02 aqui.
		//metodoFriendly02; não funciona em outro pacote pois nao tem acessobilidade
		//metodoProtegido02(); nao funciona, a nao ser que tenha uma HERANÇA
		//metodoPrivado02(); não da pra chamar pq é PRIVADA
		
	}

	public static void metodoPublico() {
		System.out.println("Metodo publico");
	}

	public static void metodoFriendly() {
		System.out.println("Metodo friendly");

	}

	public static void metodoProtegido() {
		System.out.println("Metodo protegido");
	}

	public static void metodoPrivado() {
		System.out.println("Metodo privado");
	}
}
