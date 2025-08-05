package aula23_06_25;

import java.util.Scanner;

//Receba do usuário o tamanho de uma matriz e imprima uma matriz
//identidade de tamanho n (ou seja, com 1 na diagonal principal e 0 no
//restante).
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }

}
