import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String nome = "Ewerton";
		int n = 25;
		double quebrado = 10.276635548;
		
		System.out.println(n);
		System.out.println(quebrado);
		System.out.printf("%.2f%n", quebrado);
		System.out.printf("%.4f%n", quebrado);
        Locale.setDefault(Locale.US);
    	System.out.printf("%.4f%n", quebrado);
    	
    	System.out.println("Você tem " + n + " Anos");
    	
    	System.out.printf("%s tem %d Anos e ganha R$%.2f reais %n ", nome, n, quebrado);
	}

}
