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
public class Nomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        String [] nomes = new String [6];
        //alimentando o vetor
        
        for (int i =0; i<6; i++){
        System.out.println("Informe o nome do aluno: "+(i +1)+": ");
        nomes[i] = sc.nextLine();
    }
        //ler o vetor
        System.out.println("Os nomes dos alunos são: ");
        for (int i=0; i<6; i++){
        System.out.println(nomes[i]);
    }
        
        sc.close();
        
    }
    
}
