/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
5. Contador regressivo
Receba um n�mero n e fa�a a contagem regressiva at� 0
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um n�mero: ");
        int numero = sc.nextInt();
        
        for (int i = numero; i >=0; i--) {
            System.out.println(i);
        }
        
        sc.close();
    }
    
}
