package br.com.bytebank.banco.modelo;

public abstract class Conta extends Object implements Comparable<Conta> {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	/*
	 * contrutor para inicicializar o objeto conta a partir da agencia e numero da
	 * conta
	 * 
	 * @paramAgencia
	 * 
	 * @paramConta
	 */

	public Conta(int agencia, int numero) // construtor//

	{
		Conta.total++;

		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		System.out
				.println("estou criando uma agencia   " + this.agencia + " e estou criando uma conta   " + this.numero);
		System.out.println("total de contas:" + Conta.total + ".");
	}

	public abstract void deposita(double valor);

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("saldo: " + this.saldo + ", valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {

		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Valor de agencia não pode ser 0 ou negativo.");
			// return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Valor de Nnumero não pode ser 0 ou negativo");
			return;
		}

		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;

	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public int compareTo(Conta outra) {

		return Double.compare(this.saldo, outra.saldo);
	}

	@Override
	public boolean equals(Object referencia) {

		Conta outra = (Conta) referencia; // realizando cast para fazer o Object converter para Conta

		if (this.agencia != outra.agencia) {

			return false;
		}

		if (this.numero != outra.numero) {

			return false;
		}
		return true;

	}

	@Override
	public String toString() {

		return "Conta: " + this.numero + " -  Agencia: " + agencia + ", saldo " + saldo;
	}

}
