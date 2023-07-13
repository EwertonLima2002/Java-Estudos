import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
     
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     
     String a;
     int b;
     double c;
     
     a = sc.next();
     b = sc.nextInt();
     c = sc.nextDouble();
     
     System.out.println(a);
        System.out.println(b);
           System.out.println(c);
     sc.close();
     
     }
     
     
     
	}


