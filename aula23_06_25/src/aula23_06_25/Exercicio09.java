/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
Inverter números em um vetor
Peça ao usuário valores inteiro e monte um vetor de 10 posições e gere
outro vetor com os valores invertidos. Apresente o conteúdo dos dois
vetores em tela
 */
public class Exercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[10];
        int[] inverter = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Numeros " + (i + 1) + " : ");
            numero[i] = sc.nextInt();

        }
        
        
        
        System.out.println("Valores Invertidos");
        for (int i = 0; i < 10; i++) {
            inverter[i] = numero[10 - 1 - i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(inverter[i]);

        }

        sc.close();
    }
}
