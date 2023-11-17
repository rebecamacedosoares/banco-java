package meubanco.minhaagencia.contas;

import meubanco.minhaagencia.Cliente;

public class Conta {

	protected static int qtde_objetos;
	protected double saldo;
	protected boolean ativa;
	protected Cliente titular;
	protected int agencia;
	
	
	public void creditar(double valor) {
		
	}
	
	public void debitar(double valor) {
		double debito = valor;
		this.saldo = saldo - debito;
	}
	
	public void encerrar(){
		
	}

	public Conta(){
		Conta.qtde_objetos ++;
	}
	
	public Conta(Cliente cliente, double d) {
		ativa = true;
		saldo = d;
		titular = cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
