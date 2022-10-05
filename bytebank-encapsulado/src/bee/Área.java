package bee;
import java.util.Scanner;

public class Área {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double ladoA, ladoB, ladoC , raio;
		double trianguloRetangulo , circulo , trapezio, quadrado, retangulo;
		
		ladoA = scan.nextDouble();
		ladoB = scan.nextDouble();
		ladoC = scan.nextDouble();		
		//raio = scan.nextDouble();	
		
		trianguloRetangulo = (ladoA * ladoC) / 2 ;
		circulo	  = 3.14159 * (ladoC * ladoC);
		trapezio  = ((ladoA + ladoB ) * (ladoC)) / 2;
		quadrado  = ladoB * ladoB;
		retangulo = ladoA * ladoB;
		
		System.out.printf("TRIANGULO: %.3f\n", + trianguloRetangulo );
		System.out.printf("CIRCULO: %.3f\n", + circulo );
		System.out.printf("TRAPEZIO: %.3f\n", + trapezio );
		System.out.printf("QUADRADO: %.3f\n", + quadrado );
		System.out.printf("RETANGULO: %.3f\n", + retangulo );

	}

}
