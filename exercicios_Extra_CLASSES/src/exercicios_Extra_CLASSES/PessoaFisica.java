package exercicios_Extra_CLASSES;

public class PessoaFisica extends Cliente {
	
	private String cpf;

	public PessoaFisica(String nome, int numeroCliente, String cidade, String estado, int genero, String cpf) {
		super(nome, numeroCliente, cidade, estado, genero);
		this.cpf = cpf;
				
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}
	
	
	

}
