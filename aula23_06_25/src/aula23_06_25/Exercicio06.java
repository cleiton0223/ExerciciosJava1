/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
 *
 Receba um número inteiro e retorne seu fatorial.
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        int numero = sc.nextInt();
        
        
        double fatorial=1;
        
        for (int i = numero; i >0; i--) {
            fatorial *=i;
        }
        System.out.println("O Resultado do fatorial é: "+fatorial);
        
        
        
        
        
        
        
        sc.close();
    }
    
}
