package org.example.Funciones;

public class FuncionesRecursivas {

    //son funciones que se ejecutan asi mismas

    public static void main(String[] args) {
    cuentaRegresiva(10);

        System.out.println(factorial(5));
    }

    static  int factorial(int numero){

        if (numero > 1){
            numero = numero * factorial(numero - 1 );
        }
        return numero;
    }

    public static void cuentaRegresiva(int numero){

        numero --;

        if (numero > 0){
            System.out.println(numero);
            cuentaRegresiva(numero);
        }else {
            System.out.println("llego hasta 0");
        }
    }
}
