package exercicio02;

public class Natal extends CartaoWeb{
	
	public Natal(String destinario) {
		setDestinatario(destinario);
	}
	
	@Override
	public void showMessage() {
		System.out.println("\n Feliz Natal, " + getDestinatario() 
		+ "\n Desejo um mondo cheio de cora��es felizes e alegres e em paz");
	}
}
