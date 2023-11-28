package exercicio_Farmacia.repository;

import exercicio_Farmacia.model.Produto;

public interface ProdutoRepository {
	
	public void procurarPorNumero (int numero);
	public void listarTodas();
	public void cadastrar (Produto produto); // Produto == classe && produto == objeto
	public void atualizar(Produto produto);
	public void deletar (int numero);

}
