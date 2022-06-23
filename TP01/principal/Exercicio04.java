package principal;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i, j;
		float [][]m = new float [12][4];
		float total =0, mes=0;
		
		for(i=0; i<m.length;i++)
		{
			System.out.println("Digite as vendas do mes: " + (i+1));
			for(j=0; j<m[i].length; j++) {
				System.out.println("Semana: " + (j+1));
				m[i][j] = ler.nextFloat();
			}
		}
		for(i=0; i<m.length; i++)
		{
			mes = 0;
			System.out.println("Mes "+ i + ":");
			for(j=0; j<m[i].length; j++) {
				System.out.println("Total vendido na semana " + (j+1) + ": " + m[i][j]);
				mes += m[i][j];
				total += m[i][j];
			}
			System.out.println("Total vendido no mes " + (i+1) + ": " + mes);
			
		}
		System.out.println("Total vendido no ano: " + total);
	}


}
