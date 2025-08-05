/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
Receba um número inteiro e imprima sua tabuada de 1 a 10.
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número para tabuada: ");
        int numero = sc.nextInt();
        
        for (int i = 1; i <=10; i++) {
            System.out.println(numero +" X "+ i +" : "+(numero*i));
        }
        
        sc.close();
    }
    
}
