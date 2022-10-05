package bee;

import java.util.Scanner;

public class Média2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double notaA, notaB, notaC,media;
		double pesoA, pesoB, pesoC;

		pesoA = 2;
		pesoB = 3;
		pesoC = 5;
		media = pesoA + pesoB + pesoC;
		notaA = scan.nextDouble();
		notaB = scan.nextDouble();
		notaC = scan.nextDouble();
		{
			if (notaA <= 10 && notaB <= 10 && notaC <= 10) {
				System.out.printf("MEDIA = %.1f\n", +((notaA * pesoA) + (notaB * pesoB) + (notaC * pesoC)) / media);

			}
			else System.out.println("Nota não pode ser superior a 10");
		}
	}

}
