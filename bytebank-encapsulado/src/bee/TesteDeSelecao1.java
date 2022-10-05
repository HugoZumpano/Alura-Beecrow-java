package bee;

import java.util.Scanner;

public class TesteDeSelecao1 {

	public static void main(String[] args) {

		int valorA, valorB, valorC, valorD;

		Scanner scan = new Scanner(System.in);

		valorA = scan.nextInt();
		valorB = scan.nextInt();
		valorC = scan.nextInt();
		valorD = scan.nextInt();

//		Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, 
//		e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A 
//		for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

		if (valorB > valorC && valorD > valorA && valorC > 0 && valorD > 0 && (valorC + valorD) > (valorA + valorB)
				&& valorA % 2 == 0) {

			System.out.println("\r\n" + "Valores aceitos");
		} else {
			System.out.println("\r\n" + "Valores nao aceitos");
		}
	}

}
