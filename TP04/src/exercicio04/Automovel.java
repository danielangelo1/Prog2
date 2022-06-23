package exercicio04;

public class Automovel extends Veiculo {
	
	@Override
	public void listarVerificacoes() {
		System.out.println("Verificando Automovel! ");
	}
	
	@Override
	public void ajustar() {
		System.out.println("Ajustando Automovel! ");
	}
	
	@Override
	public void limpar() {
		System.out.println("Limpando automovel! ");
	}
	
	public void mudarOleo() {
		System.out.println("Trocando oleo do automovel! ");
	}

}
