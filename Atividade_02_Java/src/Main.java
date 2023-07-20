import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		double entrada_raio;
		Scanner teclado = new Scanner(System.in);
		
		
		 System.out.println("Insira o valor do raio: ");
		 entrada_raio = teclado.nextDouble();
		 
		 double area = Math.PI * entrada_raio * entrada_raio;
		 
		 teclado.close();
		 
		 System.out.println("A Aréa total do círculo é " + area);

	}

}
