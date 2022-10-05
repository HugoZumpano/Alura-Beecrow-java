package bee;

import java.util.Scanner;

public class ProdutoSimples {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int valor1, valor2;

		valor1 = scan.nextInt();
		valor2 = scan.nextInt();

		int prod = valor1 * valor2;

		System.out.printf("PROD = %d\n  ", + prod);

	}

}
