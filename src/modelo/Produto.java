package modelo;

public class Produto {
	//Atributos
	public String nome;
	public Double preco;
	public Integer quantidade;
	
	//Metodos & Funções
	public Double totalValorEmEstoque(){
		return preco * quantidade;
	}
	
	public void addProduto(Integer quantidade) {
		this.quantidade += quantidade;
	}
	
	public void delProduto(Integer quanidade) {
		this.quantidade -= quantidade;
	}
	
	//Construtor Vazio
	public Produto() {
	}
	
	//Sobrecarga & Sobrescrita (ou override)
	//Construtor Cheio
	public Produto(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//Getters & Setters - Encapsulamento
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco(Double preco) {
		return preco;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	//Metodo toString
	public String toString() {
		return "\n\nInformações do Produto\n\nNome: " + nome + "\nPreço: " + preco + "\nQuantidade: " + quantidade;
	}
	
		

}
