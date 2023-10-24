package _p116_Juego;

public class App {
    public static void main(String[] args) {
        JuegoDados misdados = new JuegoDados();

        misdados.inicial();
        misdados.jugar();
        misdados.finalizar();
    
        JuegoAdivina miadivina = new JuegoAdivina();
        miadivina.inicial();
        miadivina.jugar();
        miadivina.finalizar();
    }
}
