package _p113_SegundoExamenParcial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String liga;
    private List<Jugador> jugadores;

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public double getTotalBono() {
        double totalBono = 0.0;
        for (Jugador jugador : jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double totalSalarios = 0.0;
        for (Jugador jugador : jugadores) {
            totalSalarios += jugador.salario;
        }
        return totalSalarios + getTotalBono();
    }

    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.sexo == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }

    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.sexo == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }

    public void reporte() {
        System.out.println(">> Equipo [Nombre=" + nombre + ", Liga=" + liga + ", Jugadores=" + jugadores.size() + ", Bono=" + getTotalBono() + ", Total=" + getTotal() + ", Hombres=" + getTotalH() + ", Mujeres=" + getTotalM() + "]");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.toString());
        }
    }
}
