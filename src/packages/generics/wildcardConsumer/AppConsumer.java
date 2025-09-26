package packages.generics.wildcardConsumer;

import java.util.ArrayList;
import java.util.List;

public class AppConsumer {

	public static void main(String[] args) {

		List<Notebook> listaNotebooks = new ArrayList<Notebook>();
		listaNotebooks.add(new Notebook());
		listaNotebooks.add(new Notebook());
		listaNotebooks.add(new Notebook());
		
		//minha chamada inicial funciona, mas não é a forma ideial de fazer
		//para métodos estáticos a chamada deve ser feita com a seguinte estrutura
		//NomeDaClasse.nomeDoMetodo()
//		for (Notebook notebook : lista) {
//			notebook.contarProdutos(lista);
//		}
		
		//chamada correta
		Produto.contarProdutos(listaNotebooks);
	
	}

}
