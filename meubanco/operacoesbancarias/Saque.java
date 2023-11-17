package meubanco.operacoesbancarias;

import meubanco.minhaagencia.contas.Conta;

public class Saque extends OperacaoMesmoBanco {
	
	public Saque(double d) {
		super.valor = d;
	}
	
	public void realizar(Conta contaOrigem) {
		contaOrigem.debitar(super.valor);
	}

}
