package org.example.Palindormo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("escribe una palabra palindroma");
        String palabra = leer.nextLine();

        if (Espalindromo(palabra)) {
            System.out.println("es palindromo");
        }else {
            System.out.println("no es palindromo");
        }
    }


    static boolean Espalindromo(String  palabra){

        palabra  = palabra.replace(" " , "");
        palabra = palabra.toLowerCase();

        StringBuilder palabraInvertida = new StringBuilder();

        for (int i=palabra.length()-1; i>=0; i--){

            palabraInvertida.append(palabra.charAt(i));

        }
        return palabra.equals(palabraInvertida.toString());
    }
}
