package org.example;

import java.util.Scanner;

public class Espar {
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);

        System.out.println("ingrese un numero entero");


        int n = leer.nextInt();

        if (n != 0) {
            if (n > 0){
                if (n % 2 == 0) {
                    System.out.println("el numero es par");
                }
                else {
                    System.out.println("el numero es impar");
                }
            }else {
                System.out.printf("el numero  %d es negativo", n );
            }

        }else{

            System.out.printf("el numero ingresado  %d es neutro\n", n );
        }

    }
}
