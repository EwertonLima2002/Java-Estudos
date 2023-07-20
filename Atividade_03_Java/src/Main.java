import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    int a , b , c , d;
    int total;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Insira o primeiro Valor");
    a = teclado.nextInt();  
    System.out.println("Insira o segundo Valor");
    b = teclado.nextInt();   
    System.out.println("Insira o terceiro Valor");
    c = teclado.nextInt();   
    System.out.println("Insira o quarto Valor");
    d = teclado.nextInt();   
    
    total = a * b - c * d;
    
    System.out.println("A diferença de valores é de " + total);
    
    teclado.close();
    
	}

}
