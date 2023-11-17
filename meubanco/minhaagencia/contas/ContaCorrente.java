package meubanco.minhaagencia.contas;

import meubanco.minhaagencia.Cliente;

public class ContaCorrente extends Conta {
	
	public int numero;
	
	public void debitar (double valor) {
		double debito = valor;
		double cpmf = (double) (0.38/100);
		super.saldo = (float) (super.saldo - (debito + debito * cpmf));
	}
	
	
	public ContaCorrente(Cliente cliente, double valor) {
		super(cliente, valor);
	}
	
	public ContaCorrente(Cliente cliente, double valor, int n) {
		numero = n;
		super.titular = cliente;
		super.saldo = valor;
	}
	
	
	public ContaCorrente() {

	}

	public int getNumero() {
		return numero;
	}
	
}
