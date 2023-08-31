import java.util.Scanner;

public class _p37_CalculosNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            double calificacion = scanner.nextDouble();
            sum += calificacion;
        }

        double promedio = sum / 5;

        System.out.println("\nPromedio: " + promedio);

        if (promedio > 0 && promedio <= 6) {
            System.out.println("Quedas reprobado");
        } else if (promedio > 6 && promedio <= 7) {
            System.out.println("Pasas de panzazo");
        } else if (promedio > 7 && promedio <= 8) {
            System.out.println("Muy bien, pero puedes mejorar");
        } else if (promedio > 8 && promedio <= 9) {
            System.out.println("Excelente, sigue así");
        } else if (promedio > 9 && promedio <= 10) {
            System.out.println("Perfecto, tu esfuerzo valió la pena");
        } else {
            System.out.println("Promedio fuera de rango");
        }
    }
}
