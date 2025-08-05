/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

/**
 3. Quantidade de vogais em uma palavra
Peça uma String ao usuário e conte quantas vogais ela possui.
 */
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe uma frase: ");
        String frase = sc.nextLine().toLowerCase(); 
        
        int mais=0;
        for (int i = 0; i <frase.length(); i++) {
            char a = frase.charAt(i);
            if(a == 'a' || a =='e' || a =='i' || a =='u')
                mais++;
        }
        System.out.println("A Quantidade de vogais são: "+mais);
        
        
        
        
        
        
        
        
        
        
        
        sc.close();
    }
    
}
