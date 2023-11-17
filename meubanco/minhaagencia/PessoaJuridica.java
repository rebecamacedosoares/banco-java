package meubanco.minhaagencia;

public class PessoaJuridica extends Cliente{

	protected String cnpj;
	
	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica() {}
}
