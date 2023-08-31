//numeros consecutivos 
import java.util.Scanner;

public class _p33_NumerosConsecutivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        if (sonConsecutivos(num1, num2, num3)) {
            System.out.println("Los números son consecutivos: " + num1 + ", " + num2 + ", " + num3);
        } else {
            System.out.println("Los números no son consecutivos: " + num1 + ", " + num2 + ", " + num3);
        }
    }

    public static boolean sonConsecutivos(int a, int b, int c) {
        if ((b == a + 1) && (c == b + 1)) {
            return true;
        }
        return false;
    }
}
