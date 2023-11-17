package meubanco.minhaagencia;

public class PessoaFisica extends Cliente{

	protected String cpf;
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;

	}
	
	public PessoaFisica() {}
}
