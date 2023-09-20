import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos términos? ");
        int n = scanner.nextInt();

        int numero = 1; // Inicializamos el número a 1
        int suma = 0;   // Inicializamos la suma a 0

        System.out.print("Salida: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numero); // Imprimimos el número actual
            suma += numero;          // Agregamos el número a la suma

            if (i < n - 1) {
                System.out.print("+"); // Imprimimos el signo "+" excepto en el último término
            }

            numero = numero * 10 + 1; // Generamos el siguiente número en la secuencia
        }

        System.out.println();
        System.out.println("Suma: " + suma);
    }
}
