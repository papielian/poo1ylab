import java.util.Scanner;

public class _p77_MedidasLongitud {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Conversiones:");
            System.out.println("1. Pulgadas a Centímetros");
            System.out.println("2. Metros a Pies");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad en pulgadas: ");
                    double pulgadas = scanner.nextDouble();
                    double centimetros = convertirPulgadasACentimetros(pulgadas);
                    System.out.println(pulgadas + " pulgadas equivalen a " + centimetros + " centímetros.");
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad en metros: ");
                    double metros = scanner.nextDouble();
                    double pies = convertirMetrosAPies(metros);
                    System.out.println(metros + " metros equivalen a " + pies + " pies.");
                    break;
                case 3:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static double convertirPulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double convertirMetrosAPies(double metros) {
        return metros * 3.281;
    }
}
