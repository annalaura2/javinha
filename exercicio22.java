package cursoDeJava;

import java.util.Scanner;

/** 26) Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'.*/

public class exercicio22 {

	public static void main(String[] args) {
		
		Scanner qA = new Scanner(System.in);
		Scanner qM = new Scanner(System.in); 
		Scanner qMm = new Scanner(System.in); 
		
		System.out.println("Informe a quantidade atual em estoque:"); 
		int quantidadeA = qA.nextInt(); 
		System.out.println("Informe a quantidade máxima em estoque:"); 
		int quantidadeM = qM.nextInt(); 
		System.out.println("Informe a quantidade miníma em estoque:"); 
		int quantidadeMM = qMm.nextInt(); 
		
		double quantidadeMedia = ((quantidadeM + quantidadeMM)/2); 
		
		if(quantidadeA >= quantidadeMedia) {
			System.out.println("Não efetuar compra!");
		}else {
			System.out.println("Efetuar Compra!"); 
		}
		
		System.out.println("Quantidade Média:");
		System.out.println(quantidadeM);
	}
}
