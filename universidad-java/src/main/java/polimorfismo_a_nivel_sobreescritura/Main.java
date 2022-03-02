package polimorfismo_a_nivel_sobreescritura;

public class Main {

    public static void main(String[] args) {
        // POLIMORFISMO
        // teniendo en cuenta que el polimorfismo es el disinto comportamiento
//        que tienen un metodo en disitntas clases, ya sea que lo implemntemos
//        atraves de herencia por clases abstractatas o sobreescribiend el meotod, 
//        como tambien por implementar una interfaces
//        podresmos observar que el comportamiento que tenga un metodo en una clase
//        es disinto al de otra clase que tambien lo utlice

//        Por ejemplo creo un metodo statico en esta misma clase que reciba un objeto
//        de tipo empleado, ya que es la super clase, para que se pudeda pasar como 
//        parametro una objeto de esta clase o uno que herede de esta, y en el mando
//        a llamar el metodo descripcion que esta en la clase padre y en ella tiene su
//        propia implementacion, ya si el objeto que se pase por parametro es un hijo
//        de esta clase ese metodo implimir tendra otra implementacion, dada 
//        la sobreescritura que se aplico a ese metodo en la clase hija

        Empleado empleado = new Empleado("jhony", "el bravo", 34);
        ejecucionDescripcion(empleado);

        // dado que existe una linea de herencia entre la clase Empleado y Gerente
//        puedo logcamente declarar el tipo de mi objeto gerente como Empleado, dado
//        que esta es la clase padre, pero las instancia al ser de tipo Gerente
//        el objeto creado es de este tipo
        empleado = new Gerente("juancho", "roiz", 32, "devlopers");
        ejecucionDescripcion(empleado);
    }

    public static void ejecucionDescripcion(Empleado empleado) {
        System.out.println(empleado.descripcion());
    }
}
