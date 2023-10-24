package _p116_Juego;

import java.util.Scanner;

public class JuegoAdivina implements Juego {
    private int num, intentos;
    private Scanner teclado;
    public JuegoAdivina(){
        teclado = new Scanner(System.in);

    }

        @Override
    public void inicial() {
        num = 1 + (int) (Math.random() * 100);
        
    }

    @Override
    public void jugar() {
        int num;
        do {
            System.out.print("Adivina número entre 1 y 100: "); num = teclado.nextInt();
            if(this.num<num) System.out.println("El número a adivinar es menor");
            else if(this.num>num) System.out.println("El número a adivimar es mayor");
            intentos++;
        } while(this.num != num);
        
    }

     @Override
    public void finalizar() {
        System.out.println(this.num + " era el número !!!, ganaste el juego despues de " + intentos + " intentos");
        
    }

}
