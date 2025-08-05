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
public class notasmedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double soma=0;
        double media;
        double [] notas = new double [3];
        String opcao;
        
        System.out.println("Deseja informar notas do aluno? Sim ou Não");
        opcao = sc.nextLine().toLowerCase();
        
        while (opcao.equals("Sim")){
            
        
        
        //alimentando o vetor 
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a nota: ");
            notas[i]= sc.nextDouble();
            soma+= notas[i];
        }
        //lendo o vetor
        for (int i = 0; i < 3; i++) {
            System.out.println(notas[i]);
            
        }
                media = soma/3;
                System.out.println("A média do aluno foi: "+media);
                sc.nextLine(); 
                 System.out.println("Deseja informar notas do aluno? Sim ou Não");
                opcao = sc.nextLine().toLowerCase();
        }
                sc.close();
    }
    
}
