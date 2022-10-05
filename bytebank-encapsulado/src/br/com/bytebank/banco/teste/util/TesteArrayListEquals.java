package br.com.bytebank.banco.teste.util;
import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 22);
    	//Conta cc2 = new ContaCorrente(15,15);		
      //  boolean igual = cc1.ehIgual(cc2);
      //  System.out.println(igual);
		

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc2 = new ContaCorrente(2, 24);
		//lista.add(cc);
		
		//Conta cc2 = new ContaCorrente(22, 22);
		//lista.add(cc2);
		
		lista.add(cc1);
		Conta cc3 = new ContaCorrente(22, 22);
		lista.add(cc3);
		boolean existe = cc1.equals(cc3);
		
		System.out.println("Já existe? " + existe);
		
		
//		for(Conta conta : lista) {
//			System.out.println(conta);
//		}
		

	}

}
