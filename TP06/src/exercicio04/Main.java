package exercicio04;

public class Main {
	
	public static void main(String[] args) {
		
		FactoryLanchonete lanche1 = new FactoryLanchoneteCG();
		lanche1.criarSanduiche();
		
		FactoryLanchonete lanche2 = new FactoryLanchoneteJP();
		lanche2.criarSanduiche();
		
		FactoryLanchonete lanche3 = new FactoryLanchoneteRT();
		lanche3.criarSanduiche();
		
	}

}
