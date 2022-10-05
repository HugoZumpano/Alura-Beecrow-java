package bee;
import java.util.Scanner;

public class OMaior {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valorA, valorB , valorC, maiorAB , resultado;
		
		
		valorA = scan.nextInt();
		valorB = scan.nextInt();
		valorC = scan.nextInt();
		
		maiorAB = ( valorA + valorB + Math.abs(valorA - valorB)) / 2 ;
		resultado =( maiorAB + valorC + Math.abs(maiorAB - valorC)) / 2;
		
		System.out.println(resultado + " eh o maior");
		
		
	}

} 
