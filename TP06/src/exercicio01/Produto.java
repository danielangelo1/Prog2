package exercicio01;

public class Produto {

	private static Produto instance;
	
	private String nome;
	private double preco;
	private int quantidade;
	
	private Produto() {
		
	}
	
	public static Produto getInstance() {
		if(instance == null) {
			instance = new Produto();
		}
		return instance;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public String toString() {
		return "Produto: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade;
	}
}
