/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

//Remover duplicados de um vetor
//Receba do usuário um vetor de inteiros e retorne um novo vetor sem
//números duplicados, utilizando apenas laços e estruturas básicas.
public class Exercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int[] vetor = new int[10];

        int[] semDuplicados = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        int cont = 0;

        for (int i = 0; i < 10; i++) {
            boolean duplicado = false;

            for (int j = 0; j < cont; j++) {
                if (vetor[i] == semDuplicados[j]) {
                    duplicado = true;
                    break;
                }
            }

            if (!duplicado) {
                semDuplicados[cont] = vetor[i];
                cont++;
            }
        }

        System.out.println("\nVetor sem duplicados:");
        for (int i = 0; i < cont; i++) {
            System.out.println(semDuplicados[i]);
        }

        sc.close();
    }
}
