package packages.defaultsMethods.licao01;

public interface AparelhoEletronico {
	//metodo abstrato sem corpo
	void ligar();

	//metodo default
	default void desligar() {
		System.out.println("Desligando utilizando o método padrão.");
		
	}
}
