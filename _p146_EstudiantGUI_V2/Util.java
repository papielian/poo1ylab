package _p147_TercerExamenParcial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        return new ArrayList<>();
    }

    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        try (FileOutputStream arch = new FileOutputStream(archivo);
             ObjectOutputStream fjugadores = new ObjectOutputStream(arch)) {
            fjugadores.writeObject(datos);
        }
    }

    public static ArrayList<Jugador> deserializarDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Jugador> datos;
        try (FileInputStream arch = new FileInputStream(archivo);
             ObjectInputStream fjugadores = new ObjectInputStream(arch)) {
            datos = (ArrayList<Jugador>) fjugadores.readObject();
        }
        return datos;
    }
}
