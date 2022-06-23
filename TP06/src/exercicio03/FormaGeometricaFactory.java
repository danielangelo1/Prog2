package exercicio03;

public class FormaGeometricaFactory {
	
	public FormaGeometrica getForma(String forma) {
		if(forma.equals("Quadrado")) {
			return new Quadrado(forma);
		} 
		else if(forma.equals("Triangulo")) {
			return new Triangulo(forma);
		}else {
			return new Circulo(forma);
		}
	}

}
