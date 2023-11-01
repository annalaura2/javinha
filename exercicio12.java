package cursoDeJava;

import java.util.Scanner;

/**14) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10!
*/

public class exercicio12 {
	
	public static void main(String [] args) {
		
		Scanner n1 = new Scanner(System.in);  
		
		System.out.println("Informe o número:"); 
		double numero1 = n1.nextDouble(); 
		
		if(numero1 > 10) {
			System.out.println("É MAIOR QUE 10!");
		}else {
			System.out.println("NÃO É MAIOR QUE 10!");
		}
		
		n1.close();

	}
	

}
