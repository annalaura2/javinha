package cursoDeJava;

import java.util.Scanner;

/** 28) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.*/

public class exercicio24 {
	
	public static void main(String[] args) {
		
		Scanner v1 = new Scanner(System.in); 
		Scanner v2 = new Scanner(System.in); 
		Scanner v3 = new Scanner(System.in); 
		
		System.out.println("Informe o primeiro valor:"); 
		double valor1 = v1.nextDouble(); 
		System.out.println("Informe o segundo valor:"); 
		double valor2 = v2.nextDouble(); 
		System.out.println("Informe o terceiro valor:"); 
		double valor3 = v3.nextDouble(); 
		
		if(valor1 > valor2 && valor1 > valor3) {
			System.out.println("Maior valor:"); 
			System.out.println(valor1);
		}else {
			if(valor2 > valor1 && valor2 > valor3) {
				System.out.println("Maior valor:"); 
				System.out.println(valor2);
			}else {
				System.out.println("Maior valor:"); 
				System.out.println(valor3);
			}
		}
		
		
	}

}
