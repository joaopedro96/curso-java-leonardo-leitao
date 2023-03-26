package oo.desafio;

public class Item {

	int quantidade;
	String nome;
	Produto produto;
	
	Item(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.produto = new Produto(nome, preco);
	}
	
	public String toString() {
		return nome;
	}
}
