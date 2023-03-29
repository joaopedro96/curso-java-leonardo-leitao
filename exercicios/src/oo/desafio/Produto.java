package oo.desafio;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public double getPrice() {
		return preco;
	}
	
	public double getDiscount() {
		return desconto;
	}
}
