package Bloqueodigo;

public class PERSONA {

    private final int idPersona;
    private static int contadosPersona;

    public int getIdPersona(int idPersona) {
        return idPersona;
    }

    // inicializar  un odigo deatributosestaticos
    static {
        System.out.println("ejecucion bloque estatico");
        ++PERSONA.contadosPersona;
        // this.idPersona; -- nose puede hacer
    }

    {

        System.out.println("ejecucion bloque de odigo");
        this.idPersona = PERSONA.contadosPersona++;
    }

    public PERSONA(){
        System.out.println("ejeucucion de constructor");
    }

    @Override
    public String toString() {
        return "PERSONA{" +
                "idPersona=" + idPersona +
                '}';
    }
}
