import java.util.Scanner;

public class _p34_NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = NumeroMayor(num1, num2, num3);

        System.out.println("El mayor número es: " + mayor);
    }

    public static int NumeroMayor(int a, int b, int c) {
        int max = a;
        
        if (b > max) {
            max = b;
        }
        
        if (c > max) {
            max = c;
        }
        
        return max;
    }
}
