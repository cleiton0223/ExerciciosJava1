/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
2. Contagem de pares at� 100
Exiba todos os n�meros pares de 0 at� 100 usando um la�o for
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        for (int i = 1; i <=100; i++) {
            if(i %2 ==0){
                System.out.println(i);
            }
            
        }
        
        sc.close();
    }
    
}
