package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 4;
		d1.mes = 3;
		d1.ano = 2022;
		
		System.out.printf(d1.dataFormatada());
	}
}
