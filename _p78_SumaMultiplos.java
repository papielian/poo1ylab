import java.util.Scanner;

public class _p78_SumaMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Suma de Múltiplos:");
            System.out.println("1. Suma de Múltiplos de 3");
            System.out.println("2. Suma de Múltiplos de 4");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor inicial del rango: ");
                    int ini1 = scanner.nextInt();
                    System.out.print("Ingrese el valor final del rango: ");
                    int fin1 = scanner.nextInt();
                    if (ini1 < fin1) {
                        int suma1 = SumaMultiplos(ini1, fin1, 3);
                        System.out.println("La suma de múltiplos de 3 en el rango [" + ini1 + ", " + fin1 + "] es: " + suma1);
                    } else {
                        System.out.println("Rango no válido. El valor inicial debe ser menor que el valor final.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el valor inicial del rango: ");
                    int ini2 = scanner.nextInt();
                    System.out.print("Ingrese el valor final del rango: ");
                    int fin2 = scanner.nextInt();
                    if (ini2 < fin2) {
                        int suma2 = SumaMultiplos(ini2, fin2, 4);
                        System.out.println("La suma de múltiplos de 4 en el rango [" + ini2 + ", " + fin2 + "] es: " + suma2);
                    } else {
                        System.out.println("Rango no válido. El valor inicial debe ser menor que el valor final.");
                    }
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

    public static int SumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
