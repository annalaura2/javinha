package cursoDeJava;

public class variaveis {
	
	public static void main (String[] args) {
		
		byte meuByte = 127; //inteiros ou negativos, requer 8 bits (pouca memória), de -128 a 127
		System.out.println("Byte: " + meuByte);
		
		short meuShort = 32767; 
		System.out.println("Short: " + meuShort);
		//dobro de bits do byte, min -32768 e max 32767
		
		int idade = 20; //32 bits
		System.out.println("Int: " + idade);
		
		long meuLong = 10L; // 64 bits
		System.out.println("Long: " + meuLong);
		
		double salario = 1412.56; //64 bits dupla precisão
		System.out.println("Double: " + salario); 
		
		float salarioF = 1412.51F;  //32 bits precisão simples
		System.out.println("Float: " + salarioF);
		
		char inicial = 'a'; // 16 bits unicode
		System.out.println("Char: " + inicial);
		
		boolean condicao = true; 
		System.out.println("Boolean: " + condicao);
		
	}
	
	

	
 
}
