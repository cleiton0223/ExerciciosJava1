/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula27_05_25;

import java.util.ArrayList;
import java.util.Collections; 
/**
 *
 * @author cleiton_bertoldi
 */
public class Aula27_05_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Fiat");
        cars.add("Honda");
        cars.add("Volkswagen");
        cars.add("Volvo");

        System.out.println(cars);
        cars.set(2, "Fusca");
        cars.set(3, "Bicicleta");

        System.out.println(cars);
        System.out.println(cars.get(4));
        cars.remove(3);
        Collections.sort(cars);
        System.out.println(cars);
    }
}
