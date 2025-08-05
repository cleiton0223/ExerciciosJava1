/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05_05_25;

import java.util.Scanner;

/**
 *
 * @author cleiton_bertoldi
 */
public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int [] vasco = new int [3];
        int [] inter = new int [3];
        int [] torneio = new int [3];
        
        
        for(int i=0; i<3; i++){
            System.out.println("Informe o numero de gols do vasco: ");
           vasco[i] = sc.nextInt();
           
         System.out.println("Informe o numero de gols do inter: ");  
         inter[i] = sc.nextInt();
        }
        for (int i=0; i<3; i++){
           torneio[i] = vasco[i] + inter [i];
            
         
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(torneio[i]);
        }
           sc.close();
               
    }
    
}
