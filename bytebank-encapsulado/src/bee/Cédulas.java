package bee;
import java.util.Scanner;

public class Cédulas {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 
	        int notas = scan.nextInt();
	        
	        int atual = notas;
	        
	        int notas100 = atual / 100; //5,76
	        // 576 - 5 * 100 = 76
	        atual = atual -  notas100 * 100; 
	        int notas50 = atual / 50;
	        // 76 - 50 =   26
	        atual -= notas50 * 50;
	        int notas20 = atual / 20;
	        
	        
	        atual -= notas20 * 20;
	        int notas10 = atual / 10;
	        
	        atual -= notas10 * 10;
	        int notas5 = atual / 5;
	        
	        atual -= notas5 * 5;
	        int notas2 = atual / 2;
	        
	        atual -= notas2 * 2;
	        int notas1 = atual;
	        
	        System.out.println(notas);
	        System.out.println(notas100 + " nota(s) de R$ 100,00");
	        System.out.println(notas50 + " nota(s) de R$ 50,00");
	        System.out.println(notas20 + " nota(s) de R$ 20,00");
	        System.out.println(notas10 + " nota(s) de R$ 10,00");
	        System.out.println(notas5 + " nota(s) de R$ 5,00");
	        System.out.println(notas2 + " nota(s) de R$ 2,00");
	        System.out.println(notas1 + " nota(s) de R$ 1,00");
		
		
		

	}

}
