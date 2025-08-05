/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05_05_25;

import java.util.Scanner;

/**
 *
 * @author cleiton_bertoldi
 */
public class vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //criando vetor com 5 posições
        
        int [] numeros = new int [5];
        //alimentar o vetor
        for (int i =0; i <5; i++){
            
            System.out.println("Informe um numero: ");
            numeros[i] = sc.nextInt();
            }
        //imprimir valores vetor
        System.out.println("Os numeros informados foram: ");
        for (int i=0; i <5; i++){
            System.out.println(numeros[i]);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        sc.close();
        
    }
    
}
