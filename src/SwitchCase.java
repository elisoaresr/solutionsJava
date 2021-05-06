//import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		
		case 1: 
			dia = "Domingo";
		break;
		
		case 2: 
			dia = "Segunda";
		break;
		
		case 3: 
			dia = "Terça";
		break;
		
		case 4: 
			dia = "Quarta";
		break;
		
		case 5: 
			dia = "Quinta";
		break;
		
		case 6: 
			dia = "Sexta";
		break;
		
		case 7: 
			dia = "Sábado";
		break;
		
		default:
			dia = "Valor Inválido";
		break;	
		
		}

		System.out.println("Dia da semana: " + dia);
		sc.close();
	} 

}


/* 
 	
Resolvendo o mesmo problema com If e Else; 		
 		
 		if (x == 1) {
			dia = "domingo";
		}
		
		else if (x == 2) {
			dia = "segunda";
		}
		
		else if (x == 3) {
			dia = "terça-feira";
		}
		
		else if (x == 4) {
			dia = "quarta-feira";
		}
		
		else if (x == 5) {
			dia = "quinta-feira";
		}
		
		else if (x == 6) {
			dia = "sexta-feira";
		}
		
		else if (x == 7) {
			dia = "sábado";
		}
		
		else {
			dia = "Valor Inválido!";
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
*/