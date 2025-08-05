/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basico01;

import java.util.Scanner;

/**
 *
 * @author cleiton_bertoldi
 */
public class Basico01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
          
        Scanner sc = new Scanner(System.in);
        
        int [] numero = new int [5];
        double soma=0;
        double maior10=0;
        
        for (int i=0; i<5; i++)
        {
            System.out.println("Informe um numero: ");
            numero[i] = sc.nextInt();
            soma+= numero[i];
            if(numero[i] >=10){
              maior10++;
            }
        }
        for (int i=0; i<5; i++){
            System.out.println(numero[i]);
            
        }
        System.out.println("Inverso dos numeros é: ");
        for (int i=4; i>=0; i--){
            System.out.println(numero[i]);
        }
        System.out.println("A Soma de todos os números é: "+soma);
        sc.close();
    }
    
}
  
    
    

