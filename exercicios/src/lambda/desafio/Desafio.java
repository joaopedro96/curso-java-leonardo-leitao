package lambda.desafio;

import java.util.Formatter;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import oo.desafio.Produto;

public class Desafio {
	
	public static void main(String[] args) {

		Formatter formatter = new Formatter();
		
		Produto p1 = new Produto("iPad", 3235.9, 0.13);
		
		Function<Double, String> formatarPreco = preco -> formatter.format("%.2f", preco).toString();
		
		
		Function<Produto, Double> precoFinal = produto -> produto.getPrice() * (1 - produto.getDiscount()); 
		System.out.printf("Valor total: R$%.2f", precoFinal.apply(p1));

		
		
		UnaryOperator<Double> impostoTotal = precoTotal -> precoTotal >= 2500 ? precoTotal * 0.085 : 0;
		System.out.printf("\nImposto total: R$%.2f", impostoTotal.apply(p1.getPrice()));
		
		
		
		UnaryOperator<Double> freteTotal = precoTotal -> precoTotal >= 3000 ? 100.0 : 50.0;
		System.out.printf("\nFrete total: R$%.2f", freteTotal.apply(p1.getPrice()));
		
		System.out.printf("\nFrete total: R$%s", precoFinal.andThen(formatarPreco).apply(p1));

		formatter.close();
	}
	
}
