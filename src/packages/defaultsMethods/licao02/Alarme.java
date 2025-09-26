package packages.defaultsMethods.licao02;

public interface Alarme {
	default void emitirSom() {
		System.out.println("Som do Alarme padrão");
	}
}
