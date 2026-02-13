
public class NumAleatorios {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao programa que gera 10 números aleatorios entre 0 e 100");


        for (int i = 0; i <= 9; i ++) {

            int min = 0;
            int max = 100;
            int intAleatorio = (int) (Math.random() * (max - min + 1) + min);

            System.out.println(intAleatorio);

        }
    }
}
