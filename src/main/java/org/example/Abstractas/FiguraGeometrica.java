package org.example.Abstractas;

public abstract  class FiguraGeometrica {

    //nopodemos de clses abstractas utiliar directamente el objeto
    //no se puede utiliar metedos directos si no heredados de subclases

    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }

    public abstract void dibujar();


    public String getTipoFigura() {
        return this.tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "tipoFigura='" + tipoFigura + '\'' +
                '}';
    }
}
