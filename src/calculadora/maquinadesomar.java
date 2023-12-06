package calculadora;

public class maquinadesomar {
	public double somar(double... numeros) {
		double sum = 0;
		if(numeros.length > 0)
			for (double number : numeros) {
				sum += number;
			}
		return sum;
	}

}
