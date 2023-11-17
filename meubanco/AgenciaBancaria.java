package meubanco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

import meubanco.minhaagencia.Cliente;
import meubanco.minhaagencia.contas.Conta;
import meubanco.minhaagencia.contas.ContaCorrente;
import meubanco.minhaagencia.contas.ContaPoupanca;
import meubanco.operacoesbancarias.Deposito;
import meubanco.operacoesbancarias.Saque;
import meubanco.funcionarios.*;
import java.util.Collections;
import java.util.Comparator;

public class AgenciaBancaria {
	public static void main(String[] args) {
		utlilizarOperacoesBancarias();
	}
	
	
	public static void idades() {
		int [] idades = new int[3];
		idades[0] = 30;
		idades[1] = 45;
		idades[2] = 12;
		
		for (int i = 0; i < idades.length; i++){
			System.out.println(idades[i]);
		}
		System.out.println("\n============================\n");
	}
	
	
	public static void utlilizarOperacoesBancarias() {
		//não printa nada na tela
		
		Conta contaOrigem = new Conta(new Cliente("Carlos"), 1000);
		Conta contaDestino1 = new Conta(new Cliente("Marcos"), 1000);
		Conta contaDestino2 = new Conta(new Cliente("Luis"), 1000);
		Conta contaDestino3 = new Conta(new Cliente("Daniel"), 1000);
		
		Saque debito = new Saque(500);
		debito.realizar(contaOrigem);
		
		Deposito credito1 = new Deposito(250);
		Deposito credito2 = new Deposito(100);
		Deposito credito3 = new Deposito(150);
		
		credito1.realizar(contaDestino1);
		credito2.realizar(contaDestino2);
		credito3.realizar(contaDestino3);
		
		System.out.println("\n============================\n");
	}
	
	
	public static void contaCliente1() {
		Cliente cli1 = new Cliente("Maria");
		Cliente cli2 = new Cliente("João");
		Cliente cli3 = new Cliente("Ana");
		Cliente cli4 = new Cliente("José");
		Cliente cli5 = new Cliente("Luiz");
		Cliente cli6 = new Cliente("Guilherme");
		
		Conta c1 = new Conta (cli1, 3000);
		Conta c2 = new Conta (cli2, 2000);
		Conta c3 = new Conta (cli3, 950);
		Conta c4 = new Conta (cli4, 4000);
		Conta c5 = new Conta (cli5, 3500);
		Conta c6 = new Conta (cli6, 4300);
		
		System.out.println(c1.getTitular().getNome() + " - " + c1.getSaldo());
		System.out.println(c2.getTitular().getNome() + " - " + c2.getSaldo());
		System.out.println(c3.getTitular().getNome() + " - " + c3.getSaldo());
		System.out.println(c4.getTitular().getNome() + " - " + c4.getSaldo());
		System.out.println(c5.getTitular().getNome() + " - " + c5.getSaldo());
		System.out.println(c6.getTitular().getNome() + " - " + c6.getSaldo());
		
		System.out.println("\n============================\n");
	}
	
	
	public static void contaCliente2() {
		Cliente [] clientes = new Cliente[10];
		
		clientes[0] = new Cliente ("Marcos");
		clientes[1] = new Cliente ("Jonas");
		clientes[2] = new Cliente ("Daniel");
		clientes[3] = new Cliente ("Gabriel");
		clientes[4] = new Cliente ("Flor");
		clientes[5] = new Cliente ("Alice");
		clientes[6] = new Cliente ("Pedro");
		clientes[7] = new Cliente ("Heitor");
		clientes[8] = new Cliente ("Kauan");
		clientes[9] = new Cliente ("Flavia");
		
		Conta [] contas = new Conta[10];
		
		contas[0] = new Conta(clientes[0], 2000);
		contas[1] = new Conta(clientes[1], 900);
		contas[2] = new Conta(clientes[2], 3100);
		contas[3] = new Conta(clientes[3], 1500);
		contas[4] = new Conta(clientes[4], 4200);
		contas[5] = new Conta(clientes[5], 3700);
		contas[6] = new Conta(clientes[6], 2300);
		contas[7] = new Conta(clientes[7], 1800);
		contas[8] = new Conta(clientes[8], 970);
		contas[9] = new Conta(clientes[9], 3200);
		
		for (int x = 0; x < contas.length; x++){
			System.out.println(contas[x].getSaldo());
		}
		
		System.out.println("\n============================\n");

		Cliente cliente1 = new Cliente("Tomás");
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente("Sophia");
		Cliente cliente4 = new Cliente("Bruno");
		Cliente cliente5 = new Cliente();
		
		Cliente [] arrayClientes = {cliente1, cliente2, cliente3, cliente4, cliente5};
		
		for (int i = 0; i < arrayClientes.length; i++){
			if (arrayClientes[i] == null){
				System.out.println("Cliente não informado!");
			}
			else {
				System.out.println(arrayClientes[i].getNome());
			}

		}
		
		System.out.println("\n============================\n");

		int i = 0;
		float soma = 0;
		while(i < contas.length) {
			soma += contas[i].getSaldo();
			i++;
		}
		System.out.println(soma);
		
		System.out.println("\n============================\n");
	}
	
	
	public static void usandoGet(){
		Cliente [] novosClientes = new Cliente[5];
		Conta [] novasContas = new Conta[10];
		
		novosClientes[0] = new Cliente ("Joana");
		novosClientes[1] = new Cliente ("Samuel");
		novosClientes[2] = new Cliente ("Alana");
		novosClientes[3] = new Cliente ("Eduardo");
		novosClientes[4] = new Cliente ("Tiago");
		
		for(int i = 0; i < novasContas.length; i++) {
			System.out.println("O nome do titular da conta " + i +
					" é " + novasContas[i].getTitular().getNome() +
					" e seu saldo é " + novasContas[i].getSaldo());
		}

		System.out.println("\n============================\n");
	}
	
	
	public static void criandoContas(){
		Cliente [] clientes = new Cliente[5];
		Conta [] contas = new Conta[10];
		
		clientes[0] = new Cliente ("Joana");
		clientes[1] = new Cliente ("Samuel");
		clientes[2] = new Cliente ("Alana");
		clientes[3] = new Cliente ("Eduardo");
		clientes[4] = new Cliente ("Tiago");
		
		int x = 0;
		
		for(int i=0; i< 10; i++) {
			if(i%2 == 0 && i!=0) { //par
				x++;
			}
			contas[i] = new Conta(clientes[x], 1000 * Math.random());
		
		}
		
		for(int i=0; i< 10; i++) {
			System.out.println(contas[i].getTitular().getNome() + " - " + contas[i].getSaldo());
		}		
		
		System.out.println("\n============================\n");
	}
	
	public static void debitarContas() {
		Conta [] contas = {
				new ContaCorrente(),
				new ContaPoupanca(),
				new ContaPoupanca(),
				new ContaCorrente(),
				new ContaPoupanca(),
		};

		
		for(int i=0; i< 10; i++) {
			contas[i].debitar(30);
		}
		System.out.println("\n============================\n");
	}
	
	//abstract não pode puxar para usar no main

	public static void usandoArrayList() {
		
		Cliente c1 = new Cliente("Pedro");
		Cliente c2 = new Cliente("Luiz");
		Cliente c3 = new Cliente("Maria");
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		System.out.println(clientes);
		System.out.println();
		
		
		ContaCorrente cc1 = new ContaCorrente(c1, 2000);
		ContaCorrente cc2 = new ContaCorrente(c2, 2500);
		ContaCorrente cc3 = new ContaCorrente(c3, 1800);
		
		ArrayList<ContaCorrente> contasc = new ArrayList<ContaCorrente>();
		
		contasc.add(cc1);
		contasc.add(cc2);
		contasc.add(cc3);
		
		for (ContaCorrente conta : contasc) {
			System.out.println("Titular da Conta: " + conta.getTitular());
	        System.out.println("Saldo: " + conta.getSaldo());
	        System.out.println();
	    }

		
		Funcionario f1 = new Funcionario("Heitor", 4500);
		Funcionario f2 = new Funcionario("Ana", 5000);
		Funcionario f3 = new Funcionario("Iago", 4000);
		
		ArrayList<Funcionario> func = new ArrayList<Funcionario>();
		
		func.add(f1);
		func.add(f2);
		func.add(f3);
		
		for (Funcionario funcionario : func) {
			System.out.println("Nome do funcionário: " + funcionario.getNome());
	        System.out.println("Salário: " + funcionario.getSalario());
	        System.out.println();
	    }
	}
	
	public static void usandoHashMap() {
		Cliente c1 = new Cliente("Amanda");
		Cliente c2 = new Cliente("Anderson");
		Cliente c3 = new Cliente("Bruna");
		Cliente c4 = new Cliente("Benício");
		
		Map<Character, List<Cliente>> clientesInicial = new HashMap<>();
		
        List<Cliente> clientesA = new ArrayList<>();
        clientesA.add(c1);
        clientesA.add(c2);
        clientesInicial.put('A', clientesA);

        List<Cliente> clientesB = new ArrayList<>();
        clientesB.add(c3);
        clientesB.add(c4);
        clientesInicial.put('B', clientesB);
        
        
        Map<Integer, List<ContaCorrente>> contasAgencia = new HashMap<>();
        
        List<ContaCorrente> agencia1 = new ArrayList<>();
        agencia1.add(new ContaCorrente(c1, 2300, 92161));
        agencia1.add(new ContaCorrente(c2, 3800, 92162));
        contasAgencia.put(1, agencia1);

        List<ContaCorrente> agencia2 = new ArrayList<>();
        agencia2.add(new ContaCorrente(c3, 2600, 92163));
        agencia2.add(new ContaCorrente(c4, 4200, 92164));
        contasAgencia.put(2, agencia2);
        
        
        Map<String, List<Funcionario>> funcionariosCargo = new HashMap<>();
        
        List<Funcionario> gerentesDeBanco = new ArrayList<>();
        gerentesDeBanco.add(new Funcionario("Guilherme", "Gerente de Banco"));
        gerentesDeBanco.add(new Funcionario("Marina", "Gerente de Banco"));
        funcionariosCargo.put("Gerente de Banco", gerentesDeBanco);

        List<Funcionario> especialistaEmInvestimentos = new ArrayList<>();
        especialistaEmInvestimentos.add(new Funcionario("Daniel", "Especialista em investimentos"));
        especialistaEmInvestimentos.add(new Funcionario("Luiza", "Especialista em investimentos"));
        funcionariosCargo.put("Especialista em investimentos", especialistaEmInvestimentos);
        
        
        for (Character letra : clientesInicial.keySet()) {
            System.out.println("Clientes com a letra " + letra + ":");

            List<Cliente> clientes = clientesInicial.get(letra);
            for (Cliente cliente : clientes) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println();
            }
        }

        for (Integer agencia : contasAgencia.keySet()) {
            System.out.println("Contas na agência " + agencia + ":");

            List<ContaCorrente> contas = contasAgencia.get(agencia);
            for (ContaCorrente conta : contas) {
                System.out.println("Número da Conta: " + conta.getNumero());
                System.out.println("Saldo: " + conta.getSaldo());
                System.out.println();
            }
        }

        for (String cargo : funcionariosCargo.keySet()) {
            System.out.println("Funcionários com cargo de " + cargo + ":");

            List<Funcionario> funcionarios = funcionariosCargo.get(cargo);
            for (Funcionario funcionario : funcionarios) {
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Cargo: " + funcionario.getCargo());
                System.out.println();
            }
        }
	}
	
	public static void usandoList() {
		List<Cliente> clientes = new ArrayList<>();
	    clientes.add(new Cliente("Luiz", "Rua B"));
	    clientes.add(new Cliente("Antônio", "Rua D"));
	    clientes.add(new Cliente("Roberto", "Rua A"));
	    clientes.add(new Cliente("Ana", "Rua C"));
	    
	    Collections.sort(clientes, Comparator.comparing(Cliente::getEndereco));
	    
	    for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println();
        }
	}
	
	public static void usandoArrayList2() {
		List<Cliente> clientes = new ArrayList<>();
	    clientes.add(new Cliente("Luiz", "Rua B"));
	    clientes.add(new Cliente("Antônio", "Rua D"));
	    clientes.add(new Cliente("Roberto", "Rua A"));
	    clientes.add(new Cliente("Ana", "Rua C"));
	    
	    Collections.sort(clientes, Comparator.comparing(Cliente::getEndereco).reversed());
	    
	    for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println();
        }
	}
	
	public static void usandoArrayList3() {
		List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Kauan", new Date(2001, 11, 27)));
        clientes.add(new Cliente("Maria", new Date(1974, 8, 30)));
        clientes.add(new Cliente("Carlos", new Date(1992, 1, 13)));
        
        Collections.sort(clientes, new Comparator<Cliente>() {
        	public int compare(Cliente c1, Cliente c2) {
                return c1.getDataNascimento().compareTo(c2.getDataNascimento());
        	}
        });
        
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
            System.out.println();
        }
	}
	
	public static void usandoArrayList4() {
		Cliente c1 = new Cliente("Flávio");
		Cliente c2 = new Cliente("Carolina");
		Cliente c3 = new Cliente("Eduardo");

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(c1, 4600));
        contas.add(new ContaCorrente(c2, 3500));
        contas.add(new ContaCorrente(c3, 5700));
        
        Collections.sort(contas, Comparator.comparingDouble(ContaCorrente::getSaldo));

        for (ContaCorrente conta : contas) {
            System.out.println("Cliente: " + conta.getTitular());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        }
	}
	
	public static void usandoArrayList5() {
		Cliente c1 = new Cliente("Breno");
		Cliente c2 = new Cliente("Joana");
		Cliente c3 = new Cliente("Alana");

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(c1, 5200));
        contas.add(new ContaCorrente(c2, 6000));
        contas.add(new ContaCorrente(c3, 4300));
        
        Collections.sort(contas, Comparator.comparingDouble(ContaCorrente::getSaldo).reversed());

        for (ContaCorrente conta : contas) {
            System.out.println("Cliente: " + conta.getTitular());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        }
	}

	public static void usandoArrayList6() {
		Cliente c1 = new Cliente("José");
		Cliente c2 = new Cliente("Bernardo");
		Cliente c3 = new Cliente("Sara");

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(c1, 6000));
        contas.add(new ContaCorrente(c2, 5200));
        contas.add(new ContaCorrente(c3, 4800));

        Collections.sort(contas, Comparator.comparing(conta -> conta.getTitular().getNome()));

        for (ContaCorrente conta : contas) {
            System.out.println("Nome do titular: " + conta.getTitular().getNome());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        }
	}
	
	public static void usandoArrayList7() {
		Cliente c1 = new Cliente("Hugo");
		Cliente c2 = new Cliente("André");
		Cliente c3 = new Cliente("Yago");

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(c1, 4500));
        contas.add(new ContaCorrente(c2, 4900));
        contas.add(new ContaCorrente(c3, 5800));

        Collections.sort(contas, Comparator.comparing(conta -> conta.getTitular().getNome()));

        Collections.reverse(contas);
        
        for (ContaCorrente conta : contas) {
            System.out.println("Nome do titular: " + conta.getTitular().getNome());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        }
	}
	
	public static void usandoDate() {
		Cliente c1 = new Cliente("Mariana", new Date(1999, 3, 11));
        Cliente c2 = new Cliente("Rafael", new Date(1992, 10, 19));
        Cliente c3 = new Cliente("Larissa", new Date(2002, 9, 3));

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(c1, 4400));
        contas.add(new ContaCorrente(c2, 5500));
        contas.add(new ContaCorrente(c3, 5300));

        Collections.sort(contas, Comparator.comparing(conta -> conta.getTitular().getDataNascimento()));

        for (ContaCorrente conta : contas) {
            System.out.println("Nome do titular: " + conta.getTitular().getNome());
            System.out.println("Data de nascimento: " + conta.getTitular().getDataNascimento());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        }
	}
	
	public static void usandoDate2() {
		Cliente c1 = new Cliente("Leonardo", new Date(1998, 3, 9));
        Cliente c2 = new Cliente("Mathias", new Date(1993, 10, 17));
        Cliente c3 = new Cliente("Isabela", new Date(2004, 9, 2));

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(c1, 4300));
        contas.add(new ContaCorrente(c2, 5400));
        contas.add(new ContaCorrente(c3, 5100));

        Collections.sort(contas, Comparator.comparing(conta -> conta.getTitular().getDataNascimento()));

        Collections.reverse(contas);
        
        for (ContaCorrente conta : contas) {
            System.out.println("Nome do titular: " + conta.getTitular().getNome());
            System.out.println("Data de nascimento: " + conta.getTitular().getDataNascimento());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        }
	}
	
	public static void usandoDate3() { 
		Cliente c1 = new Cliente("Helena", new Date(1995, 4, 5), "333.333.333-33");
        Cliente c2 = new Cliente("Clara", new Date(1989, 6, 25), "111.111.111-11");
        Cliente c3 = new Cliente("Matheus", new Date(2000, 8, 14), "222.222.222-22");
        
        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(c1, 4600));
        contas.add(new ContaCorrente(c2, 5200));
        contas.add(new ContaCorrente(c3, 5800));

        Collections.sort(contas, Comparator.comparing(conta -> conta.getTitular().getCpf()));

        for (ContaCorrente conta : contas) {
            System.out.println("Nome do titular: " + conta.getTitular().getNome());
            System.out.println("CPF do titular: " + conta.getTitular().getCpf());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println();
        }
	}
	
	public class OrdenadorPorCliente implements Comparator<Cliente>{
		public int compare(Cliente a, Cliente b) {
			return a.getEndereco().compareTo(b.getEndereco());
		}
	}
}

