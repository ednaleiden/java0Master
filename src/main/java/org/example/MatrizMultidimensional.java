package org.example;

public class MatrizMultidimensional {
    public static void main(String[] args) {
        int [][] x = new int[2][3];

        x[0][0]=1;
        x[0][1]=2;
        x[0][2]=3;

        x[1][0]=4;
        x[1][1]=5;
        x[1][2]=6;

        for (int[] Matriz : x){
            for (int datos:Matriz){
                System.out.println(datos);
            }
        }

        int[][] z ={
                {0,0,0,0,0,0,0},
                {1,2,3,4,5,6,7},
                {1,2,3,4,5,6,7,8},
        };

        for (int[] Matriz2 : z){
            for (int datos1:Matriz2){
                System.out.println(datos1);
            }
        }

        // un objeto para acceer al metodo
        //metodos static void
        //llamar






    }
}
