package exercicio08;

public class Teste {
	
	public static void main(String[] args) {
		
		MedidorFarenheit temp = new MedidorFarenheit();
		MedidorCelsiusIF tempCelsius = new AdaptadorTemperatura(temp);
		System.out.println("Temperatura em Celsius: " + tempCelsius.medirTemperatura());
	}

}
