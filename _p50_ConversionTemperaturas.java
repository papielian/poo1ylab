import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean repetir = true;

        while (repetir) {
            System.out.print("Ingrese la temperatura inicial en grados Celsius: ");
            double temperaturaInicial = scanner.nextDouble();

            System.out.print("Ingrese la temperatura final en grados Celsius (debe ser mayor o igual a la temperatura inicial): ");
            double temperaturaFinal = scanner.nextDouble();

            if (temperaturaFinal < temperaturaInicial) {
                System.out.println("Error: La temperatura final no puede ser menor que la temperatura inicial.");
                continue;
            }

            System.out.println("------------------------------------");
            System.out.println("Centígrados   Fahrenheit");
            System.out.println("------------------------------------");

            for (double celsius = temperaturaInicial; celsius <= temperaturaFinal; celsius++) {
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("%.2f           %.2f%n", celsius, fahrenheit);
            }

            System.out.println("------------------------------------");

            System.out.print("¿Desea continuar? (S/N): ");
            char respuesta = scanner.next().charAt(0);

            repetir = (respuesta == 'S' || respuesta == 's');
        }
    }
}
