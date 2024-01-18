import org.example.Enumerciones.Continentes;
import org.example.Enumerciones.Dias;

public class TestEnumerciones {


    public static void main(String[] args) {
        System.out.println(Dias.DOMINGO);

        System.out.println(Continentes.AFRICA.getPaises());


        Continentes continentes = Continentes.ASIA;
        System.out.println(continentes.getPaises());
    }
}
