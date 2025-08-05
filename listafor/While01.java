import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int contador = 1;

       
        System.out.println("Contando de 1 até " + numero + ":");

        while (contador <= numero) {
            System.out.println(contador);
            contador++;
        }

        sc.close();
    }
}
