package projeto_programacaoCursoNelioAlves_udemy;

import java.util.Locale;

public class produtos {
	public static void main (String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		System.out.printf("Products %n%s, which price is $ %.2f %n%s, which price is $ %.2f %n%nRecord: %d years old, code %d and gender: %s %n%nMeasue with eight decimal places: %.8f %nRouded (three decimal places): %.3f", product1, price1, product2, price2, age, code, gender, measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS decimal point %.3f", measure);
	}

}
