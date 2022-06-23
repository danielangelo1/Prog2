/*A gerente do cabeleireiro Sempre Bela tem uma tabela em que registra os ”p´es”, as
”m˜aos e o servi¸co de podologia das cinco manicures. Sabendo-se que cada uma ganha 50% do que
faturou ao mˆes, criar um algoritmo que possa calcular e imprimir quanto cada uma vai receber, uma
vez que n˜ao tˆem carteiras.*/

package principal;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int manicure = 0, servico;
		int servicos[][] = new int [5][3];
		int i, j, soma;
		
		for(i=0; i < servicos.length; i++) {
			for(j=0; j< servicos[i].length; j++)
				servicos[i][j] = 0;
			}
		
		do {
			System.out.println("Informe a manicure: ");
			manicure = ler.nextInt();
			System.out.println("Informe o serviço realizado 1=pe 2=mao 3= podologia");
			servico = ler.nextInt();
			if(manicure >= 1 && manicure <= 5) {
				if (servico >= 1 && servico <=3)
					servicos[manicure-1][servico-1]++;
				else
					System.out.println("Serviço invalido");
				
			}
			else
				System.out.println("Manicure invalida");
		}while (manicure !=0);
		System.out.println("Salario das manicures: ");
		
		for(i=0; i< servicos.length; i++) {
			soma = (servicos[i][0] * 15 ) / 2 ;
			soma += (servicos[i][1] * 20) / 2;
			soma += (servicos[i][2] * 35) / 2;
			System.out.println("Manicure:" + i+1 + soma);
		}
		}
	

}
