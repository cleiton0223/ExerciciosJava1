/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
 *
 * @author cleiton_bertoldi
 */
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine().trim();

        int palavras = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {

                if (i == 0 || frase.charAt(i - 1) == ' ') {
                    palavras++;
                }
            }
        }

        System.out.println("Número de palavras: " + palavras);

        sc.close();
    }
}
