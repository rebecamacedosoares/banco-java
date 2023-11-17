package meubanco.funcionarios;

public class Funcionario {
	protected String nome;
	protected double salario;
	protected String cargo;
	
	public Funcionario(String nome, double salario, String cargo){
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionario(String nome, String cargo){
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public String getCargo() {
		return cargo;
	}
}
