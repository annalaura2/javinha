package comercialBanco.java;

public class testeConta {
	
	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 11; 
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Sarah"; 
		contaCorrente.cliente.idade = 20; 
		
		contaPoupanca.numero = 22; 
		contaPoupanca.saldo = 10.4; 
		contaPoupanca.cliente.nome = "Anna"; 
		contaPoupanca.cliente.idade = 19;
	
		
		contaInvestimento.numero = 33; 
		contaInvestimento.saldo = 45.6; 
		contaInvestimento.cliente.nome = "Eva"; 
		contaInvestimento.cliente.idade = 9; 
	}

}

