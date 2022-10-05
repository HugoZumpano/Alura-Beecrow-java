package bee;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int diasTotalAtual;

		diasTotalAtual = scan.nextInt();

//		int ano = diasTotalAtual / 365;
//
//		diasTotalAtual -= ano * 365;
//		int mes = diasTotalAtual / 30;
//
//		diasTotalAtual -= mes * 30;
//		int dias = diasTotalAtual / 1;

		int ano = diasTotalAtual / 365;
		int mes = (diasTotalAtual % 365) / 30;
		int dias = (diasTotalAtual % 365) % 30;

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dias + " dia(s)");



		scan.close();
	}

}
