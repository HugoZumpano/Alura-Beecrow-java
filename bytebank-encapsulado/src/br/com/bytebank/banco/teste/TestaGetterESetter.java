package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

	public class TestaGetterESetter {
	
	public static void main(String[]args) {
		ContaCorrente conta = new ContaCorrente(111,444);
		conta.setNumero(1337);

		
		System.out.println(conta.getNumero());
		
	
		
		conta.setNumero(140);
		
		//System.out.println(conta.getNumero());
		
		
		
		
		
		Cliente  cliente01 = new Cliente();
		cliente01.setNome("hugo zumpano");
		cliente01.setCpf("147147147");
		cliente01.setProfissao("analista de teste");
		conta.setTitular(cliente01);
		
		
		
		//System.out.println(conta.getTitular().getNome());
		
		//System.out.println(conta.getTitular().get);
		
		//conta.getTitular().setProfissao("analista");
		//conta.getTitular().setCpf("147");
		//cliente01.setNome("teste");
		
		//System.out.println(conta.getTitular().getProfissao());
		//System.out.println(conta.getTitular().getCpf());
		//System.out.println(conta.getTitular().getNome());

		
		
		
		
		
		
		
		
		
		

		
	}

}
