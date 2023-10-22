import java.util.Scanner;

public class _p84_PromedioArreglo {
    public static void main(String[] args) {
        int n = 0;
        float suma = 0, promedio = 0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\nCuantas calificaciones deseas procesar? ");
        n = obj.nextInt();

        float[] califs = new float[n];

        System.out.printf("introduce las %d calificaciones \n", n);
        for(int i=0; i < califs.length; i++) {
        califs[i] = obj.nextFloat();
        }
        
        System.out.println("\nLas calificaciones capturadas son");
        for(float cal : califs){
            System.out.printf("$.2f", cal);
            suma = suma + cal;
        } 
        promedio = suma / califs.length;
        System.out.printf("\nLa suma es: %.2f", suma);
        System.out.printf("\nEl promedio: %.2f", promedio);
     }
}
