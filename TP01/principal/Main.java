/*Quest˜ao 1. A gerente do cabeleireiro Sempre Bela tem uma tabela em que registra os ”p´es”, as
”m˜aos e o servi¸co de podologia das cinco manicures. Sabendo-se que cada uma ganha 50% do que
faturou ao mˆes, criar um algoritmo que possa calcular e imprimir quanto cada uma vai receber, uma
vez que n˜ao tˆem carteiras.*/

package principal;

public class Main {
	
	public static int soma(int a, int b)
	{
		int resultado = a + b;
		a = 100000;
		return resultado;
	}

	public static void main(String[] args) {
		

		int a = 10;
		int b = 50;
				
		int ret = soma(a,b);
		
		int vetor[] = new int[10];
		vetor[0] = 10;
		vetor[1] = 20;
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		
		testeReferencia(vetor);
		
		System.out.println(vetor[0]);
		
		System.out.println(vetor[1]);
	
		
		System.out.println("Soma é igual a: " + ret);
	}
		public static void testeReferencia(int v[])
		{
			v[0] = 100000;
			v[1] = 999999;
		}
	}