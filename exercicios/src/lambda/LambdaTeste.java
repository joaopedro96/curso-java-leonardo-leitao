package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaTeste {
	
	static void printText(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		
		List<String> pessoas = Arrays.asList("Ana", "Bia", "Lia", "Mia");
		
		System.out.println("ForEach convencional:");
		for(String nome: pessoas) {
			System.out.println(nome);
		}
		
		
		
		System.out.println("\nLambda 01:");
		pessoas.forEach(nome -> System.out.println(nome));
		
		
		
		System.out.println("\nMethod Reference 01:");
		pessoas.forEach(System.out::println);
		
		
		
		System.out.println("\nMethod Reference 02:");
		pessoas.forEach(LambdaTeste::printText);
	}
}
