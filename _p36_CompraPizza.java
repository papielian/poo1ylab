import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamaños de pizza disponibles:");
        System.out.println("1. Chica ($5)");
        System.out.println("2. Mediana ($10)");
        System.out.println("3. Grande ($20)");
        System.out.println("Seleccione el tamaño de la pizza (1/2/3): ");
        int tamaño = scanner.nextInt();

        double precioPizza;
        switch (tamaño) {
            case 1:
                precioPizza = 5;
                break;
            case 2:
                precioPizza = 10;
                break;
            case 3:
                precioPizza = 20;
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("Ingrese la cantidad de pizzas que desea comprar: ");
        int cantidad = scanner.nextInt();

        double totalCompra = precioPizza * cantidad;
        double descuento = 0;

        if (totalCompra > 2000) {
            descuento = totalCompra * 0.15;
        }

        double totalConDescuento = totalCompra - descuento;

        System.out.println("\nResumen de la compra:");
        System.out.println("Tamaño de la pizza: " + obtenerNombreTamaño(tamaño));
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Total de compra: $" + totalCompra);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total de compra con descuento: $" + totalConDescuento);
    }

    public static String obtenerNombreTamaño(int tamaño) {
        switch (tamaño) {
            case 1:
                return "Chica";
            case 2:
                return "Mediana";
            case 3:
                return "Grande";
            default:
                return "Desconocido";
        }
    }
}
