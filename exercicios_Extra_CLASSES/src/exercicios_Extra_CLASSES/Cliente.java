package exercicios_Extra_CLASSES;

public class Cliente {
	
	private String nome;
	private int numeroCliente;
	private int cpf;
	private int genero;
	private String local;

	public Cliente (String nome, int numeroCliente, int cpf, int genero, String local) {
		
		this.nome = nome;
		this.numeroCliente = numeroCliente;
		this.cpf = cpf;
		this.genero = genero;
		this.local = local;
}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnumeroCliente() {
		return numeroCliente;
	}

	public void setnumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public void visualizar() {
		
		String genero = "";

		switch (this.genero) {
		case 1 -> genero = "Feminino";
		case 2 -> genero = "Masculino";
		case 3 -> genero = "Não-Binário";
		}
		
		
		System.out.println("\n\n*************************************");
		System.out.println("         Dados do Cliente:          ");
		System.out.println("*************************************");
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Numero do Cliente: " + this.numeroCliente);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Genero: " + genero);
		System.out.println("Local: " + this.local);
	}
}
