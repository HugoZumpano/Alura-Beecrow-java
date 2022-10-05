package bee;

import java.util.Scanner;

public class Média1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double notaA, notaB, media;
		double pesoA, pesoB;

		pesoA = 3.50;
		pesoB = 7.50;
		media = pesoA + pesoB;
		notaA = scan.nextDouble();
		notaB = scan.nextDouble();
		{
			if (notaA <= 10 && notaB <= 10) {
				System.out.printf("MEDIA = %.5f\n", +((notaA * pesoA) + (notaB * pesoB)) / media);

			}
			else System.out.println("Nota não pode ser superior a 10");
		}
	}
}
