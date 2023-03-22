package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String dataFormatada() {
		return String.format("hoje eh dia %d do mes %d do ano %d", dia, mes, ano);
	}
}
