package cursoDeJava;

import java.util.Scanner; 

/**
13) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
final é:
mediafinal
n1 * 2 + n2 * 3 + n3 * 5
= -----------------------------------
10

*/ 


public class exercicio11 {
	
	public static void main(String [] args) {
		
		Scanner n1 = new Scanner(System.in); 
		Scanner n2 = new Scanner(System.in); 
		Scanner n3 = new Scanner(System.in);
		
		System.out.println("Informe a nota 1:"); 
		double nota1 = n1.nextDouble(); 
		
		System.out.println("Informe a nota 2:"); 
		double nota2 = n2.nextDouble(); 
		
		System.out.println("Informe nota 3:"); 
		double nota3 = n3.nextDouble();
		
		double mediaF = nota1*2+nota2*3+nota3*5/10; 
		
		System.out.println("---- MÉDIA FINAL ----"); 
		System.out.println(mediaF);
		
	}

}
