package bee;

import java.util.Scanner;

public class GastoDeCombust�vel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        double tempoViagem , velocidadeMedia , qtdLitros;
        
        tempoViagem = scan.nextDouble();
        velocidadeMedia = scan.nextDouble();
        
        qtdLitros = ( tempoViagem * velocidadeMedia) / 12;
        
        System.out.printf("%.3f\n", +  qtdLitros);
        
        

	}

}
