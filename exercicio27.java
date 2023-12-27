package cursoDeJava;

import java.util.Scanner; 
/** 31) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
dos outros 2 lados.*/

public class exercicio27 {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in); 
		Scanner b = new Scanner(System.in); 
		Scanner c = new Scanner(System.in); 
		
		System.out.println("Informe o lado A:"); 
		double ladoA = a.nextDouble(); 
		System.out.println("Informe o lado B:"); 
		double ladoB = b.nextDouble(); 
		System.out.println("Informe o lado C:"); 
		double ladoC = c.nextDouble(); 
		
		if(ladoA > ladoB + ladoC) {
			System.out.println("Não forma um triângulo"); 
		}else {
			if(ladoB > ladoC + ladoA) {
				System.out.println("Não forma um triângulo");
			}else {
				if(ladoC > ladoA + ladoB) {
					System.out.println("Não forma um triângulo"); 
				}else {
					System.out.println("Forma um triângulo");
				}
			}
		}
	}
	
}
