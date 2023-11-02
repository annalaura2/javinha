package cursoDeJava;

import java.util.Scanner; 

/**17) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada.
*/

public class exercicio15 {
	
	public static void main(String[] args) {
		
		Scanner n1 = new Scanner(System.in); 
		Scanner n2 = new Scanner(System.in); 
		
		System.out.println("Informe a primeira nota:"); 
		double nota1 = n1.nextDouble(); 
		System.out.println("Informe a segunda nota:"); 
		double nota2 = n2.nextDouble(); 
		
		double mediaTotal = (nota1 + nota2)/2; 
		
		if(mediaTotal >= 6) {
			System.out.println("APROVADO COM MÉDIA IGUAL:");
			System.out.println(mediaTotal);
		}else {
			System.out.println("REPROVADO COM MÉDIA: "); 
			System.out.println(mediaTotal);
		}
		
		n1.close();
		n2.close();
	}

}
