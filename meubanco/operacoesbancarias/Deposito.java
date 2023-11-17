package meubanco.operacoesbancarias;

import meubanco.minhaagencia.contas.Conta;

public class Deposito extends OperacaoMesmoBanco {

	public Deposito(double d) {
		super.valor = d;
	}

	public void realizar(Conta contaDestino) {
		contaDestino.creditar(super.valor);
	}

}
