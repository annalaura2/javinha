package cursoDeJava;

//7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
//dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner; 


public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner an = new Scanner(System.in);
		Scanner di = new Scanner(System.in); 
		Scanner me = new Scanner(System.in);
		
		System.out.println("Informe sua idade anos: "); 
		int anos = an.nextInt(); 
		
		System.out.println("Informe os meses da sua idade: "); 
		int meses = di.nextInt(); 
		
		System.out.println("Informe os dias da sua idade: "); 
		int dias = di.nextInt(); 
		
		int somaDias = 0; 
		
		somaDias = (anos*365) + (meses*30) + dias;
		
		System.out.println("Idade em dias: "); 
		System.out.println(somaDias);
		
		
	}
	
}
