package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencia {
	
	public static void main(String[] args) {
		
		
		ContaCorrente[] contas = new ContaCorrente[5];	
		
		ContaCorrente cc1 = new ContaCorrente(111,222);
		ContaCorrente cc2 = new ContaCorrente(147,155);
		contas[1] = cc1;
		contas[2] = cc2;
		contas[3] = cc2;
		
		
		System.out.println(contas[2].getAgencia());

		
		
		
		
		
	}

}
