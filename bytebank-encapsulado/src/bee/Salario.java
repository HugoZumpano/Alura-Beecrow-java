package bee;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numberEmployee;
		double hoursworked, hourValue, salary;
		

		numberEmployee = scan.nextInt();
		hoursworked = scan.nextDouble();
		hourValue = scan.nextDouble();
		salary = hoursworked * hourValue;
		
		System.out.printf("NUMBER = %.0f\n", + numberEmployee);
		System.out.printf("SALARY = U$ %.2f\n", + salary);
		
		
		
		

	}

}
