import java.util.Scanner;

public class _p76_DiaSemana {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int numeroDia;
            String diaDeLaSemana;
    
            do {
                System.out.print("Ingrese un número entre 1 y 7: ");
                numeroDia = scanner.nextInt();
            } while (numeroDia < 1 || numeroDia > 7);
    
            diaDeLaSemana = obtenerDiaDeLaSemana(numeroDia);
    
            System.out.println("El día de la semana correspondiente es: " + diaDeLaSemana);
    
            scanner.close();
        }
    
        public static String obtenerDiaDeLaSemana(int numeroDia) {
            String[] dias = {
                "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"
            };
    
            return dias[numeroDia - 1];
        }
    }    
