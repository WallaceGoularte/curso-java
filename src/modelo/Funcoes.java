package modelo;

public class Funcoes extends Produto{

	
	public Double totalValorEmEstoque(){
		return preco * quantidade;
	}
	
	public void addProduto(Integer quantidade) {
		this.quantidade += quantidade;
	}
	
	public void delProduto(Integer quanidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return "\n\nInformações do Produto\n\nNome: " + nome + "Preço: " + preco + "Quantidade: " + quantidade;
	}
}
