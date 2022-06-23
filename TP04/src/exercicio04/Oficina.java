package exercicio04;

import java.util.Random;

public class Oficina {
	
	public Veiculo proximo() {
		Random r = new Random();
		int valor = r.nextInt();
		
		if((valor %2) == 0)
			return new Bicicleta();
		else
			return new Automovel();
	}
	
	public void manuntencao(Veiculo v) {
		if(v instanceof Automovel ) {
			((Automovel) v).ajustar();
			((Automovel) v).limpar();
			((Automovel) v).listarVerificacoes();
			((Automovel) v).mudarOleo();
		}
		else {
	        ((Bicicleta) v).ajustar();
	        ((Bicicleta) v).limpar();
	        ((Bicicleta) v).listarVerificacoes();
		}
	}
}
