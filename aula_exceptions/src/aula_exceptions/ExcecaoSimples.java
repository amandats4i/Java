package aula_exceptions;

public class ExcecaoSimples extends Exception {

	/**
	 * 
	 */
	// O VALOR 1L É PADRAO E É UTILIZADO PARA SERIALIZAR OU NÃO UM OBJETO DA CLASSE
	private static final long serialVersionUID = 1L;

	// ABAIXO HA UMA SOBRECARGA DE METODOS, ONTE UTILIZAMOS O MESMO METODO MAS COM
	// FUNÇÕES DIFERENTES.

	public ExcecaoSimples() {
	} // essa versão é sem parametros

	public ExcecaoSimples(String message) {
		super(message);
	}

}
