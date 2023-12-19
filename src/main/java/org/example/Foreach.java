package org.example;

public class Foreach {
    public static void main(String[] args) {
        String[] nombres = {"Edna", "Gomez","Diaz","Sánchez"};


        //opcion 1
        int i = 0;

        while (i < nombres.length){
            System.out.println(nombres[i]);
            i++;
        }

        //opcion 2

        for (int c = 0; c < nombres.length;c++) {
            System.out.println(nombres[c]);
        }

        //opcion 3
        for(String dato:nombres){

            System.out.println(dato);
        }

    }
}
