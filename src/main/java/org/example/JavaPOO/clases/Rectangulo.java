package org.example.JavaPOO.clases;

public class Rectangulo {

    public int base;
    public int altura;

    public Rectangulo(){
        System.out.println(base);
        System.out.println(altura);
    }

    //variables loales solo sirven para ese metodo
    /*public int area(int b, int c){
        base = b;
        altura = c;
        return base * altura;
    }

    //
    public int perimetro(int b, int c){
        base = b;
        altura = c;
        return 2*(base + altura);

    }*/


    // tiene defecto se se debe uitilizar this para utilizar la variable del objeto se refiere al atributo de la clase de la siguiente manera

//se debe asignar a los atributos del rectangulo para que tome los atributos de la clase
    public int area(int base, int altura){
        this.base = base;
        this.altura = altura;
        return this.base * this.altura;
    }

    //
    public int perimetro(int base, int altura){
        this.base = base;
        this.altura = altura;
        return 2*(this.base + this.altura);

    }
}
