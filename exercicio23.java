package cursoDeJava;

import java.util.Scanner;

//27) Ler um valor e escrever se é positivo, negativo ou zero.

public class exercicio23 {

	public static void main(String[] args) {
		
		Scanner nc = new Scanner(System.in); 
		
		System.out.println("Informe o número:"); 
		double numero = nc.nextDouble(); 
		
		if(numero > 0) {
			System.out.println("Positivo");
		}else {
			if(numero < 0) {
				System.out.println("Negativo");
			}else {
				System.out.println("Zero");
			}
		}
	}
}
