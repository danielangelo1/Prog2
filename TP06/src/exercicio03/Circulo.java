package exercicio03;

public class Circulo implements FormaGeometrica {
	
	private String forma;
	
	public Circulo(String forma) {
		this.forma = forma;
		desenhar();
	}


	@Override
	public void desenhar() {
		System.out.println("A seguinte foma geométrica foi desenhada: CIRCULO ");
	}
}
