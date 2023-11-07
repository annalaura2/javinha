package cursoDeJava;

import java.util.Scanner;

/**24) Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
ultrapassar este valor, calcular e escrever o seu salário total.
*/

public class exercicio20 {
	
	public static void main(String[] args) {
		
		Scanner sF = new Scanner(System.in); 
		Scanner vE = new Scanner(System.in); 
		
		System.out.println("Informe o valor do salário FIXO:"); 
		double salarioF = sF.nextDouble(); 
		System.out.println("Informe o valor das vendas efetuadas:"); 
		int vendasE = vE.nextInt(); 
		
		double salarioT = 0;
		
		if(vendasE <= 1500) {
			salarioT = salarioF + (vendasE*0.03); 
		}else {
			salarioT = salarioF +(vendasE*0.05); 
		}
		
		System.out.println("Salário Total:"); 
		System.out.println(salarioT);
		
		sF.close();
		vE.close();
	}

}
