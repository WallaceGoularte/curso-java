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
		return "\n\nInforma��es do Produto\n\nNome: " + nome + "Pre�o: " + preco + "Quantidade: " + quantidade;
	}
}
