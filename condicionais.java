package cursoDeJava;

public class condicionais {
	
	public static void main(String[] args) {
		
		int a= 40; 
		int b = 40; 
		
		if(a == b) {
			System.out.println("IGUAIS");
		}else {
			System.out.println("DIFERENTES");
		}
		
		if(a > 40) {
			System.out.println("MAIOR QUE 40");
		}else {
			if(a == 40) {
				System.out.println("IGUAL A 40");
			}else {
				System.out.println("MENOR QUE 40");
			}
		}
		
		//switch case 
		String nomeDoMes = "java"; 
		switch(nomeDoMes ) {
		case "janeiro": 
			System.out.println(1); 
			break;
		case "fevereiro": 
			System.out.println(2);
			break;
		default:
			System.out.println("NÃO SEI O MÊS"); 
			break;
		}
		
		
	}

}
