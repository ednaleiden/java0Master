package org.example;

import java.util.Scanner;

public class EsVocal {
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);

        System.out.println("INGRESE UNA LETRAS: ");
        String c = leer.nextLine();

        if (c == "a" || c == "A") {
            System.out.printf("%s es Vocal: ",c);
        }else if (c == "e" || c == "E") {
            System.out.printf("%s es Vocal: ",c);
        }else if (c == "i" || c == "I") {
            System.out.printf("%s es Vocal: ",c);
        }else if (c == "o" || c == "O") {
            System.out.printf("%s es Vocal: ",c);
        }else if (c == "u" || c == "U") {
            System.out.printf("%s es Vocal: ",c);
        }else {
            System.out.println("no es una vocal");
        }
    }
}
