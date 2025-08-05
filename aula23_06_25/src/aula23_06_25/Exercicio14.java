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
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int[][] matriz = new int[n][n];

        int soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();

               
                if (i == j || i + j == n - 1) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("Soma das diagonais: " + soma);

        sc.close();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        