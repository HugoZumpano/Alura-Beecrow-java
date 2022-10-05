package bee;

import java.util.Scanner;

public class MúltiplosDe13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int valorA, valorB, soma;

		valorA = scan.nextInt();
		valorB = scan.nextInt();
		soma = 0;

		if (valorA > valorB) {
			for (int i = valorB; i <= valorA; i++)
				if (i % 13 != 0)
					soma +=  i;
		} else {
			for (int i = valorA; i <= valorB; i++) {
				if (i % 13 != 0)
					soma += i;
			}
		}
		System.out.println(soma);
	}
}
