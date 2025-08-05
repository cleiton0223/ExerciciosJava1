import java.util.Scanner;

public class Vetor01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; 


        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }


        System.out.println("\nOs números digitados foram:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição [" + i + "] = " + numeros[i]);
        }

        sc.close();
    }
}
