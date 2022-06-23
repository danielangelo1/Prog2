package exercicio1;

public class Peixe extends Animal{

	private String tipoHabit;
	
	public Peixe(String nome) {
	super(nome);
	}
	
	public String getTipoHabit() {
		return tipoHabit;
	}

	public void setTipoHabit(String tipoHabit) {
		this.tipoHabit = tipoHabit;
	}
	
}
