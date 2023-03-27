package heranca;

public class Ferrari extends Carro {
	
	final static int velocidadeMaxima = 250;
	
	Ferrari() {
		super(velocidadeMaxima);
	}
	
	void acelerar() {
		if (super.velocidadeAtual < velocidadeMaxima) {
			super.velocidadeAtual += 80;
		} else {
			super.velocidadeAtual = velocidadeMaxima;
		}
	} 
	
}
