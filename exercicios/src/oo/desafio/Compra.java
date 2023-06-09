package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		Item item = new Item(nome, quantidade, preco);
		itens.add(item);
	}
	
	double obterValorTotal() {
		double valorTotal = 0;
		for(Item item: itens) {
			valorTotal += item.quantidade * item.produto.preco;
		}
		return valorTotal;
	}
}
