import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 y 6: ");
        int numero = scanner.nextInt();

        String continente = obtenerNombreContinente(numero);

        if (continente.equals("Error")) {
            System.out.println("Número fuera del rango especificado.");
        } else {
            System.out.println("El continente correspondiente al número " + numero + " es: " + continente);
        }
    }

    public static String obtenerNombreContinente(int numero) {
        switch (numero) {
            case 1:
                return "Asia";
            case 2:
                return "África";
            case 3:
                return "América del Norte";
            case 4:
                return "América del Sur";
            case 5:
                return "Antártida";
            case 6:
                return "Europa";
            default:
                return "Error";
        }
    }
}
