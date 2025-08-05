import java.util.Scanner;

public class Estrutura01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite números (digite um número negativo para encerrar):");

               do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
        } while (numero >= 0);

        System.out.println("Número negativo digitado. Programa encerrado.");
        sc.close();
    }
}
