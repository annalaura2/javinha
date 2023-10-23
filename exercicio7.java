package cursoDeJava;

import java.util.Scanner; 

//9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário.
public class exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner salario = new Scanner (System.in); 
		Scanner percentualR = new Scanner (System.in); 
		
		System.out.println("Informe o seu atual salário: "); 
		double s = salario.nextDouble();
		
		System.out.println("Informe o seu percentual de reajuste: "); 
		double p = percentualR.nextDouble(); 
		
		double calculo; 
		
		calculo = ((s*p)/100) + s; 
		
		System.out.println("==== Salário com reajuste ===="); 
		System.out.println(calculo); 
		
		salario.close();
		percentualR.close();
	}

}
