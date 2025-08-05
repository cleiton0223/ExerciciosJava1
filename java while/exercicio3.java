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
public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int numero=0, cont =0;
        
        System.out.println("Informe um número: ");
        numero = sc.nextInt();
        
        do {
            System.out.println(cont +",");
            cont++;
        }
        while (cont <= numero);
        sc.close();
    }
           
    
}
