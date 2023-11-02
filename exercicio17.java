package cursoDeJava;

import java.util.Scanner; 

//19) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

public class exercicio17 {
	
	public static void main(String[] args) {
		
		Scanner v1 = new Scanner(System.in); 
		Scanner v2 = new Scanner(System.in); 
		
		System.out.println("INFORME O PRIMEIRO VALOR:"); 
		double valor1 = v1.nextDouble(); 
		System.out.println("INFORME O SEGUNDO VALOR:"); 
		double valor2 = v2.nextDouble(); 
		
		if(valor1 > valor2) {
			System.out.println("MAIOR VALOR:"); 
			System.out.println(valor1);
		}else {
			System.out.println("MAIOR VALOR:"); 
			System.out.println(valor2);
		}
		
		v1.close();
		v2.close();
	}

}
