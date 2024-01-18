import org.example.JavaPOO.Herencia.Clientes;
import org.example.JavaPOO.Herencia.Empleados;
import org.example.JavaPOO.Herencia.Person;

import java.util.Date;

public class testHerencia {


    public static void main(String[] args) {
        Person person1 = new Person("John",'M',24, "call4");
        System.out.println(person1);

        Empleados empleado1 = new Empleados("John", 2000);
        System.out.println(empleado1);

        // conversion de objetos

        Empleados empleado2 = (Empleados) empleado1;
        empleado2.getSalrio();



        if (person1.equals(person1)){
            System.out.println("es igual");
        }

        var fecha = new Date();
        Clientes clientes = new Clientes("Edna",'F',18,"call",1,fecha,true);
        System.out.println(clientes);

        System.out.println( clientes.getClass());

        determinarTipoObjeto(empleado1);


            System.out.println(clientes.hashCode());
    }
    public static void determinarTipoObjeto(Object objet) {
        if (objet instanceof Empleados){
            System.out.println("es de tipo empleados");
        }else if (objet instanceof Clientes){
            System.out.println("es de tipo cliente");
        }else if (objet instanceof Person){
            System.out.println("es de tipo persona");
        }else if (objet instanceof Object) {
            System.out.println("es de tipo object");
        }
    }




    // trabajar con objetos o dos objetos comparandolo con equals-- retorna valor boleano

    //hashcode -- retorna un valor entero  -- realiza una operacion y devuelve un numero unico de un objeto
}
