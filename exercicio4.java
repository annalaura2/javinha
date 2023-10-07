package cursoDeJava;

import java.util.Scanner;

//6) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
// área do retângulo

public class exercicio4 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); 
		Scanner as = new Scanner(System.in);
		
		System.out.print("Informe a base: ");
		int base = sc.nextInt(); 
		
		System.out.print("Informe a altura: "); 
		int altura = as.nextInt(); 
		
		int area = (base*altura)/2; 
		
		System.out.println("---------ÁREA DO TRIÂNGULO-------"); 
		System.out.print(area); 
		
		sc.close(); 
		as.close();
	}

}
