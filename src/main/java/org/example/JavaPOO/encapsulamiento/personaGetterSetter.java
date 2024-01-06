package org.example.JavaPOO.encapsulamiento;

public class personaGetterSetter {
    private String nombre;
    private int edad;

    private boolean eliminado;

    //consdtructor


    public personaGetterSetter(String nombre, int edad, boolean eliminado) {
        this.nombre = nombre;
        this.edad = edad;
        this.eliminado = eliminado;
    }

    //trabajaremos en el encapsulamiento
    //para obtener el valor del atributo y modifiarlo


    //obtiene atrbuto
    public String getNombre() {
        return this.nombre;
    }
        // se ejecuta el metodo y modifica
    public void setNombe(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
       return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public boolean isEliminado(){
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }

    @Override //anotador permite modificar un metodo que ya esta implementado
    public String toString() {
        return  "Persona: [Nombre: %s, Edad: %d, Eliminado: %b ]".formatted(this.nombre,this.edad,this.eliminado); //mostraremos los estados actuales formateando  %s es para cadenaas de texto %d numeros enteros
    }
}
