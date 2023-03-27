package heranca.carro;

public class Ferrari extends Carro {
	
	final static int velocidadeMaxima = 250;
	
	public Ferrari() {
		super(velocidadeMaxima);
	}
	
	public void acelerar() {
		if (super.velocidadeAtual < velocidadeMaxima) {
			super.velocidadeAtual += 80;
		} else {
			super.velocidadeAtual = velocidadeMaxima;
		}
	} 
	
}
