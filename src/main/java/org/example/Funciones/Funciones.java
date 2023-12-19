package org.example.Funciones;

public class Funciones {
    public static void main(String[] args) {
    saludar();
    }

    //DEFINIR NUESTRA PROPIA FUNCION
    //void es que se va a ejecutar

    static void saludar(){
        System.out.println("hola mundo");

        //cuando se invoca una funcion y se le pasan datos se llama argumentos

        sumar(12,3);

        //guardamos una variable o lo pasamos directamente la funcion

        var sumar2 = sumardos(10,20);
        System.out.println("la sima de estos da:" + sumar2);
    }

    // cuando mandamos datos se le llaman argumentos
        //parametros es lo que se le pasa ejemplo suma(int a +  int b)
    static void sumar(int a, int b){

        //definicion de paramentros
        int suma = a + b;

        System.out.println("la sumna es: " + suma);

    }

    //funciones de retorno
    static  int sumardos(int c, int d){
        return c + d;
    }
}
