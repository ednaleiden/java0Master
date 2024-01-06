package org.example.JavaPOO;

import org.example.JavaPOO.clases.Calculadora;
import org.example.JavaPOO.clases.Rectangulo;
import org.example.JavaPOO.clases.paquetes;

public class Modularidad {
    /*+
        podemos

        retutilizar
        evitar colapsos
        legebilidad
        solucion rapida de problemas
        mantenible

      Modularidad consiste en :
        dividir el programa en partes por modulos o clases

        separar as clses en archivos paquetes


     */
    final int a = 10;
    

    public static void main(String[] args) {


        //instanciar el objeto es decir la clse person

        paquetes.Persona person1 = new paquetes.Persona();

        person1.nombre = "Edna";
        person1.edad = 25;
        //mostramos los datos de la clase
        person1.mostrarDatos();

        paquetes.Persona person2 = new paquetes.Persona("Itza");
        person2.nombre = "Itza";
        person2.edad = 23;

        person2.mostrarDatos();

        System.out.println(Calculadora.PI);

        //puedo acceder y modificarlo

        System.out.println(Calculadora.PI);

        System.out.println(Calculadora.sumar(40,50));


        //constantes su valor inicial no se modifiaa luego

        // se hace con la instruccion final ejemplo como es la clase calculadora

        int c = 1;
        c = 3;

        Calculadora calcular = new Calculadora();
        System.out.println(calcular.restar(50,30));

        Rectangulo r1 = new Rectangulo();

        System.out.println(r1.area(3,1));

    }
}
