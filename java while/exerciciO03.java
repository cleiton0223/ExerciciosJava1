
package aula29_04_25;

import java.util.Scanner;


public class exerciciO03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
       int n=0;
        
        System.out.println("Informe um numero positivo: ");
        int numero = sc.nextInt();
        
       while (n<=numero )
       {
           
           System.out.println("Os numeros digitados foram: "+n);
           n++;
       }
         sc.close();
    }
  
    
}
