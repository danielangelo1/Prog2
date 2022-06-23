package exercicio06;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory {

	PaoIF pao;
	PresuntoIF presunto;
	SaladaIF salada;
	QueijoIF queijo;
	
	public void criarSanduiches() {
		pao.criarPao("Francës");
		presunto.criarPresunto("De frango");
		salada.criarSalada("Com verdura");
		queijo.criarQueijo("Mussarela");
	}

	
}
