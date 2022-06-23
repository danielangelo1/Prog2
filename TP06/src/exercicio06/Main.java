package exercicio06;

public class Main {
	
	public static void main(String[] args) {
		
		SanduichesIngredientFactory lanche1 = new SanduichesIngredientFactoryCG();
		lanche1.criarSanduiches();
		
		SanduichesIngredientFactory lanche2 = new SanduichesIngredientFactoryJP();
		lanche2.criarSanduiches();
		
		SanduichesIngredientFactory lanche3 = new FabricaDeSanduichesRT();
		lanche3.criarSanduiches();
		
	}

}
