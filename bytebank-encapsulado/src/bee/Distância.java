package bee;

import java.util.Scanner;

public class Distância {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int km, minutos;

		km = scan.nextInt();
		minutos = (60 * km) / 30;

		System.out.println(minutos + " minutos");

	}

}
