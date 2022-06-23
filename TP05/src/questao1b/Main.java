package questao1b;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		int n =3;
		Scanner ler = new Scanner(System.in);
		HashSet<Produto> listaProdutos = new HashSet<>();
	

		//Criando os produtos
		Produto p1 = new Produto("Leite", 4.20, "A123");
		Produto p2 = new Produto("Biscoito", 2.60, "B673");
		Produto p3 = new Produto("Arroz", 24.50, "C145");
		
		//adicionado produtos ao hashset
		listaProdutos.add(p1);
		listaProdutos.add(p2);
		listaProdutos.add(p3);
		
		
		
		
	}

}
