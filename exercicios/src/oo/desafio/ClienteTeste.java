package oo.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Joao");
		c1.compra.adicionarItem("Bola", 5, 10);
		
		System.out.println(c1.compra.obterValorTotal());
		
		c1.compra.adicionarItem("Bala", 10, 10);
		System.out.println(c1.compra.obterValorTotal());
		
		System.out.println(c1.compra.itens);

		
	}
	
}
