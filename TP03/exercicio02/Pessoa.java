package exercicio02;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;

	public Pessoa(String nome) {
		this.nome = nome;
		this.idade = 0;
		this.sexo = "nao sei";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
