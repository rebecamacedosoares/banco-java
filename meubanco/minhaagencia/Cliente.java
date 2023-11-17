package meubanco.minhaagencia;

import java.util.Date;

public class Cliente {
	
	protected String nome;
	protected Character inicial;
	protected String endereco;
	protected Date  dataNascimento;
	protected String cpf;
	
	public Cliente(String nome){
		this.nome = nome;
	}
	
	public Cliente(){}
	
	public Cliente(String nome, Character inicial){
		this.nome = nome;
		this.inicial = inicial;
	}
	
	public Cliente(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Cliente(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
	
	public Cliente(String nome, Date dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String toString() {
		return this.nome;
	}
}
