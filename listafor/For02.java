public class For02 {
    public static void main(String[] args) {

        System.out.println("Números pares entre 1 e 20:");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}