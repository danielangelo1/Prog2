package exercicio01;

public class TesteSingleton {

	public static void main(String[] args) {
		
		Produto p1 = Produto.getInstance();
		
		p1.setNome("Leite Integral");
		p1.setPreco(4.80);
		p1.setQuantidade(50);
		
		System.out.println(p1);
	}
}
