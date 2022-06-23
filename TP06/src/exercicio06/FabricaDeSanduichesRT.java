package exercicio06;

public class FabricaDeSanduichesRT implements SanduichesIngredientFactory {
	
	PaoIF pao;
	PresuntoIF presunto;
	SaladaIF salada;
	QueijoIF queijo;
	
	public void criarSanduiches() {
		pao.criarPao("Bola");
		presunto.criarPresunto("De peru");
		salada.criarSalada("sem verdura");
		queijo.criarQueijo("Cheedar");
	}

}
