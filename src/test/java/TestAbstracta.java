import org.example.Abstractas.FiguraGeometrica;
import org.example.Abstractas.Rectangulo;

public class TestAbstracta {

    public static void main(String[] args) {
        FiguraGeometrica fgura = new Rectangulo("rectangulo1");
        System.out.println(fgura);

        fgura.dibujar();
    }
}
