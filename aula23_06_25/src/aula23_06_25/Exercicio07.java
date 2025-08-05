/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
Média de uma lista de números
Receba valores em um vetor de números inteiros e gere a média
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numeros = sc.nextInt();

        int[] numero = new int[numeros];

        int soma = 0;
        System.out.println("Digite os " + numeros + " números:");
        for (int i = 0; i < numeros; i++) {
            numero[i] = sc.nextInt();
            soma += numero[i];
        }
        double media = soma / numeros;

        System.out.println("A média final é: " + media);

        sc.close();
    }

}
