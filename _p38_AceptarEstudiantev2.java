import java.util.Scanner;

public class _p38_AceptarEstudiantev2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el sexo del estudiante (h/m): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la primera calificación: ");
        double calificacion1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

        if (sexo == 'm' && edad > 21 && promedio >= 8 && promedio <= 9.5) {
            System.out.println("¡Felicidades, " + nombre + "! Has sido aceptada en la Universidad Kitty Kat SA.");
        } else {
            System.out.println("Lo sentimos, " + nombre + ". No cumples con los requisitos de admisión.");
        }
    }
}
