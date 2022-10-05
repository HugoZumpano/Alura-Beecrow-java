package bee;
import java.util.Scanner;

public class Diferença {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valorA , valorB, valorC, valorD;
		
		valorA = scan.nextDouble();
		valorB = scan.nextDouble();
		valorC = scan.nextDouble();
		valorD = scan.nextDouble();
		
		
		System.out.printf("DIFERENCA = %.0f\n", + (valorA * valorB) - (valorC * valorD));	
		
		

	}

}
