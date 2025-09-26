package packages.staticsMethods.licao01;

public class Application {

	public static void main(String[] args) {

		double valorReal = 100.0;
		double valorConvertido = Conversor.converterParaDolar(valorReal);
		System.out.println(String.format("%.2f", valorConvertido));
	}

}
