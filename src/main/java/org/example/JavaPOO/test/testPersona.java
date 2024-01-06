package org.example.JavaPOO.test;

import org.example.JavaPOO.encapsulamiento.personaGetterSetter;

import javax.sql.XADataSource;

public class testPersona {
    public static void main(String[] args) {

        personaGetterSetter persona1 = new personaGetterSetter("itza",23,false) ;
        //para acceder a sus metodos provados debe hacer se con get ejemplo getNombre
        System.out.println(persona1.getNombre());

        //vamos a modificar para hacerlo se hae con set ejemplo

        persona1.setNombe("Edna");
        System.out.println(persona1.getNombre());

        //SOBRE ESCRIBIR METODOS QUE VIENEN COMO OBJET SON HERENCIAS DE UNA LASE SUPER ES DEIR

        //SI QUEREMOS VER UE TIENE PERSONA 1 HARIAMOS

        String estado = persona1.toString();//guardar els estado del objeto
        System.out.println(estado);

        System.out.println(persona1); //aca no nos va mostrr l informacion si no la posicioon en memoria

        //para esto debemnos implementar metodo toString en personas

    }
}
