package cursoDeJava;

// @author = ANNA LAURA 
//8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores.

import java.util.Scanner; 

public class exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner eleitores = new Scanner(System.in); 
		Scanner votosB = new Scanner(System.in); 
		Scanner votosN = new Scanner(System.in); 
		Scanner votosV = new Scanner(System.in);
		
		System.out.println("Informe o número de eleitores:"); 
		double totalEleitores = eleitores.nextInt();
		
		System.out.println("Informe o númeo de votos brancos:"); 
		double votosBrancos = votosB.nextInt(); 
		
		System.out.println("Informe o número de votos nulos:"); 
		double votosNulos = votosN.nextInt(); 
		
		System.out.println("Informe os votos válidos:"); 
		double votosValidos = votosV.nextInt(); 
		
		double pBrancos, pNulos, pValidos; 
		
		pBrancos = (votosBrancos/totalEleitores)*100; 
		pNulos = (votosNulos/totalEleitores)*100; 
		pValidos = (votosValidos/totalEleitores) *100; 
		
		System.out.println("===PERCENTUAL BRANCOS==="); 
		System.out.println(pBrancos);
		System.out.println("===PERCENTUAL NULOS==="); 
		System.out.println(pNulos); 
		System.out.println("===PERCENTUAL VALIDOS=="); 
		System.out.println(pValidos);
		
		
