package fundamentos;

import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Qual a sua idade?");
		int idade = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Qual o seu nome?");
		String nome = teclado.nextLine();
				
		System.out.print("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		
		
		System.out.println("\n");
		System.out.printf("%s %s tem idade de %d anos", nome, sobrenome, idade);
		teclado.close();
	}
}
