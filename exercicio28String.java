package cursoDeJava;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**32) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.*/

public class exercicio28 {
	
	public static void main(String[] args) {
		
		Scanner g1 = new Scanner(System.in); 
		Scanner g2 = new Scanner(System.in);
		
		System.out.println("Informe o nome do primeiro time:"); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String time1 = null;
		
		try {
			time1 = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO erro tentando ler o nome");
			System.exit(1);
		}
		
		System.out.println("Informe o nome do segundo time:"); 
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); 
		String time2 = null;
		
		try {
			time2 = br1.readLine();
		} catch (IOException ioe) {
			System.out.println("IO erro tentando ler o nome");
			System.exit(1);
		}
		
		System.out.println("Informe o número de gols do primeiro time"); 
		int golsT1 = g1.nextInt(); 
		System.out.println("Informe o número de gols do segundo time"); 
		int golsT2 = g2.nextInt();
		
		if(golsT1 > golsT2) {
			System.out.println("O vencedor é:" + time1);
		}else {
			if(golsT2 > golsT1) {
				System.out.println("O vencedor é:" +time2); 
			}else {
				System.out.println("EMPATE");
			}
		}
		
		
		
	}
	

}
