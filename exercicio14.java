package cursoDeJava;

import java.util.Scanner; 

/**16) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o custo total da compra.
*/ 

public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner mC = new Scanner(System.in); 
		
		System.out.println("==== INÍCIO DO ALGORITMO ===="); 
		
		System.out.println("Informe o número de maçãs compradas:"); 
		int macasC = mC.nextInt(); 
		
		double valorTotal = 0;
		if(macasC < 12) {
			valorTotal = 1.30*macasC; 
			System.out.println("VALOR TOTAL:"); 
			System.out.println(valorTotal);
		}else {
			valorTotal = 1*macasC; 
			System.out.println("VALOR TOTAL:");
			System.out.println(valorTotal);
		}
		
		System.out.println("==== FIM DO ALGORITMO ==="); 
		mC.close();
	}
}
