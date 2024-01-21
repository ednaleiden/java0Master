import org.example.Interface.ImpMysk;
import org.example.Interface.Interfaces;

public class TestInfercas {

    public static void main(String[] args) {

        //no se puede crear un objeto directamente

        //se implementa es la interfaz de la siguiente manera

        Interfaces datos = new ImpMysk();

        //ahora llamamos los metodos
        datos.actualizar();
       
    }
}
