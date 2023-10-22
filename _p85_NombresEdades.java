import java.util.Scanner;

public class _p85_NombresEdades {
    public static void main(String[] args) {
        int n = 0, s = 0, p = 0;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCuantas personas deseas procesar? "); n = obj.nextInt();
        String[] nombres = new String[n];
        int[] edades = new int[n];

        System.out.printf("\nIntroduce los nombres y edades de las %d personas que dijiste ",n);
        for(int i=0; i < n; i++){
            obj.nextLine();
            System.out.printf("Dame el nombre %d ? ", i+1); nombres[i] = obj.nextLine();
            System.out.printf("dame la edad ?"); edades[i] = obj.nextInt();
        }

        System.out.println("\nLos nombres y las edades capturadas son: ");
        System.out.printf("Nombre\tEdad\n");
        for(int i=0; i<n; i++){
        System.out.printf("%s\t%d\n", nombres[i], edades[i]);
        s = s + edades[i];

        }
        p = s / n;
        System.out.println("\nEl promedio de edades es " + p);
    }
}
