/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
 1. Soma de 1 a N
Crie um programa que receba um número inteiro n e retorne a soma de
todos os números de 1 até n.

 */
public class Aula23_06_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
      int soma=0;
        System.out.println("Informe um número: ");
        int numero = sc.nextInt();
        for (int i = 1; i <=numero; i++) {
           soma+=i;
            
        } 
         System.out.println("A soma dos números é : "+soma);
        
        sc.close();
    }
    
}
