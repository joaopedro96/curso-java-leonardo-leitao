package heranca.teste;

import heranca.carro.Carro;
import heranca.carro.Civic;
import heranca.carro.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		
		Carro c1 = new Civic();
		Carro c2 = new Ferrari();
		
		c1.acelerar();
		c2.acelerar();
		
		System.out.println(c1.velocidadeAtual);
		System.out.println(c2.velocidadeAtual);
		
		c1.frear();
		c2.frear();

		
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		System.out.println(c1.velocidadeAtual);
		System.out.println(c2.velocidadeAtual);		
		
	}
	
}
