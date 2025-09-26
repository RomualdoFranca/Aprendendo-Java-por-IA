package packages.compareTo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<Produto> listaProduto = new ArrayList<Produto>();
		listaProduto.add(new Produto("café", 14.88));
		listaProduto.add(new Produto("batata", 8.45));
		listaProduto.add(new Produto("açucar", 2.75));
		
		System.out.println("Lista sem ordenação");
		for (Produto produto : listaProduto) {
			System.out.println(produto);
		}
		
		System.out.println("\nLista com ordenação");
		//minha dúvida surgiu na hora de ordenar os objetos pelo preço
		//achei que seria necessário chamar o método de comparação aqui no main
		//mas não é necessário. Ao sobrescrever o metodo CompareTo() na clsse Produto
		//foi "ensinado" como deve ser feita a comparação dos objetos da classe
		//que  nesse caso foi a comparação pelo preço
		//O método .sort() da classe Collections é que vai ser responsável por realizar a comparação
		Collections.sort(listaProduto);
		
		for (Produto produto : listaProduto) {
			System.out.println(produto);
		}
		

		
	}

}
