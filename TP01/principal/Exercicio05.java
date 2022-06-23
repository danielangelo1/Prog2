package principal;

import java.util.Scanner;

public class Exercicio05 {

	public static void main (String[] args) {
		
		int [][]matriz = new int [3][3];
		int i,j;
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0; i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Digite o elemento da linha " + (i+1) + " da coluna " + (j+1) + ": ");
				matriz[i][j] = ler.nextInt();
				System.out.println("");
			}
		}
		
		System.out.println("Matriz invertida: ");
		for(i=2;i>=0;i--)
		{
			System.out.print(matriz[i][0]);
		}
	    System.out.println(" ");
		for(i=2;i>=0;i--)
		{
			System.out.print(matriz[i][1]);
		}
	    System.out.println(" ");
		for(i=2;i>=0;i--)
		{
			System.out.print(matriz[i][2]);
		}

	}
	
}
