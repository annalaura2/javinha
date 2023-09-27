package cursoDeJava;

/**1) Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
nas variáveis. */

public class exercicio1 {

	public static void main(String[] args) {
		int numero1 = 10; 
		int numero2 = 20;
		int aux = numero1;
		numero1 = numero2; 
		numero2 = aux; 
		
		System.out.println("Números invertidos:");
		System.out.println(numero1);
		System.out.println(numero2);
	}
}
