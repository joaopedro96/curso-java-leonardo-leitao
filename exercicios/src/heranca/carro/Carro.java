package heranca.carro;

public class Carro {
	
	public int velocidadeAtual = 0;
	
	final int velocidadeMaxima;
	
	Carro(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void acelerar() {
		if (velocidadeAtual < velocidadeMaxima) {
			velocidadeAtual += 5;
		}
	}
	
	public void frear() {
		if (velocidadeAtual > 0) {
			velocidadeAtual -= 5;
		}
	}

}
