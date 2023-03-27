package heranca;

public class Carro {
	
	int velocidadeAtual = 0;
	
	final int velocidadeMaxima;
	
	Carro(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	void acelerar() {
		if (velocidadeAtual < velocidadeMaxima) {
			velocidadeAtual += 5;
		}
	}
	
	void frear() {
		if (velocidadeAtual > 0) {
			velocidadeAtual -= 5;
		}
	}

}