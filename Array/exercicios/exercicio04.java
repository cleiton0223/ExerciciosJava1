/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula27_05_25;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author cleiton_bertoldi
 */
public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> cadastros = new ArrayList<String>();
        int opcao=0;
        
        while(opcao !=4){
            
            System.out.println("1-Cadastrar o Cliente: ");
            System.out.println("2-Clientes Cadastrados: ");
            System.out.println("3- Sair do programa: ");
            
            System.out.println("Informe a opção: ");
            opcao = sc.nextInt();
            
            sc.nextLine();
            
            if(opcao ==1){
                System.out.println("Informe o cadastro do cliente: ");
                int cadastro = sc.nextInt();
            }
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
