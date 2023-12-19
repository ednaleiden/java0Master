package org.example.Funciones;

public class SobrecargaFunciones {

    //funcion para suma de decimales
    // funciones con el mismo nombre pero operan los mismos datos

    public static void main(String[] args) {
        System.out.println(sumar(45,15));

        System.out.println(sumar(10.23,13.50));

        System.out.println(sumar(10.23,10) );

    }
    static int sumar(int a , int b){
        return a+b;
    }
    static double sumar(double a , double b){
        return a+b;
    }
}
