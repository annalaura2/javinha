package cursoDeJava;

//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
//seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
//calcular e escrever o custo final ao consumidor.

import java.util.Scanner; 

public class exercicio8 {
	public static void main(String[] args) {
		
		Scanner cF = new Scanner(System.in); 
		
		System.out.println("Informe o custo de fábrica do carro: "); 
		double custoDeF = cF.nextDouble(); 
		
		double valorDoC; 
		
		valorDoC = ((custoDeF*28)/100) + ((custoDeF*45)/100) + custoDeF;
		
		System.out.println("==== VALOR DO CARRO ===="); 
		System.out.println(valorDoC); 
		
		cF.close();
		
	}
}
