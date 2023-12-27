package cursoDeJava;

import java.util.Scanner;

/**30) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
crescente.*/

public class exercicio26 {
	
	public static void main(String[]args) {
		Scanner v1 = new Scanner(System.in); 
		Scanner v2 = new Scanner(System.in); 
		Scanner v3 = new Scanner(System.in); 
		
		System.out.println("Informe o número"); 
		double num1 = v1.nextDouble(); 
		System.out.println("Informe o número"); 
		double num2 = v2.nextDouble(); 
		System.out.println("Informe o número"); 
		double num3 = v3.nextDouble(); 
		
		if(num1 < num2 && num1 <num3 && num3 > num2) {
			System.out.println("ORDEM CRESCENTE"); 
			System.out.println(num1); 
			System.out.println(num2); 
			System.out.println(num3);	
		}else {
			if(num1 < num2 && num1 < num3 && num2 > num3) {
				System.out.println("ORDEM CRESCENTE"); 
				System.out.println(num1); 
				System.out.println(num3); 
				System.out.println(num2);
			}else {
				if(num2 < num1 && num2 < num3 && num3 > num1) {
					System.out.println("ORDEM CRESCENTE"); 
					System.out.println(num2); 
					System.out.println(num1); 
					System.out.println(num3);
				}else {
					if(num2 < num1 && num2 < num3 && num1 > num3) {
						System.out.println("ORDEM CRESCENTE"); 
						System.out.println(num2); 
						System.out.println(num3); 
						System.out.println(num1);
					}else {
						if(num3 <num1 && num3 < num2 && num1 > num2) {
							System.out.println("ORDEM CRESCENTE"); 
							System.out.println(num3); 
							System.out.println(num2); 
							System.out.println(num1);
						}else {
							System.out.println("ORDEM CRESCENTE"); 
							System.out.println(num3); 
							System.out.println(num1); 
							System.out.println(num2);
						}
					}
				}
			}
		}
		
		
		
	}

}
