package _p116_Juego;

import java.util.Scanner;

public class JuegoDados implements Juego{
    private int dado1, dado2;
    private String jugador1, jugador2;
    private Scanner taclado;
    public JuegoDados() {
        taclado = new Scanner(System.in);
    }
    @Override
    public void inicial() {
        System.out.println("Jugador1: "); jugador1 = taclado.nextLine();
        System.out.println("Jugador2: "); jugador2 = taclado.nextLine();
         
    }
    @Override
    public void jugar() {
        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        System.out.println(jugador1 + " le salio el valor de " + dado1);
        System.out.println(jugador2 + " le salio el valor de " + dado2);
        
    }
    @Override
    public void finalizar() {
        if(dado1 > dado2) System.out.println("Gano " + jugador1 + " con un valor de " + dado1);
        else if(dado2 > dado1) System.out.println("Gano " + jugador2 + " con un valor de " + dado2);
        else System.out.println("Empataron los jugadores con el valor de " + dado1);
        
    }
    
}
