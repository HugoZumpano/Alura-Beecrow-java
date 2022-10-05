package bee;

import java.util.Scanner;

public class CálculoSimples {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double codPeca01, codPeca02;
		double qtdPeca01, qtdPeca02;
		double valorPeca01, valorPeca02;

		codPeca01 = scan.nextDouble();
		qtdPeca01 = scan.nextDouble();
		valorPeca01 = scan.nextDouble();

		codPeca02 = scan.nextDouble();
		qtdPeca02 = scan.nextDouble();
		valorPeca02 = scan.nextDouble();

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", + (valorPeca01 * qtdPeca01) + (valorPeca02 * qtdPeca02));

	}

}
