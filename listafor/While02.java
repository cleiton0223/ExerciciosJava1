import java.util.Scanner;
public class While02 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numero = 1;

        System.out.println("Múltiplos de 3 entre 1 e 30:");

        while (numero <= 30) {
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
