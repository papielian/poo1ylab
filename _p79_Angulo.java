import java.util.Scanner;

public class _p79_Angulo {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double angulo;
    
            do {
                System.out.print("Ingrese un ángulo entre 0 y 360 grados: ");
                angulo = scanner.nextDouble();
            } while (angulo < 0 || angulo > 360);
    
            String tipo = tipoDeAngulo(angulo);
    
            System.out.println("El ángulo de " + angulo + " grados es " + tipo);
    
            scanner.close();
        }
    
        public static String tipoDeAngulo(double angulo) {
            if (angulo < 90) {
                return "agudo";
            } else if (angulo == 90) {
                return "recto";
            } else if (angulo > 90 && angulo < 180) {
                return "obtuso";
            } else if (angulo == 180) {
                return "llano";
            } else if (angulo > 180 && angulo < 360) {
                return "cóncavo";
            } else {
                return "inválido"; // Esto debería ser manejado si el ángulo está fuera del rango
            }
        }
    }
    
