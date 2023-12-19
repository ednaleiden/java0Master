package org.example.Funciones;

import java.util.Enumeration;

public class VariablesArgumentos {

    //VAMOS A DECIR QUE NECESITAMOS VARIABLES SIN INDICAR CUANTAS SE REALIZA DE LA SIGUIENTE MANERA

    public static void main(String[] args) {
        System.out.println(sumar(2,3,5));
    }

    static int sumar(int ... numeros){// lo va a recibir y se va a convertir en un arreglo --  para metros indefinidos
        int suma = 0;

        for(int num: numeros){
            suma+= num;
        }
        return suma;
    }
}
