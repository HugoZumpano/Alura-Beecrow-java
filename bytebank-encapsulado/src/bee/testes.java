package bee;
import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;
import java.util.Scanner;

public class testes {

	public static void main(String[] args) throws IOException {
		
		int valorA, valorB, valorC, valorD;
		
		Scanner scan = new Scanner(System.in);
		
		valorA = scan.nextInt();
		valorB = scan.nextInt();
		valorC = scan.nextInt();
		valorD = scan.nextInt();
		
		if (valorB > valorC && valorD > valorA && valorC > 0 && valorD > 0 && (valorC + valorD) > 
		(valorA + valorB) && valorA % 2 == 0) {
			System.out.println("Valores aceitos");
			
		}else {
			System.out.println("Valores nao aceitos");
			
		}

	}
}
