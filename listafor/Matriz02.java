import java.util.Scanner;

public class Matriz02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;

               System.out.println("Digite os valores para a matriz 2x2:");

        for (int i = 0; i < 2; i++) {         
            for (int j = 0; j < 2; j++) {     
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j]; 
            }
        }

        
        System.out.println("\nMatriz 2x2:");
        for (int i = 0; i < 2; i++) {         
            for (int j = 0; j < 2; j++) {     
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        
        System.out.println("\nSoma dos elementos da matriz: " + soma);

        sc.close();
    }
}
