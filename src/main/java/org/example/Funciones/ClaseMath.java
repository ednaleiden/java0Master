package org.example.Funciones;

public class ClaseMath {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);


        System.out.println(Math.pow(2,4));
        System.out.println(Math.random());

        System.out.println(Math.random());

        //numeros aleatorios del 1 al 100

        int numerosAleatorios =(int)(Math.random()*101);

        System.out.println(numerosAleatorios);

        System.out.println((int)(Math.sqrt(64)));
        System.out.println(Math.max(7,10));
        System.out.println(Math.min(7,10));
        System.out.println(Math.round(5.9));
    }
}
