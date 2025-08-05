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
public class exercicios02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double [] temperatura = new double [3];
        double media;
        double soma=0;
        String opcao;
        
     
           
do{
             //alimentando os valores das temperaturas
             for(int i=0; i<3; i++){
             System.out.println("Informe uma temperatura do: "+(i + 1)+" Dia: ");
             temperatura[i] = sc.nextDouble();
          
             
         }
             //gerando média de temperatura 
              for(int i=0; i<3; i++){
                 soma+= temperatura[i];
                 System.out.println(temperatura[i]);
                 
    }
              media = soma /3;
              
              System.out.println("A média das temperaturas em tres dias foi: "+media+("ºGraus"));
              
              sc.nextLine();
            
              System.out.println("Deseja informar a temperatura de outra cidade? Sim ou Não");
              opcao = sc.nextLine().toLowerCase();
        
             }while(opcao.equals("sim"));
             sc.close();
            
}
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
    
   

