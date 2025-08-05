import java.util.Scanner;

public class Estrutura02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite números inteiros para somar:");

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("A soma dos números digitados é: " + soma);
        sc.close();
    }
}
