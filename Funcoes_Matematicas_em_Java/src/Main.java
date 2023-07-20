import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num_1;
	int num_2;
	double x;
	 
	num_1 = sc.nextInt();
	num_2 = sc.nextInt();
	
	x = num_1 + num_2;
	
	System.out.println("Entrada de Números");
	System.out.println("Primeiro número digitado " +  num_1);
	System.out.println("Segundo número digitado" +  num_2);
	System.out.println("A soma dos dois valores são " + x);
	
	
	}

}
