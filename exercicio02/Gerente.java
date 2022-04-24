package exercicio02;

public class Gerente extends Empregado{
	
	private String nomeGerencia;
	
	public Gerente(String nome) {
		super(nome);
	}

	public String getNomeGerencia() {
		return nomeGerencia;
	}

	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}

}
