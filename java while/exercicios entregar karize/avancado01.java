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
public class avancado01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int [] numeros = new int [10];
       int maior=0;
       int menor=0;
       double média=0;
       int par=0;
       
       for (int i=0; i<10; i++){
           System.out.println("Informe um numero: "+(i+1)+" : ");
           numeros[i] = sc.nextInt();
           if (numeros[i] %2 ==0){
               par++;
               
               
           }
           System.out.println("\n A quantidade de numeros pares são:  "+par);
           sc.nextLine();
       }
      sc.close();
       }
           
     
    }
    

