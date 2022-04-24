package exercicio02;

public class Controlador {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Marcos");
		g1.setIdade(44);
		g1.setMatricula("23213");
		g1.setNomeGerencia("Marketing");
		g1.setSalario(4000);
		
		
		System.out.println("Gerente: ");
		System.out.println("Nome: " + g1.getNome());
		System.out.println("Idade: " + g1.getIdade());
		System.out.println("Matricula: " + g1.getMatricula());
		System.out.println("Salario: " + g1.getSalario());
		System.out.println("Valor do INSS: "+ g1.valorInss());
		
		System.out.println();
		
		
		Vendedor v1 = new Vendedor("Joao");
		v1.setIdade(23);
		v1.setSalario(1200);
		v1.setValorVendas(10);
		v1.setQntVendas(50);
		
		System.out.println("Vendedor");
		System.out.println("Nome: " + v1.getNome());
		System.out.println("Salario: " + v1.getSalario());
		System.out.println("Valor de Vendas: " + v1.getValorVendas());
		System.out.println("Quantidade de Vendas: " + v1.getQntVendas());
		
		System.out.println();
		
		Cliente c1 = new Cliente("Matheus");
		c1.setIdade(33);
		c1.setSexo("Masculino");
		c1.setValorDivida(200);
		c1.setAnoNascim(1989);
		
		System.out.println("Cliente: ");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Sexo: " + c1.getSexo());
		System.out.println("Valor da Divida: " + c1.getValorDivida());
		System.out.println("Ano de Nascimneto: " + c1.getAnoNascim());
		
		
	}
	
}
