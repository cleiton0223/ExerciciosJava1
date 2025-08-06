package aula27_05_25;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0; // ou qualquer número diferente de 3

        ArrayList<String> produtos = new ArrayList<String>();

        while (opcao != 3) {

            System.out.println("1- Cadastre o produto: ");
            System.out.println("2- Visualiza o produto: ");
            System.out.println("3- Sair do sistema: ");

            System.out.println("Informe uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Informe o nome do produto: ");
                String produto = sc.nextLine();

                if (produtos.contains(produto)) {
                    System.out.println("Produto já Cadastrado.");
                } else {
                    produtos.add(produto);
                    System.out.println("Produto cadastrado.");
                }
            }

            if (opcao == 2) {
                for (String p : produtos) {
                    System.out.println(p);
                }
            } else if (opcao == 3) {
                System.out.println("Saindo");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}

       
