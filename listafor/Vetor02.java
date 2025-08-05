import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        
        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        
        System.out.println("\nNúmeros digitados em ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Posição [" + i + "] = " + numeros[i]);
        }

        sc.close();
    }
}
