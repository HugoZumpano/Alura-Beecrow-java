package bee;
import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int valor1, valor2 , soma;
        
        valor1 = scan.nextInt();
        valor2 = scan.nextInt();
        
        soma = valor1 + valor1;
        
        System.out.println("SOMA = " + soma);

	}

}
