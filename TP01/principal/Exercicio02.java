/*Uma floricultura conhecedora de sua clientela gostaria de fazer um algoritmo que
pudesse controlar sempre um estoque m´ınimo de determinadas plantas, pois todo dias, pela manh˜a, o
dono faz novas aquisi¸c˜oes. Criar um algoritmo que deixe cadastrar 50 tipos de plantas e nunca deixar
o estoque ficar abaixo do ideal. Para cada planta, o dono gostaria de cadastrar o nome, o estoque ideal
e a quantidade em estoque. Dessa forma o algoritmo pode calcular a quantidade que o dono da loja
precisa comprar no pr´oximo dia. Essa quantidade a ser comprada deve ser impressa (quando maior que
zero) como uma lista para o dono da floricultura.
*/

package principal;

import java.util.Scanner;

public class Exercicio02 {

	
	public static void main(String[] args) {
		
		String [] nomes = new String[50];
		int estoque[][] = new int [50][2];
		int i;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os dados das 50 plantas:");
		for(i=0; i <5; i++)
		{
			System.out.println("Digite o nome da planta: ");
			nomes[i] = ler.next();
			System.out.println("Digite o estoque atual:");
			estoque[i][0] = ler.nextInt();
			ler = new Scanner(System.in);
			System.out.println("Digite o estoque minimo: ");
			estoque[i][1] = ler.nextInt();
			
		}
		System.out.println("Plantas abaixo do estoque e que precisam serem compradas: ");
		System.out.println("Nome" + " Estoque Atual" + " Estoque Minimo");
		for(i=0; i<5; i++)
		{
			if(estoque[i][0] < estoque[i][1])
			{
				System.out.print(nomes[i]);
				System.out.println("     " + estoque[i][0] + "              " + estoque[i][1]);
			}
		}
	}
}