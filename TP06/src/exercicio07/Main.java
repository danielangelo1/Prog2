package exercicio07;

public class Main {

	public static void main(String[] args) {
		AdaptadorSoma adapter = new AdaptadorSoma();
		Cliente cliente = new Cliente(adapter);
		cliente.executar();
	}
}
