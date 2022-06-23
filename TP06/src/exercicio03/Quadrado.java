package exercicio03;

public class Quadrado implements FormaGeometrica{
	
	private String forma;
	
	public Quadrado(String forma) {
		this.forma = forma;
		desenhar();
	}
	
	@Override
	public void desenhar() {
		System.out.println("A seguinte foma geométrica foi desenhada: QUADRADO");
	}
}
