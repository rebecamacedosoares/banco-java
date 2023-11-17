package meubanco.minhaagencia.contas;

import meubanco.minhaagencia.Cliente;

public class ContaPoupanca extends Conta  {

	protected double renda;
	protected int carenciaDias;

	public ContaPoupanca(Cliente cliente, double valor, double renda, int carencia) {
		super();
		this.renda = renda;
		this.carenciaDias = carencia;
		
	}
	
	public ContaPoupanca() {
		
	}
	
}
