package exercicio02;

public class Aniversario extends CartaoWeb{
	
	public Aniversario(String destinario) {
		setDestinatario(destinario);
	}

	@Override
	public void showMessage() {
		System.out.println("\n Feliz aniversário, " + getDestinatario()
		+ "\n Que sua vida seja cheia de bons e felizes momentos"); 
	}
}
