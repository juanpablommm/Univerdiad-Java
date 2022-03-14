package java_beans;

public class Main {

    public static void main(String[] args) {
        /*
         * JAVA BEANS
         * 
         * el concepto de java beans es basica meente que una clase
         * debe de implementar la interface serializable, del paquete
         * java.io para el caso
         * de que se requiera pasar la clase por una red, esta interfaces 
         * lo que hara es combertir a la clases en bits, (0, 1), para poder 
         * ser enviada a la otra parte, posteriormente se aplica el proceso
         * inverso conocido como deserializable ques convertir eso bits
         * en el obejto nuevamente
         * 
         * debde de tener todos sus metodos con modificadores de asseco privados
         * aplicando correctamente el concepto de encasulamiento, para que solo
         * se aceda a estos con sus respectivos metodos seters y getters, tambien
         * debe de tener un constuctor vacio para que los framewors puedan contruir 
         * objetos de estas clases sin tener que pasar datos por parametros*/
     
          Persona persona = new Persona();
          persona.setNombre("juancho");
          persona.setApellido("roiz");
          
          System.out.println(persona);
    }
}
