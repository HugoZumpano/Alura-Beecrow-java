package bee;

import java.util.Scanner;

public class DistânciaEntreDoisPontos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double pontaX1 , pontoX2 , pontoY1 , pontoY2;
		double  distancia;
		

		 pontaX1 = scan.nextDouble();
		 pontoY1 = scan.nextDouble();
		 pontoX2 = scan.nextDouble();
		 pontoY2 = scan.nextDouble();

		 distancia = Math.sqrt(Math.pow((pontoX2 - pontaX1), 2) + Math.pow((pontoY2- pontoY1), 2));
		
		
		System.out.println(String.format("%.4f", distancia));

	}

}
