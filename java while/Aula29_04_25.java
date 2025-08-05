
package aula29_04_25;

import java.util.Scanner;


public class Aula29_04_25 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
    int idade;
    int soma=1; int cont =1;
    
    do {
        System.out.println("Informe a idade: ");
        idade = sc.nextInt();
        if(idade > 0)
        {
            soma += soma + idade;
            cont++;
            System.out.println("A média da idade é : "+soma /cont); 
        }
        else {
            System.out.println("Usúario digitou -1:");
        }
    
    }
    while (idade != -1);
              
sc.close();
    }
}

        

    
         
         
         
   
      
         
   
      
        
      
      
    
    

