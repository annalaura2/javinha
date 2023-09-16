public class operadoresLogicos {

    public static void main(String[] args) {
        int idade = 14;
        boolean idadeVotar = idade > 18 && idade < 71;

        System.out.println(idadeVotar);

        boolean idadeAleatoria = !(idade == 6 || idade == 8);
        System.out.println(idadeAleatoria);

        boolean idadeAleatoria2 = (idade == 1 || idade == 2);
        System.out.println(idadeAleatoria2);
    }
}
