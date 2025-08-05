/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico01;

import java.util.Scanner;

/**
 *
 * @author cleiton_bertoldi
 */
public class avancado03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maior=0;
        int menor=0;
        int [] numeros = new int [10];
        
        for (int i=0; i<10; i++)
        {
            System.out.println("Informe um numero: ");
            numeros[i]= sc.nextInt();
            if(numeros[i] > maior){
                maior = numeros[i]; 
            
              
                
            }
            if(numeros[i] < menor)
                menor = numeros[i];
          
    }
             System.out.println("Os numeros maiores são: "+maior);
            System.out.println("Os numeros menores são: "+menor);
        
                
    }
    
}
