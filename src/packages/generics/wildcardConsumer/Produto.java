package packages.generics.wildcardConsumer;

import java.util.List;

public class Produto {

	public static void contarProdutos(List<? extends Produto> lista) {
		System.out.println("Tamanho da lista: " + lista.size());
	}
}
