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
public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palavra; int n=0;
        
        System.out.println("Informe uma palavra: ");
        palavra = sc.nextLine();
        
        String palavraInvertida = "";
        n = palavra.length() -1;
        
        if (n >=0)
        {
            do {
                palavraInvertida += palavra.charAt(n);
                n --;
            }
            while (n >=0);
            }
        System.out.println("Palavra invertida "+ palavraInvertida);
        
        sc.close();
    }
    
}
