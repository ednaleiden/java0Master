package org.example.adivinaNumero;

import java.util.Scanner;

public class adivinaNumero {
    public static void main(String[] args) {
        jugar(5);
    }

    static void jugar(int vidas){
    int numerosRandom = (int)(Math.random() *101);
    int numeroElegido = -1;


        Scanner leer = new Scanner(System.in);

        while (numeroElegido != numerosRandom){
            System.out.println("ingrese un numero entre 1 y 100");
            numeroElegido = leer.nextInt();

            if (numerosRandom < numeroElegido){
                System.out.println("el numero es mas pequeño");
                vidas--;
            }else if(numerosRandom > numeroElegido){
                System.out.println("el numero es mas grande");
                vidas--;
            }
            if (vidas == 0){
                System.out.println("GAME OVER");
            }
            System.out.printf("te quedan %s vidas\n", vidas);
        }

        if (numeroElegido == numerosRandom){
            System.out.println("felicidades has ganado el juego !!!!");
        }
    }
}
