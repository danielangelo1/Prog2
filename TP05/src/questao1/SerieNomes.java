package questao1;

import java.util.HashSet;
import java.util.Scanner;

public class SerieNomes {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		HashSet<String> listaNomes = new HashSet<>();
		int n = 5; // limitando a quantidade de nomes que podem ser inseridos

		// lendo os nomes e armazenando o Set
		for (int i = 0; i < n; i++) {
			System.out.println("\nInsira o nome que deseja inserir: ");
			listaNomes.add(ler.next());
		}
		System.out.println("Lista = " + listaNomes);

		System.out.println("\n--------------------------------");

		// removendo determinado nome
		System.out.println("\nDigite o nome que deseja excluir: ");
		String nomeExcluir = ler.next();
		if (listaNomes.contains(nomeExcluir)) {
			listaNomes.remove(nomeExcluir);
			System.out.println("O nome " + nomeExcluir + " foi excluido da lista.");
			System.out.println("Lista = "+ listaNomes);

		} else
			System.out.println("\nO nome digitado n�o existe");

		System.out.println("\n--------------------------------");

		// Verificando se o nome j� foi armazenado
		System.out.println("Digite o nome que deseja verificar se j� foi armazenado");
		String nomeVerificar = ler.next();
		if (listaNomes.contains(nomeVerificar))
			System.out.println("O nome j� est� armazenado na lista");
		else
			System.out.println("O nome ainda n�o foi armazenado");
		System.out.println("Lista = "+ listaNomes);


		System.out.println("\n--------------------------------");
		
		// apagando todos os nomes da lista
		System.out.println("Deseja apagar todos os nomes da lista?\n Digite 1= SIM, 2 = N�O");
		int apagador = ler.nextInt();
		if(apagador == 1) {
			listaNomes.clear();
			System.out.println("A lista foi apagada");
			System.out.println("Lista vazia = " + listaNomes);
		}else {
			System.out.println("A lista n�o foi apagada");
			System.out.println("Lista = "+ listaNomes);
		}
			
		// codigo um pouco rustico mas funcional kkkk 

	}
}
