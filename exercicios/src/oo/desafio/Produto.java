package oo.desafio;

public class Produto {

	String nome;
	double preco;
	double desconto;
	boolean freteGratis;
	
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public Produto(String nome, double preco, double desconto, boolean freteGratis) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.freteGratis = freteGratis;
	}
	
	public double getPrice() {
		return preco;
	}
	
	public double getDiscount() {
		return desconto;
	}
	
	public boolean getFreeShipping() {
		return freteGratis;
	}
	
	public String getName() {
		return nome;
	}
}
