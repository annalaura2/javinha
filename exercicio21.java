package cursoDeJava;

import java.util.Scanner;

/**25) Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo' */

public class exercicio21 {

	public static void main(String[] args) {
		
		Scanner nC = new Scanner(System.in);
		Scanner s = new Scanner(System.in); 
		Scanner c = new Scanner(System.in);
		Scanner d = new Scanner(System.in);
		
		System.out.println("Informe o número da conta:"); 
		int numeroC = nC.nextInt(); 
		System.out.println("Informe o saldo:");
		double saldo = s.nextDouble(); 
		System.out.println("Informe o crédito:"); 
		double credito = c.nextDouble(); 
		System.out.println("Informe o débito:"); 
		double debito = d.nextDouble(); 
		
		double saldoA = saldo - debito + credito;
		
		if(saldoA >= 0) {
			System.out.println(saldoA);
			System.out.println("Saldo Positivo"); 
		}else {
			System.out.println(saldoA);
			System.out.println("Saldo Negativo");
		}
		
		nC.close();
		s.close();
		c.close();
		d.close();
			
	}
}
