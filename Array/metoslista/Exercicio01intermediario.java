/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10_06_25;

/**
 *
 * @author cleiton_bertoldi
 */
public class Exercicio01intermediario {

    public static int fatorial(int numero) {

        int fatorial = 1;

        for (int i = numero; i >=1; i--) {
            fatorial*=i;

        }
        return fatorial;
    }

}
