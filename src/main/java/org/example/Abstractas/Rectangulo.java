package org.example.Abstractas;

public class Rectangulo extends FiguraGeometrica {

    //constructor que va a la clase abstracta figura
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("dibujando un rectangulo" + " , " + getClass().getSimpleName());
    }

    //este hereda de l clase abstracta
}
