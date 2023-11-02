package cursoDeJava;

import java.util.Scanner; 

/**18) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
*/

public class exercicio16 {

	public static void main(String[] args) {
		
		Scanner aT = new Scanner(System.in); 
		Scanner aN = new Scanner(System.in); 
		
		System.out.println("ANO DE NASCIMENTO:"); 
		int anoNascimento = aN.nextInt(); 
		System.out.println("ANO ATUAL:"); 
		int anoAtual = aT.nextInt(); 
		
		if(anoAtual - anoNascimento >= 16) {
			System.out.println("PODERÁ VOTAR");
		}else {
			System.out.println("NÃO PODERÁ VOTAR");
		}
		
		aT.close();
		aN.close();
	}
}
