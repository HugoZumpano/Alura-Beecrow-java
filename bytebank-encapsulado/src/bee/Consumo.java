package bee;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double kmRodado ; 
		double LitrosConsumido , consumoMedio ;
		
		kmRodado = scan.nextInt();
		LitrosConsumido = scan.nextDouble();
		
		consumoMedio = kmRodado / LitrosConsumido;
		
		
		System.out.printf("%.3f km/l\n", + consumoMedio );
		
		

	}

}
