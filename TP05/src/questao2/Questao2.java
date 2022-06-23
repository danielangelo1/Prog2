package questao2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Questao2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		HashMap<String, String> empregados = new HashMap<String, String>();
		
		empregados.put("a1234", "Steve Jobs");
		empregados.put("a1235", "Scott McNealy");
		empregados.put("a1236", "Jeff Bezos");
		empregados.put("a1237", "Larry Ellison");
		empregados.put("a1238", "Bill Gates");
		
		System.out.println("Digite a ID do funcionario que deseja procurar: ");
		String pessoa = ler.next();
		
		System.out.println("Nome desse empregado: ");
		System.out.println(empregados.get(pessoa.toLowerCase())+ " "); // Acha o funcionario independente de ser maiusculo ou minusculo
		// retorna null caso id nao esteja mapeado 
		
		// percorrendo o mapa e imprimindo suas chaves
		Set<String> chaves = empregados.keySet();
		System.out.println("\n------Funcionarios cadastrados:----------");
		System.out.println("  ID       Nome");
		for(String chave: chaves) {
			System.out.println(chave + "    " + empregados.get(chave));
		}
		System.out.println("-----------------------------------------");
	}

}
