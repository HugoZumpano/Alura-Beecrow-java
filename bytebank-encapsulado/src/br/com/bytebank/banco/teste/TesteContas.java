package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.*;

public class TesteContas {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		ContaEspecial contaEsp = new ContaEspecial(114, 1474);

		contaEsp.setTitular(cliente);
		cliente.setNome("hugoooooooo");
		
		System.out.println(contaEsp);

		System.out.println(contaEsp.getTitular());
		System.out.println(cliente.getNome());
		
		String hugo = "HUGO"; // para alterar uma string , tem que criar outra e apontar para a antiga.
		// String hugo2 = hugo.replace("H","t"); metado substituir antigo char para novo
		// char

		hugo = hugo.toLowerCase(); // metado transformar tudo em minusculo , toUpperCase ( transforma tudo em
									// maiusculo)

		char cha = hugo.charAt(3); // retorna posição do char

		// System.out.println(hugo +'.'+ cha);

		// contaEsp.setTitular(Hugoooo);

		// System.out.println(Hugo.getNome());

		/*
		 * ContaCorrente cc = new ContaCorrente(111,111); cc.deposita(300.0);
		 * 
		 * ContaPoupanca cp = new ContaPoupanca(222,222); cp.deposita(100.0);
		 * 
		 * 
		 * cc.transfere(10, cp);
		 * 
		 * 
		 * System.out.println("CC" + cc.getSaldo()); System.out.println("CP" +
		 * cp.getSaldo());
		 */

	}

}
