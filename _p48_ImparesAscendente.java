import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repetir = true;

        while (repetir) {
            System.out.print("Ingrese un número (n) para imprimir los números impares hasta ese número: ");
            int n = scanner.nextInt();

            if (n < 1) {
                System.out.println("El número debe ser mayor o igual a 1. Intente de nuevo.");
                continue;
            }

            System.out.println("Números impares desde 1 hasta " + n + ":");
            int suma = 0;
            int contador = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    suma += i;
                    contador++;
                }
            }

            double promedio = (double) suma / contador;

            System.out.println("\nSuma de los números impares: " + suma);
            System.out.println("Promedio de los números impares: " + promedio);

            System.out.print("¿Desea repetir el proceso? (S/N): ");
            char respuesta = scanner.next().charAt(0);

            repetir = (respuesta == 'S' || respuesta == 's');
        }
    }
}
