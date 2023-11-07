 

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _p138_ArchivoMaterias {
    public static void main(String[] args) {
        
        List<String> materias = new ArrayList<>();

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las materias cursadas (ingresa 'fin' para terminar):");

        String materia;
        while (true) {
            materia = scanner.nextLine();
            if (materia.equalsIgnoreCase("fin")) {
                break;
            }
            materias.add(materia);
        }

        scanner.close();

        String nombreArchivo = "materias.txt";

        try (FileWriter fileWriter = new FileWriter(nombreArchivo);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (String materiaCursada : materias) {
                bufferedWriter.write(materiaCursada);
                bufferedWriter.newLine();
            }

            System.out.println("Las materias han sido escritas en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        try (FileReader fileReader = new FileReader(nombreArchivo);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String linea;
            System.out.println("Materias en el archivo:");

            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

