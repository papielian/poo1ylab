import java.util.Scanner;

public class _p49_ParesDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repetir = true;

        while (repetir) {
            System.out.print("Ingrese un número (n) para imprimir los números pares desde 100 hasta ese número: ");
            int n = scanner.nextInt();

            if (n < 100) {
                System.out.println("El número debe ser mayor o igual a 100. Intente de nuevo.");
                continue;
            }

            System.out.println("Números pares desde 100 hasta " + n + ":");
            int suma = 0;
            int contador = 0;

            for (int i = 100; i >= 2 && i >= n; i -= 2) {
                System.out.print(i + " ");
                suma += i;
                contador++;
            }

            double promedio = (double) suma / contador;

            System.out.println("\nSuma de los números pares: " + suma);
            System.out.println("Promedio de los números pares: " + promedio);

            System.out.print("¿Desea continuar? (S/N): ");
            char respuesta = scanner.next().charAt(0);

            repetir = (respuesta == 'S' || respuesta == 's');
        }
    }
}
