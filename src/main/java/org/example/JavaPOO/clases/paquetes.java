package org.example.JavaPOO.clases;

public class paquetes {

    //paquetes deben modularisarse es decir paquete usuario va tods las clases de usuario y demas

    public static class Persona {

        public String nombre;
        public int edad;

        //modificadores de aceso

        /**
         * public - para aceder a otras clases de otros paquetes
         * private no accede a otras clases si no a la misma
         *
         *
         * no solo se debe modificar la clase si no los metodos
         *
         * esto lo trabajamos en modularizacion
         *
         *
         *
         *
         */

        /// creamos un constructorsss
        /**
         * tiene el mismo nombnre de la clase se hace con el fin de marcar un mensaje
         *
         * podemos poner sobre carga de constructores que cada uno haga algo diferente , o que corran metodos antes de todo debe tener algo diferente ejemplo metodos (a,b)
         */

        public Persona(){
            System.out.println("creando un objeto");
        }

        public Persona(String nombre){
            System.out.println("hola"+ nombre + "desde el constructor");
        }



        //metodo
        public void mostrarDatos(){

            System.out.println("nombre:"+ nombre);
            System.out.println("edad:"+ edad);
        }
    }
}
