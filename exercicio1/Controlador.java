package exercicio1;

public class Controlador {
	
	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro("Caramelo");
		cao.setPeso(12);
		cao.setRaca("Vira-lata");
		
		System.out.println("Cachorro: ");
		System.out.println("Nome = " + cao.getNome());
		System.out.println("Peso = " + cao.getPeso());
		System.out.println("Raça = " + cao.getRaca());
		System.out.println();
		
		
		Peixe p1 = new Peixe("Peixonauta");
		p1.setPeso(5);
		p1.setTipoHabit("agua doce");
		
		System.out.println("Peixe: ");
		System.out.println("Nome = "+ p1.getNome());
		System.out.println("Peso = " + p1.getPeso());
		System.out.println("Habitat = "+ p1.getTipoHabit());
		
	}


}
