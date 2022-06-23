package exercicio02;

import java.util.ArrayList;


public class Main {

		public static void main(String[] args) {		
			
			ArrayList<CartaoWeb> cartoes = new ArrayList<>();
			
			Aniversario cartaAniversario = new Aniversario("Joao");
			Natal cartaNatal = new Natal("Lucas");
			DiaDosNamorados cartaNamorados = new DiaDosNamorados("Samara");
			
			cartoes.add(cartaAniversario);
			cartoes.add(cartaNatal);
			cartoes.add(cartaNamorados);
			
			for (CartaoWeb c: cartoes) {
				c.showMessage();
			}
			
		}
	
}
