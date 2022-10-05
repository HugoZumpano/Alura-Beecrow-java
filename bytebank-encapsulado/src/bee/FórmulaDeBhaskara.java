package bee;

import java.util.Scanner;

public class FórmulaDeBhaskara {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double a, b, c, r1, r2, delta;

		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

//		r1 = - b + (Math.sqrt(b * b)  - (4 * a * c)) / ( 2 * a);
//
//		r2 = - b - (Math.sqrt(b * b) - (4 * a * c)) / (2 * a);

		delta = (b * b) - 4 * (a * c);

		r1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
		r2 = ((-(b) - Math.sqrt(delta)) / (2 * a));

		if (a == 0 | delta < 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f\n", +r1);
			System.out.printf("R2 = %.5f\n", +r2);
		}
	}

}
