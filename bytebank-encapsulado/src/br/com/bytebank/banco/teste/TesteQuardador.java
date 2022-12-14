package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteQuardador {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaPoupanca(22, 11);
		guardador.adiciona(cc);
		Conta cc2 = new ContaPoupanca(22, 112);
		guardador.adiciona(cc2);
		
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		
		
		Conta ref = guardador.getReferencia(1);
		
		
		System.out.println(ref.getNumero());
		
		

	}

}
