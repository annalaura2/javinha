package cursoDeJava;

/**11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor.
*/ 

import java.util.Scanner; 

public class exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner nC = new Scanner(System.in); 
		Scanner tV = new Scanner(System.in); 
		Scanner sF = new Scanner(System.in); 
		Scanner vPC = new Scanner(System.in); 
		
		System.out.println("Informe o número de carros vendidos: "); 
		double carrosVendidos = nC.nextDouble();
		
		System.out.println("Informe o total de vendas "); 
		double totalVendas = tV.nextDouble();

		System.out.println("Informe o salário fixo: "); 
		double salarioF = sF.nextDouble();
	
		System.out.println("Informe o valor recebido por carro vendido: "); 
		double valorPorC = vPC.nextDouble();
		
		double salarioT = (valorPorC*carrosVendidos) + ((totalVendas)/100) + salarioF; 
		
		System.out.println("---Salário Total---"); 
		System.out.println(salarioT);
		
		nC.close(); 
		tV.close(); 
		sF.close();
		vPC.close();	
	}

}
