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
public class exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        String nome;

        do {
            System.out.println("Informe um nome: ");
            nome = sc.nextLine();
            nome = nome.toLowerCase();
            if (!nome.equals("Fim")) {
                nomes.add(nome);
            }
            else{
                System.out.println("Informou o Fim");
            }
        }
        while(!nome.equals("Fim"));
        
        System.out.println("Alunos presentes no final: ");
        for(int i=0; i<nomes.size(); i++){
            System.out.println("Alunos "+nomes.get(i));
        }
        sc.close();
          
    }

}
