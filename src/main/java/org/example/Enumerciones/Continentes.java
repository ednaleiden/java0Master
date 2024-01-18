package org.example.Enumerciones;

public enum Continentes {
    AFRICA(54),
    EUROPA(50),
    ASIA(35);

    private final int paises;


    Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return this.paises;
    }
}
