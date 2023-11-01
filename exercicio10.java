package cursoDeJava;

/**12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius (baseado na fórmula abaixo):
C
----------
5
=
F - 32
-----------
9
Observação: Para testar se a sua resposta está correta saiba que 100 o C = 212F
*/

import java.util.Scanner; 

public class exercicio10 {
	
	public static void main(String [] args) {
		
		java.util.Scanner fah = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em FAHRENHEIT: "); 
		double fahrenheit = fah.nextDouble();
		
		double tempCelsius = (((fahrenheit-32)*5)/9); 
		
		System.out.println("----Temperatura em CELSIUS -----");
		System.out.println(tempCelsius);
	
	}

}
