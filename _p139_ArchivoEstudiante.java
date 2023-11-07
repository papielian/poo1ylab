 

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
    private char sexo;

    public Estudiante(String nombre, int edad, double promedio, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio + ", Sexo: " + sexo;
    }
}

public class _p139_ArchivoEstudiante {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int numEstudiantes;

        System.out.print("Ingrese el número de estudiantes: ");
        numEstudiantes = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); 

            Estudiante estudiante = new Estudiante(nombre, edad, promedio, sexo);
            estudiantes.add(estudiante);
        }

        try (PrintWriter writer = new PrintWriter("estudiantes.txt")) {
            for (Estudiante estudiante : estudiantes) {
                writer.println(estudiante.getNombre() + "," + estudiante.getEdad() + "," + estudiante.getPromedio() + "," + estudiante.getSexo());
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo.");
        }

        List<Estudiante> estudiantesCargados = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("estudiantes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String nombre = parts[0];
                    int edad = Integer.parseInt(parts[1]);
                    double promedio = Double.parseDouble(parts[2]);
                    char sexo = parts[3].charAt(0);
                    Estudiante estudiante = new Estudiante(nombre, edad, promedio, sexo);
                    estudiantesCargados.add(estudiante);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo.");
        }

        System.out.println("Estudiantes cargados desde el archivo:");
        for (Estudiante estudiante : estudiantesCargados) {
            System.out.println(estudiante);
        }

        double promedioCalificaciones = 0;
        double promedioEdades = 0;
        int cantidadHombres = 0;
        int cantidadMujeres = 0;

        for (Estudiante estudiante : estudiantes) {
            promedioCalificaciones += estudiante.getPromedio();
            promedioEdades += estudiante.getEdad();

            if (estudiante.getSexo() == 'M') {
                cantidadHombres++;
            } else if (estudiante.getSexo() == 'F') {
                cantidadMujeres++;
            }
        }

        promedioCalificaciones /= estudiantes.size();
        promedioEdades /= estudiantes.size();

        System.out.println("Promedio de calificaciones: " + promedioCalificaciones);
        System.out.println("Promedio de edades: " + promedioEdades);
        System.out.println("Cantidad de hombres: " + cantidadHombres);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
    }
}
