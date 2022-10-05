package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		Conta cc2 = new ContaCorrente(22, 13);
		lista.add(cc2);
		Conta cc3 = new ContaCorrente(22, 13);
		Conta cc4 = new ContaCorrente(22, 13);
		Conta cc5 = new ContaCorrente(22, 13);
		Conta cc6 = new ContaCorrente(222, 132);
		lista.add(cc3);
		lista.add(cc4);
		lista.add(cc5);
		lista.add(cc6);
		lista.indexOf(cc6);
		lista.remove(cc6);
		
		boolean existe = lista.contains(cc6);
		System.out.println(existe);
		
		
		
		//System.out.println(lista.size());
		Conta ref =  lista.get(0);
		
		//lista.remove(0);
		
		System.out.println(ref.getNumero());
		
		for(int i = 0 ; i < lista.size() ; i++){
		
		System.out.println(lista.get(i));
		}
		
		//for(Conta imprimir : lista) {  //outra forma de realizar o for
			
			//System.out.println(imprimir);
		

			
			lista.contains(ref);
		//}
		
			
	}
}

