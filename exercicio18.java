package cursoDeJava;

import java.util.Scanner;

//20) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

public class exercicio18 {
	
	public static void main(String[] args) {
		
		Scanner v1 = new Scanner(System.in); 
		Scanner v2 = new Scanner (System.in);
		
		System.out.println("Informe o primeiro valor:"); 
		double valor1 = v1.nextDouble(); 
		System.out.println("Informe o segundo valor:"); 
		double valor2 = v2.nextDouble(); 
		
		System.out.println("-  ORDEM CRESCENTE  -");
		
		if(valor1 > valor2) {
			System.out.println(valor2); 
			System.out.println(valor1);
		}else {
			System.out.println(valor1); 
			System.out.println(valor2);
		}
		
		v1.close();
		v2.close();
	}

}
