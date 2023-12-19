package org.example.Funciones;

public class ClaseString {
    public static void main(String[] args) {

        //METODOS DE string

        //charAt(x)
        String nombre = "Oregon";
        System.out.println(nombre.charAt(3));

        //length saber cantidad de caracters

        System.out.println(nombre.length());

        for (int i = 0; i < nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }

        //sustraer con substring

        System.out.println(nombre.substring(0,4));

        //convierte en minuscula

        System.out.println(nombre.toLowerCase());

        //mayuscola

        System.out.println(nombre.toUpperCase());

        nombre = "e d n a";
        System.out.println(nombre.replace(" ",""));

        System.out.println("hola".equals("hola"));


        //stringBuilder
        StringBuilder vacio = new StringBuilder();// objeto vacio que se puede agregar cadena de caracteres
        System.out.println(vacio);


        //append permite llevar el objeto
        vacio.append("Hola");
        vacio.append("Mundo");
        //se puede añadir toString muestra la informacion completa del objeto // sirve para clses onjetos o objetos
        System.out.println(vacio.toString());

    }
}
