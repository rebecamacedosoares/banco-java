package meubanco.investimentos;

public class Investimento {
	protected String saldoInvestido;
	protected String rendimento;
	
	public Investimento(String saldoinvestido, String rendimento) {
		this.saldoInvestido = saldoinvestido;
		this.rendimento = rendimento;
	}
}
