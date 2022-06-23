package exercicio03;

public class Teste {

	public static void main(String[] args) {
		
		FormaGeometricaFactory factory = new FormaGeometricaFactory();
		
		factory.getForma("Circulo");
		factory.getForma("Triangulo");
		factory.getForma("Quadrado");
	}
}
