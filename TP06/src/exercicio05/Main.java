package exercicio05;

public class Main {

	public static void main(String[] args) {
		
		
		//criando carros da fiat
		FabricaDeCarro fabrica = new FabricaFiat();
		CarroPopular popular = fabrica.criarCarroPopular();
		CarroSedan sedan = fabrica.criarCarroSedan();
		
		popular.exibirInfoPopular();
		sedan.exibirInfoSedan();
		
		//crianod carros da ford
		FabricaDeCarro fabrica2 = new FabricaFord();
		popular = fabrica2.criarCarroPopular();
		sedan = fabrica2.criarCarroSedan();
		
		popular.exibirInfoPopular();
		sedan.exibirInfoSedan();
	}
}
