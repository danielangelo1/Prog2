package exercicio03;

public class Triangulo implements FormaGeometrica{
	
	private String forma;

	public Triangulo(String forma) {
		this.forma = forma;
		desenhar();
		
	}
	
	@Override
	public void desenhar() {
		System.out.println("A seguinte foma geométrica foi desenhada: TRIANGULO");
	}
}
