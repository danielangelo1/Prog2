package questao1b;

public class Produto {
	
	private String nome;
	private double preco;
	private String ID;
	
	public Produto(String nome, double preco, String ID) {
		this.nome = nome;
		this.preco = preco;
		this.ID = ID;
	}
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	
	

}
