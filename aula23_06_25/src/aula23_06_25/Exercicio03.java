/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
3. Impress�o de nome v�rias vezes
Receba um nome e um n�mero. Imprimir o nome na tela o n�mero de vezes
indicado.
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um nome: ");
        String nome = sc.nextLine();
      
        System.out.println("Informe quantas vezes imprimir: ");
        int numero = sc.nextInt();
         
        
        for (int i = 0; i <numero; i++) {
            System.out.println(nome);
        }
        
        sc.close();
    }
    
}
