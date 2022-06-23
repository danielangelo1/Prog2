package exercicio06;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory{
	
	PaoIF pao;
	PresuntoIF presunto;
	SaladaIF salada;
	QueijoIF queijo;
	
	public void criarSanduiches() {
		pao.criarPao("Integral");
		presunto.criarPresunto("De frango");
		salada.criarSalada("sem verdura");
		queijo.criarQueijo("Prato");
	}


}
