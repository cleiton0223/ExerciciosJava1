/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula29_04_25;

import java.util.Scanner;

/**
 *
 * @author cleiton_bertoldi
 */
// Fa�a um programa que leia uma sequ�ncia de n�meros inteiros at� que o usu�rio digite o n�mero 0. O programa deve calcular a soma de todos os n�meros digitados e imprimir o resultado.


public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        double soma=0;
         System.out.println("0 para encerrar o programa: ");
        do {            
              System.out.println("Informe um numero: ");
        numero = sc.nextInt();
        soma += numero;
        } while (numero !=0);
    
    System.out.println("A soma dos n�meros digitados �: " + soma);
    
    sc.close();
    
}
}

