/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10_06_25;

import java.util.Scanner;

/**
 *
 * @author cleiton_bertoldi
 */
public class Exercicio03 {
    public static String nomeNumero(int num,String nome){
        Scanner sc = new Scanner(System.in);
                 
        String nomes ="";
        
       
        for (int i = 0; i < num ; i++) {
            nomes+= nome+"\n";
             
            
        }
        return nomes;
         
    }
    
}
