package principal;

import java.util.Scanner;

public class Exercicio10 {

	public static void main (String[] args) {
		
		int num;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero a ser decomposto: ");
		num = ler.nextInt();
		
		System.out.println("Numero decomposto em fatores primos: ");
		for(int i =2; num > 1; i++)
		{
			while(num % i == 0) {
				System.out.print(" "+ i);
				num /= i;
			}
		}
	}
			
		
}
