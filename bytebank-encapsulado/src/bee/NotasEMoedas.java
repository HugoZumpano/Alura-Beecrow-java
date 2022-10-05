package bee;

import java.util.Scanner;

public class NotasEMoedas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	

		double dinheiroTotal = scan.nextDouble();

		int notas = (int) dinheiroTotal;

		int moedas = (int) ((dinheiroTotal - notas) * 100);
		
		

		int nota100 = (int) notas / 100;

		notas -= nota100 * 100;
		int nota50 = (int) notas / 50;

		notas -= nota50 * 50;
		int nota20 = (int) notas / 20;

		notas -= nota20 * 20;
		int nota10 = (int) notas / 10;

		notas -= nota10 * 10;
		int nota05 = (int) notas / 5;

		notas -= nota05 * 5;
		int nota02 = (int) notas / 2;

		notas -= nota02 * 2;
		int moeda1 = (int) notas;

		notas -= moeda1 * 1;
		int moeda50 = moedas / 50;

		moedas -= moeda50 * 50;
		int moeda25 = (int) moedas / 25;

		moedas -= moeda25 * 25;
		int moeda10 =  moedas / 10;

		moedas -= moeda10 * 10;
		int moeda5 =  moedas / 5;

		moedas -= moeda5 * 5;
		int moeda01 = moedas;

		

		System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota05 + " nota(s) de R$ 5.00");
        System.out.println(nota02 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");
	
        
        scan.close();
		

	}

}
//576.73