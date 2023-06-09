package arrays;

import java.util.Scanner;

public class DesafioForEach {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o numero de notas: ");
		int numNotas = input.nextInt();
		
		double[] notas = new double[numNotas];
		
		for(int i = 0; i < numNotas; i++) {
			System.out.printf("Informe a nota %d: ", i + 1);
			notas[i] = input.nextDouble();
		}
			
		double totalNotas = 0;
		for(double nota: notas) {
			totalNotas = totalNotas + nota;
		}
		
		double media = totalNotas / numNotas;
		
		System.out.printf("\nSua media eh %.2f", media);
		
		input.close();
		
	}
}
