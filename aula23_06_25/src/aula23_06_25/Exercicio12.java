/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

//Pal�ndromo com la�o for
//Receba do usu�rio uma palavra e verifique se � um pal�ndromo (lida da
//mesma forma de tr�s para frente).
public class Exercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma palavra: ");
        String palavra = sc.nextLine();

        int tamanho = palavra.length();
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (palavra.charAt(i) == palavra.charAt(tamanho - 1 - i)) {
                contador++;
            }
        }
        if (contador == tamanho) {
            System.out.println("� um palindromo");
        } else {
            System.out.println("Nao � um palindromo");
        }

        sc.close();
    }
}
