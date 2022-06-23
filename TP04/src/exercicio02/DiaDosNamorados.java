package exercicio02;

public class DiaDosNamorados extends CartaoWeb{
	
	public DiaDosNamorados(String destinatario) {
		setDestinatario(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.println( "\n" + getDestinatario() + ","
				+ " Hoje é um dia muito especial \n" 
				+ "Vamos celebrar nosso amor \n" 
				+ "e tudo maravilhoso que temos vivido \n" 
				+ "Feliz dia dos namorados \n");
	}
}
