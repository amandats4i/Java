package exercicio_Farmacia.controller;

import java.util.ArrayList;
import java.util.Optional;

import exercicio_Farmacia.model.Produto;
import exercicio_Farmacia.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	// CRIAR COLLECTION PARA ARMAZENAR OS DADOS
		private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

		// VARIAVEL PARA RECEBER NUMERO DA CONTA
		int id = 0;

		@Override
		public void procurarPorNumero(int id) {

			Optional<Produto> produto = buscarNaCollection(id);

			if (produto.isPresent())
				produto.get().visualizar(); 
			else
				System.err.println("O produto id " + id + " não foi encontrado.\n");

		}

		@Override
		public void listarTodas() {
			for (var produto : listaProdutos) {
				produto.visualizar();
			}

		}

		@Override
		public void cadastrar(Produto produto) {
			listaProdutos.add(produto);
			System.out.println("O Produto número: " + produto.getId() + " foi criado com sucesso.");

		}

		@Override
		public void atualizar(Produto produto) {

			Optional<Produto> buscaProduto = buscarNaCollection(produto.getId());

			if (buscaProduto.isPresent()) {
				listaProdutos.set((listaProdutos.indexOf(buscaProduto.get())), produto);
				System.out.println("O produto id: " + produto.getId() + " foi atualizado com sucesso.\n");
				
			} else
				System.err.println("O produto id " + produto.getId() + " não foi encontrado.\n");

		}

		@Override
		public void deletar(int id) {

			Optional<Produto> produto = buscarNaCollection(id);

			if (produto.isPresent())
				if (listaProdutos.remove(produto.get()) == true)
					System.out.println("O produto id: " + id + " foi excluído com sucesso.\n");
				else
					System.err.println("O produto id " + id + " não foi encontrado.\n");
		}
		

		public int gerarNumero() {
			return ++id;
		}

		public Optional<Produto> buscarNaCollection(int id) {

			for (var produto : listaProdutos) {
				if (produto.getId() == id)
					return Optional.of(produto);
			}
			return Optional.empty();
		}

	

		

}

