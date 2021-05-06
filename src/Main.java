import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X = sc.nextInt();
		double R = sc.nextInt();
		double S = sc.nextDouble();
		
		double salary =  R * S;
		
		System.out.printf("Crachá %.0f%n", X);
		System.out.printf("O salário é: %.2f%n", salary);

		sc.close();
	}

}

