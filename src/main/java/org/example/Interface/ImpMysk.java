package org.example.Interface;
// las interfaes es unico

// las clases abstractas son una super clase o clase padre este hereda delaclase objet
public class ImpMysk implements Interfaces{
    @Override
    public void insertar() {
        System.out.println("se inserto un dato");
    }

    @Override
    public void listar() {
        System.out.println("se listo un dato");
    }

    @Override
    public void actualizar() {
        System.out.println("se actualzo un dato");
    }

    @Override
    public void borrar() {
        System.out.println("se borro un dato");
    }
}
