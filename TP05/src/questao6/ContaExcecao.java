package questao6;

public class ContaExcecao extends Exception{
	
	boolean sacar(double valor) {
		if(this.saldo < valor) {
			return false;
		
		}else {
			this.saldo -= valor;
			return true;
		}
	}

}
