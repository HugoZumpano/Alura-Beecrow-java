package bee;
import java.util.Scanner;

public class SalárioComBônus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome;
		Double salario , comissao, totalDeVenda;
		
		
		nome = scan.next();
		salario = scan.nextDouble();
		totalDeVenda = scan.nextDouble();
		comissao = 0.15;
		
		
		System.out.printf("TOTAL = R$ %.2f\n", + salario + (totalDeVenda * comissao));
		
		
		
		

		
		



	}

}
