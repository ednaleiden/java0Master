package org.example;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*int i = 0;
        while (i <=10){
            System.out.println("ejecuta el valor de i"+i);
            i++;
        }*/

        Scanner leer  = new Scanner(System.in);

        System.out.println("INGRESE UN NUMERO ENTERO: ");
        int N = leer.nextInt();

        int c = 0;

        while (c<= 10){

            System.out.printf("| %d x %d = %d |\n", N, c,(N*c));
            c ++;
        }
    }
}
