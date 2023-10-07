package cursoDeJava;


// 5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.


import java.util.Scanner;

public class exercicio3{
		
	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		System.out.println("Informe o número: "); 
		int numero = ac.nextInt();
		
		System.out.print("O antecessor é: "); 
		System.out.print(numero - 1);
		
		ac.close();
	}
}
