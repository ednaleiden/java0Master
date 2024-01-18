package org.example.JavaPOO.Herencia;

public class Empleados extends Person{ //extends hereda

    //se hereda si pasa lo distinto que falta

    private  int idEmpleado;
    private double salrio;

    private  static int contadorEmpleado;

    public Empleados(int idEmpleado, double salrio) {
        this.idEmpleado = idEmpleado;
        this.salrio = salrio;
    }

    public Empleados(String nombre, int idEmpleado, double salrio) {
        super(nombre);
        this.idEmpleado = idEmpleado;
        this.salrio = salrio;
    }

    public Empleados(String nombre,double salrio) {
        super(nombre);
        this.idEmpleado = ++Empleados.contadorEmpleado;
        this.salrio = salrio;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }


    public double getSalrio() {
        return this.salrio;
    }

    public void setSalrio(double salrio) {
        this.salrio = salrio;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "idEmpleado=" + this.idEmpleado +
                ", salrio=" + this.salrio +
                ", sueldo=" + super.toString() +
                '}';
    }
}
