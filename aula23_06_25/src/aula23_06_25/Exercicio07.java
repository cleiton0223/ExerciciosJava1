/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
M�dia de uma lista de n�meros
Receba valores em um vetor de n�meros inteiros e gere a m�dia
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numeros = sc.nextInt();

        int[] numero = new int[numeros];

        int soma = 0;
        System.out.println("Digite os " + numeros + " n�meros:");
        for (int i = 0; i < numeros; i++) {
            numero[i] = sc.nextInt();
            soma += numero[i];
        }
        double media = soma / numeros;

        System.out.println("A m�dia final �: " + media);

        sc.close();
    }

}
