import java.util.Locale;

public class Atividade {

	public static void main(String[] args) {
		String product_1 = "Computer";
		String product_2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
	    double price_2 = 650.50;
	    double measuge = 52.3453563;
	    
	    System.out.println("Products:");
	    System.out.printf("%s, which price is $%.1f%n", product_1, price1);
	    System.out.printf("%s , which price is $%.2f%n", product_2, price_2);
	    System.out.println();
	    System.out.printf("Record: %d years old, code %d and gender %c%n", age, code, gender);
	    System.out.println();
	    System.out.println("Measue with eight decimal places: " + measuge);
	    System.out.printf("Rounded (three decimal places): %.3f%n", measuge);
	    Locale.setDefault(Locale.US);
	    System.out.printf("US decimal point: %.3f%n", measuge);
	}

}
