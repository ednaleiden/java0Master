package org.example.conversonMoneda;

import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        EXTERNA:
        while (true){
            System.out.println("CONVERSON DE MONEDA");
            System.out.println("1 - pesos colombianos a dolares \n"
                    + "2 - pesos mexicanos a dolares \n"
                    + "3 - pesos peruanos a dolares \n"
                    +"4. salir");

            System.out.println("INGRESA UNA OPCION: ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);

            //multiples copndiciones

            switch (opcion) {
                case '1':
                    convertir(5.000,"pesos colombianos");
                    break;
                case '2':
                    convertir(100.15,"pesos mexicanos");
                    break;
                case '3':
                    convertir(2.09,"pesos peruanos");
                    break;
                case '4':
                    System.out.println("cerrando programa");
                    break EXTERNA;
                    default:
                        System.out.println("opcion incorrecta");
            }
        }
    }

    static void convertir(double valorDolar,String Pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad del pais %s: ", Pais);
        double cantidadMoneda = leer.nextDouble();

        double dolares = cantidadMoneda / valorDolar;

        dolares =((double) Math.round(dolares *100)/100);

        System.out.println("tienes $"+dolares+" Dolares");
    }
}
