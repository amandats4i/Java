package exercicio_Farmacia;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import exercicio_Farmacia.controller.ProdutoController;
import exercicio_Farmacia.model.Medicamento;
import exercicio_Farmacia.model.Produto;

public class Menu {

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ProdutoController produtos = new ProdutoController();

		int opcao, id, tipo;
		String nome, generico;
		float preco;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                FARMACIA MEDVEL                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar produto                         ");
			System.out.println("            2 - Listar todos os produtos              ");
			System.out.println("            3 - Buscar produto por Numero             ");
			System.out.println("            4 - Atualizar Dados do produto            ");
			System.out.println("            5 - Apagar produto                        ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Por favor, digite a opção desejada:                  ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
				
			} catch(InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if (opcao == 6) {
				System.out.println("\nAtendimento encerrado. \nAgradecemos por escolher a FARMACIA MEDVEL.");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:

				System.out.println( "Criar produto\n\n");

				System.out.println("Digite seu nome do produto: ");
				leia.skip("\\R");
				nome = leia.nextLine();

				// System.out.println("Digite o tipo do produto (1 - Medicamentos):  ");
				tipo = 1;
					
				System.out.println("Digite o preço do produto: ");
				preco = leia.nextFloat();
				
				System.out.println("Digite o nome generico: ");
				generico = leia.next();
				
				produtos.cadastrar(new Medicamento (produtos.gerarNumero(), nome, tipo, preco, generico));		
				
				keyPress();
				break; 
				
			case 2:
				System.out.println("Listar todos os produtos\n\n");
				produtos.listarTodas();
				keyPress();
				break;
				
			case 3:
				System.out.println("Consultar dados da produto - por número\n\n");
				
				System.out.println("Digite o numero da conta: ");
				id = leia.nextInt();
				
				produtos.procurarPorNumero(id);
				keyPress();
				break;
			
			case 4:
				System.out.println("Atualizar dados do produto \n\n");
				
				System.out.println("Digite o ID do produto: ");
				id = leia.nextInt();
				
				Optional<Produto> produto = produtos.buscarNaCollection(id); 
				
				if (produto.isPresent()) {
					
					System.out.println("Digite o nome do novo produto: ");
					leia.skip ("\\R");
					nome = leia.next();
					
					tipo = produto.get().getTipo();
					
					System.out.println("Digite o preço do produto: ");
					preco = leia.nextInt();
					
					System.out.println("Digite o nome generico: ");
					generico = leia.next();
					
					produtos.atualizar(new Medicamento (id, nome, tipo, preco, generico));
					
				} else 
					System.out.println("Produto não encontrado.");
				
				keyPress();
				break;
			
			case 5:
				
				System.out.println("Apagar produto\n\n");
				id = leia.nextInt();
				
				produtos.deletar(id);
				keyPress();
				break;

				
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
				
			}
			
		}
				
			}


	public static void sobre() {
		System.out.println("**********************************");
		System.out.println("Projeto desenvolvido por: Amanda Tsai");
		System.out.println("Contato: amandatsai16@gmail.com");
		System.out.println("https://github.com/amandats4i");
		System.out.println("**********************************");

	}

	public static void keyPress() {

		try {
			System.out.println("Pressione ENTER para continuar.");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla inválida.");
		}
	}

}
