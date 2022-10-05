package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;
import br.com.bytebank.banco.modelo.CalculadorImposto;

public class testaContaTributavel {
	
	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(444, 444);
		cc1.deposita(100);
		
		SeguroDeVida seguro1 = new SeguroDeVida();
		
		
		CalculadorImposto calc = new CalculadorImposto();
		
		calc.registra(seguro1);
		calc.registra(cc1);
						
		System.out.println(calc.getTotalImposto());
		System.out.println(cc1.getValorImposto());
		
		
		
	}		

}
