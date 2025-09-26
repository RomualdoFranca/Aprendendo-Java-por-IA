package packages.compareTo;

public class Produto implements Comparable<Produto> {

	private String nome;
	private Double preco;

	public Produto() {

	}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int compareTo(Produto outroProduto) {

		//lógica para comparar os objetos pelo preço
//		if(this.preco < outroProduto.getPreco()) {
//			return -1;
//		}else if(this.preco > outroProduto.getPreco()) {
//			return 1;
//		}
//		return 0;
		
		//
		//lógica para comparar os objetos pelo nome
//		if(this.nome.compareTo(outroProduto.getNome()) < 0) {
//			return -1;
//		}else if(this.nome.compareTo(outroProduto.getNome()) > 0) {
//			return 1;
//		}
//		return 0;
		
		//código simplificado
		// o retorno do String.compareTo() já é um número negativo, zero ou positivo. Para o método Collections.sort(),
		//o valor exato (se é -5 ou -1) não importa; importa apenas o sinal (negativo, positivo ou zero).
		return this.nome.compareTo(outroProduto.getNome());
		
	}
	
	@Override
	public String toString() {
		return String.format("%-8s- %.2f", getNome(), getPreco());
	}

}
