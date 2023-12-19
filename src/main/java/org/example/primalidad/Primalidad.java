package org.example.primalidad;

import java.util.Scanner;

public class Primalidad {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = leer.nextInt();

        if (esPrimo(numero)){
            System.out.println("el numero es primo");
        }else {
            System.out.println("no es numero primo");
        }
    }

    static boolean esPrimo(int num){
        int contador= 0;

        int [] numeros = new int[num];
        for(int i=0; i<numeros.length; i++){
            numeros[i]= i+1;
        }

        for (int i : numeros){
            if (i == 1 || i == num){
                continue;
            }
            if (num % i == 0){
                contador ++;
            }
        }
        return contador == 0;
    }
}
