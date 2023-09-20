import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos términos? ");
        int n = scanner.nextInt();

        double suma = 0.0;

        System.out.print("Salida: ");
        for (int i = 1; i <= n; i++) {
            double termino = 1.0 / i;
            suma += termino;

            System.out.print("1/" + i);
            if (i < n) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.println("Suma: " + suma);
    }
}
