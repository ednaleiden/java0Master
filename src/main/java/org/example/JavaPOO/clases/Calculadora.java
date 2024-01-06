package org.example.JavaPOO.clases;

public class Calculadora {

    /**
     * atributos y metodos estaticos
     */

    public static final double PI = 3.1516;

    //statiic sirve para no crear un objeto si no enviarlo directamente a donde vamos a llamarlo o utilizarlo en este ejemplo en el mains
    public static int sumar(int a , int b){
        return a + b;
    }

    //sobre carga de metodos
    public static double sumar(double a , double b){
        return a + b;
    }

    public  int restar(int a , int b){
        return a - b;
    }

    //sobre carga de metodos
    public  double restar(double a , double b){
        return a - b;
    }
}
