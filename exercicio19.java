package cursoDeJava;

import java.util.Scanner;

/**22) A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas).*/

public class exercicio19 {
	
	public static void main(String[] args) {
		
		Scanner hT = new Scanner(System.in); 
		Scanner sH = new Scanner(System.in); 
	
		System.out.println("INFORME AS HORAS TRABALHADAS NO MÊS:"); 
		int horasT = hT.nextInt(); 
		System.out.println("INFORME O SALÁRIO POR HORA:"); 
		double salarioH = sH.nextDouble(); 
		
		double salarioTotal = horasT*salarioH; 
		
		if(horasT > 160) {
			salarioTotal = (salarioTotal*0.5) + salarioTotal;
		}
		
		System.out.println("SALÁRIO TOTAL:"); 
		System.out.println(salarioTotal);
		
		hT.close();
		sH.close();
	}
	

}
