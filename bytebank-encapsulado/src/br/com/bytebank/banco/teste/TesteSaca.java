package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente ccz = new ContaCorrente(111, 111);
		ccz.deposita(100);
		
		ccz.saca(120);
		
		
		System.out.println(ccz.getSaldo());
		

	}

}
