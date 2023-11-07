import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class _p137_ArchivoMunicipios {
    public static void main(String[] args) {
        // Nombre del archivo donde se almacenarán los deportes.
        String nombreArchivo = "deportes.txt";

        // Lista de deportes a escribir en el archivo.
        String[] deportes = {
            "Fútbol",
            "Béisbol",
            "Ciclismo",
            "Atletismo",
            "Natación",
            "Motociclismo"
        };

        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String deporte : deportes) {
                bufferedWriter.write(deporte);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Los datos han sido escritos en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            System.out.println("Datos en el archivo:");

            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

