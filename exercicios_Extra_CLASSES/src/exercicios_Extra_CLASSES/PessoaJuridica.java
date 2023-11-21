package exercicios_Extra_CLASSES;

public class PessoaJuridica extends Cliente {
	
	private String cnpj;

	public PessoaJuridica(String nome, int numeroCliente, String cidade, String estado, int genero, String cnpj) {
		super(nome, numeroCliente, cidade, estado, genero);
		this.cnpj = cnpj;
				
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}


}
