package org.example.ManejoErrores;

import java.util.InputMismatchException;

public class erroresManejoExcepciones {

    // errores que ocurre en -- tiempo de ejecucion y tiempo de compliacion
        // errrores en compilacon
    //error de sintaxis ,asignaciones incorretas,no seguir las reglas

      //excepcion  priblema que ocurre en ejeucon del programa
    // muestra el error y donde esta el priblema

    public static void main(String[] args) {

        //manejo de errores con try catch

        try {
            int resul = 4/-1;

            System.out.println(resul);

        } catch (InputMismatchException e){
            System.err.println("ocurrio un error solo dijite numeros enteros");;
        } catch (Exception e) { // exception es la clase padre
            System.err.println("ourrio un : ingrese un numero divisor mas grande que cero");
            e.printStackTrace(System.out);
        }finally { //cerar conexion de bases de datos con final
            System.out.println("se revision la ejecucion");// siempre saca esta informacion por default
        }

        //RuntimeException son errores NO manejados
        //IOException si son errores manejados

        //omputMismatchException _-- pones mal los datos

        //arrayIndexofBoundExceoption() -- itera mas ceves del array permitido

        //aritmeticalException -- poner un dato divido con cero


        //NullPointerException   --ocurren con frecuencia al tratar de añadir un ítem a una colección (lista, conjunto, etc.) sin haber inicializado explícitamente esa colección

        //podemos crear excepciones propias

        //FileNotFoundException // error en archivos


        int a = 0;
    }




    static int dividir(int a, int b) throws OperadorException {

    if(a == 0){
        throw new OperadorException("dividire entre cero");
    }
    return a/b;
    }



}
