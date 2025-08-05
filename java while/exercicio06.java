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
public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int numero;
        int cont =0;
        
       do{ 
        System.out.println("Informe um número positivo: ");
        numero = sc.nextInt();
       
        if (numero > 0){
            if (cont %2 == 0){
                System.out.println(cont+",");
                cont++;
            }
        }else{
                System.out.println("Numero negativo, informe novamente!");
            }
        }while(cont <= numero);
            
            sc.close();
       
       }
}


        
        
        
    
    

