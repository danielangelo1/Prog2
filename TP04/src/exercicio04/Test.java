package exercicio04;

public class Test {
	
	public static void main(String[] args) {
		
		Oficina o = new Oficina();
		Veiculo v;
		
		for(int i=0; i <4; ++i) {
			v=o.proximo();
			o.manuntencao(v);
		}
	}

}
