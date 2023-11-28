package exercicio_Farmacia;

import java.util.Scanner;


public class Menu {

		

			static Scanner leia = new Scanner (System.in);
			
			
			public static void main(String[] args) {
				
				while (true) {
					
				

					System.out.println("*****************************************************");		         
					System.out.println("                                                     ");
					System.out.println("                BANCO MANILA S.A                     ");
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
				
					int opcao = leia.nextInt();
					
					if (opcao == 6) {
						System.out.println("\nAtendimento encerrado. \nBanco Manila S.A - For Everone.");
						leia.close();
						System.exit(0);
					}
					
					switch (opcao) {
					case 1:
						
						System.out.println( "Criar produto\n\n");
						System.out.println("Digite seu nome completo: ");
						

						break;
					case 2:
						System.out.println( "Listar todas as Contas\n\n");

						break;
					case 3:
						System.out.println( "Consultar dados da Conta - por número\n\n");

						break;
					case 4:
						System.out.println( "Atualizar dados da Conta\n\n");

						break;
					case 5:
						System.out.println( "Apagar a Conta\n\n");

						break;
					case 6:
						System.out.println( "Saque\n\n");

						break;
					case 7:
						System.out.println( "Depósito\n\n");

						break;
					case 8:
						System.out.println( "Transferência entre Contas\n\n");

						break;
					default:
						System.out.println( "\nOpção Inválida!\n" );
						break;
					}
				}

			}

			public static void sobre () {
				System.out.println( "**********************************");
				System.out.println("Projeto desenvolvido por: Amanda Tsai");
				System.out.println("Contato: amandatsai16@gmail.com");
				System.out.println("https://github.com/amandats4i");
				System.out.println("**********************************");



	
			
}

}

