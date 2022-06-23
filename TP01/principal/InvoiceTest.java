package principal;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite o numero: ");
		int number = ler.nextInt();
		
		System.out.println("Digite a descricao do produt: ");
		
		ler = new Scanner(System.in); 
		String desc = ler.nextLine();
		
		System.out.println("Quantidade do produto do pedido: ");
		int quant = ler.nextInt();
		
		System.out.println("Valor por um item");
		double valor = ler.nextDouble();
		
		Invoice inv = new Invoice(quant, quant, desc, valor);
		
		inv.setNumero(number);
		inv.setDescricao(desc);
		
		System.out.println("Numero: "+ inv.getNumero()+
				"\nDescrição: "+ inv.getDescricao()+
				"\nQuantidade: "+ inv.getQuantidade()+
				"\nValor: " + inv.getPreco());
		System.out.println();
		
		System.out.println("Valor total = "+ inv.getInvoiceAmount());
	}
}
