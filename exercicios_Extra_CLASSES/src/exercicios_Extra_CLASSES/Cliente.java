package exercicios_Extra_CLASSES;

import cores.util.Cores;

public class Cliente {
	
	private String nome;
	private int numeroCliente;
	private String cidade;
	private String estado;
	private int genero;
	
	public static String theme = Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_RED_BOLD;
	

	public Cliente (String nome, int numeroCliente,String cidade, String estado, int genero) {
		
		this.nome = nome;
		this.numeroCliente = numeroCliente;
		this.cidade = cidade;
		this.estado = estado;
		this.genero = genero;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setLocal(String estado) {
		this.estado = estado;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	
	public void visualizar() {
		
		String genero = "";

		switch (this.genero) {
		case 1 -> genero = "Feminino";
		case 2 -> genero = "Masculino";
		case 3 -> genero = "Não-Binário";
		case 4 -> genero = "Não se aplica";
		}
		
		
		System.out.println(theme + "\n\n****************************************");
		System.out.println("         Dados do Cliente:              ");
		System.out.println("****************************************");
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Numero do Cliente: " + this.numeroCliente);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Estado: " + this.estado);
		System.out.println("Genero: " + genero);
		
	}
	
}


