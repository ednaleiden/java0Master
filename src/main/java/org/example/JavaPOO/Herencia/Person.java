package org.example.JavaPOO.Herencia;

public class Person {

    //protetec -- funcion igul que public --- sirve para la herencia para acceder de las subclases accediento a sus atriibutos y metodos

    protected String nombre;
    protected   char genero;
    protected  int edad;
    protected String direccion;


    //creamos 3 constructores
    public Person() {
    }

    public Person(String nombre) {
        this.nombre = nombre;
    }

    public Person(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }


    //GENERAMOS GETTER Y SETTER  para retorno
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //to sting pra ver estado del objeto


    @Override
    public String toString() {

        //string buildert
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}