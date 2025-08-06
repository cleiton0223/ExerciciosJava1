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
public class exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("1 - Adicione uma tarefa");
            System.out.println("2 - Visualizar as tarefas");
            System.out.println("3 - Remover uma tarefa");
            System.out.println("4 - Sair do programa");

            System.out.print("Informe uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();  // Consumir a quebra de linha

            if (opcao == 1) {
                System.out.print("Adicione o nome da tarefa: ");
                String novaTarefa = sc.nextLine();

                if (tarefas.contains(novaTarefa)) {
                    System.out.println("A tarefa já foi cadastrada.");
                } else {
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa cadastrada com sucesso!");
                }
            } else if (opcao == 2) {
                System.out.println("Tarefas cadastradas:");
                for (String t : tarefas) {
                    System.out.println(t);
                }
            } else if (opcao == 3) {
                System.out.print("Informe a tarefa que deseja remover: ");
                String removertarefa = sc.nextLine();

                if (tarefas.remove(removertarefa)) {
                    System.out.println("Tarefa removida!");
                } else {
                    System.out.println("Tarefa não encontrada.");
                }
            }
            else if(opcao ==4){
                System.out.println("Saindo Do programa");
                break;
            }
            else{
                System.out.println("Opção Inválida");
            }
        }
    }
}
