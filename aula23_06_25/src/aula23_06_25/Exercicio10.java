/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23_06_25;

import java.util.Scanner;

//Verificação de número primo
//Receba do usuário um número e retorne true se ele for primo, ou false caso
//contrário.
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = sc.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;

                }
            }
        }
        System.out.println(primo);

        sc.close();
    }

}
