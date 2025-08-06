/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10_06_25;

//Soma de 1 a N
//Crie um método que receba um número inteiro n como parâmetro e retorne
//a soma de todos os números de 1 até n.
public class Exercicio01 {

    public static int soma(int num) {
        int soma = 0;
        for (int i = 0; i <= num; i++) {
            soma = soma + i;

        }
        return soma;
    }

}
