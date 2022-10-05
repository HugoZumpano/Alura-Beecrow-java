package bee;

import java.util.Scanner;

public class ConversãoDeTempo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int segundosTotal, segundosAtual;

		segundosTotal = scan.nextInt();

		segundosAtual = segundosTotal;

		int horas = segundosAtual / 3600;

		segundosAtual -= horas * 3600;
		int minutos = segundosAtual / 60;

		segundosAtual -= minutos * 60;
		int segundos = segundosAtual / 1;

		System.out.println(horas + ":" + minutos + ":" + segundos);

	}

}
