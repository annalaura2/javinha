package cursoDeJava;

import java.util.Scanner; 

// 15) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)

public class exercicio13 {
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("---- INÍCIO DO ALGORITMO ----");
		
		System.out.println("Informe o número:"); 
		double numero = n.nextDouble();
		
		if(numero >= 0) {
			System.out.println("POSITIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		System.out.println("---- FIM DO ALGORITMO ----");
	}

}
