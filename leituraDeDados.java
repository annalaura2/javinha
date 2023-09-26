
import java.util.Scanner; 

public class leituraDeDados {
    public static void main(String[] args){
        int idade = 0;

        class Scanner sc = new Scanner(System.in) {
            idade = sc.nextInt();
        }
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
