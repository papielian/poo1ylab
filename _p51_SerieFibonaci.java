import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repetir = true;

        while (repetir) {
            System.out.print("Ingrese el valor máximo (n) para la serie de Fibonacci: ");
            int n = scanner.nextInt();

            int a = 0;
            int b = 1;

            System.out.println("La sucesión Fibonacci es:");

            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }

            System.out.println();

            System.out.print("¿Desea continuar? (S/N): ");
            char respuesta = scanner.next().charAt(0);

            repetir = (respuesta == 'S' || respuesta == 's');
        }
    }
}
