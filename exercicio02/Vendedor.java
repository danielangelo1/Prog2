package exercicio02;

public class Vendedor extends Empregado {

	private double valorVendas;
	private int qntVendas;
	
	public Vendedor(String nome) {
		super(nome);
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public int getQntVendas() {
		return qntVendas;
	}
	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}
}
