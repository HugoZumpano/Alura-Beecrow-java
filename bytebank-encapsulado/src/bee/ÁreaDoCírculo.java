package bee;

import java.util.Scanner;

public class ÁreaDoCírculo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double raio ;
		double area = 0;

		raio = scan.nextDouble();

		area = 3.14159 * (Math.pow(raio,2));

		System.out.printf("A=%.4f\n", area);

	}

}
