package _p113_SegundoExamenParcial;

public abstract class Jugador {
    protected String nombre;
    protected char sexo;
    protected String descripcion;
    protected double salario;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    public abstract double getBono();

    @Override
    public String toString() {
        return "Jugador [Nombre=" + nombre + ", Sexo=" + sexo + ", Descripcion=" + descripcion + ", Salario=" + salario + "]";
    }
}
