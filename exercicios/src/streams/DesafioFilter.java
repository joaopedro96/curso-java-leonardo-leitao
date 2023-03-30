package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import oo.desafio.Produto;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("banana", 100, 0.35, true);
		Produto p2 = new Produto("melao", 100, 0.25, false);
		Produto p3 = new Produto("bola", 100, 0.45, true);
		Produto p4 = new Produto("ps5", 100, 0.60, false);
		Produto p5 = new Produto("pc", 100, 0.10, true);
		Produto p6 = new Produto("iphone", 100, 0.0, true);
		Produto p7 = new Produto("arroz", 100, 0.30, true);
		
		
		
		List<Produto> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		Predicate<Produto> isSaleCheap = product -> product.getDiscount() >= 0.3;
		
		
		products.stream()
			.filter(isSaleCheap)
			.filter(product -> product.getFreeShipping())
			.map(product -> product.getName())
			.forEach(System.out::println);
	}
	
}
