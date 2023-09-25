import java.util.Scanner;

public class _p80_PrimerExamenParcial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalParticipantes = 0;
        double totalDineroAlumnos = 0;
        double totalDineroDocentes = 0;
        double totalDineroTrabajadores = 0;
        double totalDineroGeneral = 0;
        double totalEdad = 0;
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Bienvenido al control de inscripciones");
        System.out.println("Ingrese los datos de los participantes (o 'fin' para terminar):");
        
        while (true) {
            System.out.print("Nombre: ");
            String nombre = input.nextLine();
            
            if (nombre.equals("fin")) {
                break;
            }
            
            System.out.print("Edad: ");
            int edad = input.nextInt();
            input.nextLine();  // Consumir la nueva línea pendiente
            
            System.out.print("Sexo (M/F): ");
            char sexo = input.nextLine().charAt(0);
            
            System.out.print("Tipo de Participante (Alumno/Docente/Trabajador): ");
            String tipoParticipante = input.nextLine();
            
            if (edad >= 18) {
                totalParticipantes++;
                totalEdad += edad;
                
                switch (tipoParticipante.toLowerCase()) {
                    case "alumno":
                        totalAlumnos++;
                        totalDineroAlumnos += 50;
                        break;
                    case "docente":
                        totalDocentes++;
                        totalDineroDocentes += 80;
                        break;
                    case "trabajador":
                        totalTrabajadores++;
                        totalDineroTrabajadores += 60;
                        break;
                }
                
                if (sexo == 'M' || sexo == 'm') {
                    totalHombres++;
                } else if (sexo == 'F' || sexo == 'f') {
                    totalMujeres++;
                }
            }
        }
        
        totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
        double promedioEdad = totalEdad / totalParticipantes;
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nEstadísticas:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de la edad de todos los participantes: " + promedioEdad);
        
        System.out.println("\nDinero recaudado:");
        System.out.println("Total dinero recaudado de Alumnos: " + totalDineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: " + totalDineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: " + totalDineroTrabajadores);
        System.out.println("Total dinero en general: " + totalDineroGeneral);
        
        System.out.println("\nMensaje final de despedida:");
        if (totalDineroGeneral < 100) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (totalDineroGeneral < 200) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }
        
        input.close();
    }
}