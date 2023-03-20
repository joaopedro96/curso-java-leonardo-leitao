package fundamentos;

import java.util.Scanner;

public class MediaSalarial {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type your first payment: ");
		double firstPayment = Double.parseDouble(input.next().replace(",", "."));
		
		System.out.print("Type your second payment: ");
		double secondPayment = Double.parseDouble(input.next().replace(",", "."));
		
		System.out.print("Type your third payment: ");
		double thirdPayment = Double.parseDouble(input.next().replace(",", "."));
		
		Double meanPayment =  (firstPayment + secondPayment + thirdPayment) / 3;
		
		System.out.printf("Mean payment = %.2f", meanPayment);
		
		input.close();
	}
}
