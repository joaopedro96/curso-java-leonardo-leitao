package fundamentos;

public class ConversorTemperatura {
	public static void main(String[] args) {
		final double ajuste = 32.0;
		final double fator = 5.0 / 9.0;
		
		double temperaturaFarenheit = 86;
		double temperaturaCelsius = (temperaturaFarenheit - ajuste) * fator;
		
		System.out.println(temperaturaCelsius);
		
	}
}
