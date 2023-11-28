package exercicio_Farmacia.model;

public class Medicamento extends Produto {
	
	private String generico;

	public Medicamento(int id, String nome, int tipo, float preco, String generico) {
		super(id, nome, tipo, preco);
		this.generico = generico;
		
		
	}

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}
	
	public void visualizar() {
		super.visualizar(); //NAO ESQUECER DE CHAMAR A CLASSE SUPER PARA VISUALIZAÇÃO
		System.out.println("Generico");
	}

}
