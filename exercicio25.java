package cursoDeJava;

import java.util.Scanner;

/**29) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
maiores. */

public class exercicio25 {
	
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
		
		double soma = 0;
		
		if (valor1 > valor3 && valor2 > valor3) {
			soma = valor1 + valor2; 
			System.out.println(soma);
		}else {
			if(valor3 > valor1 && valor2 > valor1) {
				soma = valor3 + valor2; 
				System.out.println(soma);
			}else {
				soma = valor3 + valor1;
				System.out.println(soma);
			}
		}
		
	}

}
