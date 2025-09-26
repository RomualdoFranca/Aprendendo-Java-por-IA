package packages.defaultsMethods.licao01;

public class Application {

	public static void main(String[] args) {

		Televisao tv = new Televisao();
		tv.ligar();
		//metodo default herdado pela classe que implementa a interface
		tv.desligar();
	}

}
