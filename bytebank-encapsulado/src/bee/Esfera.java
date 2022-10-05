package bee;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double raio, formulaEsfera;

		raio = scan.nextDouble();

		formulaEsfera = (4 / 3.0) * 3.14159 * (raio * raio * raio);

		System.out.printf("VOLUME = %.3f\n", +formulaEsfera);

	}

}
