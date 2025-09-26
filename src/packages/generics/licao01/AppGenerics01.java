package packages.generics.licao01;

public class AppGenerics01 {

	public static void main(String[] args) {

		Par<String, Double> par01 = new Par<String, Double>("String 1", 1.0);
		String stg = par01.getPrimeiro();
		Double db = par01.getSegundo();
		System.out.println(String.format("%s\n%.2f", stg, db));
	}

}
