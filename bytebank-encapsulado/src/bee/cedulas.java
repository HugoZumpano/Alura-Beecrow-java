package bee;

import java.util.Scanner;

public class cedulas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int valorTotal = scan.nextInt();
		
		int valorAtual = valorTotal;
	
	
		
		
		int nota100 = valorAtual / 100;
		
		valorAtual -= nota100 * 100;
		int nota50 =  valorAtual / 50;
		
		valorAtual -= nota50 * 50;
		int nota20 = valorAtual /20;
		
		valorAtual -= nota20 * 20;
		int nota10 = valorAtual /10;
		
		valorAtual -= nota10 *10;
		int nota05 = valorAtual /5;
		
		valorAtual -= nota05 * 5;
		int nota02 = valorAtual / 2;
		
		valorAtual -= nota02 * 2;
		int nota01 = valorAtual;
		
		System.out.println(valorTotal);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota05 + " nota(s) de R$ 5,00");
		System.out.println(nota02 + " nota(s) de R$ 2,00");
		System.out.println(nota01 + " nota(s) de R$ 1,00");
		
		
		
		
		
		scan.close();
		

	}

}
