package org.example.JavaPOO.Herencia;

import java.util.Date;

public class Clientes extends  Person{
    private int idCliente;
    private Date fechaRegistro;
    private  boolean vip;
    private static int contadorCliente;


    public Clientes(String nombre, char genero, int edad, String direccion, int idCliente, Date fechaRegistro, boolean vip) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Clientes.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }



    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip +
                ", datos clientes=" + super.toString() +
                '}';
    }
}
