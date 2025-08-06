/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10_06_25;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author cleiton_bertoldi
 */
public class Exercicio04 {
    public static void tabuada(int numero){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 10 ; i++) {
            int resposta =numero *i;
            System.out.println(numero+ " x "+i +" = "+resposta);
            
        }
        
    }
            
    
}
