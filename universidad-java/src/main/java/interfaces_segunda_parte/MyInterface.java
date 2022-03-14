package interfaces_segunda_parte;

public interface MyInterface {

    /*
     *apartir de la jdk 8, java permite tener metodos predefinidos
     *y estaticos en las interfaces 
     *
     *Los metodos predefinidos son methodos definidos en una interface,
     *cuyo modificador de acceso es default,
     *la razon por la que se tienen metodos predefinidos es para poder
     *agregar metodos a un interface sin tener que modificar las clases
     *que la implementan, puesto que si se tienen muchas clases que 
     *implementan de una interface y necesitamos agreagar un metodo 
     *en esa interface tendriamos que ir a cada una a implementar ese
     *metodo para cada uno.
     *
     *Metodos staticos a nivel de interfaces, los metodos staticos a nivel
     *de interfaces son similares a los metodos predefinidos, pero con 
     *la diferencia que estos no pueden ser removidos de las clases que
     *implementan la interfaces, y a ligual que un metodo statico en una
     *clase lo llamariamos con el nombre de la interfaces en este caso.
     *Estos metodos quedan atados al contexto statico de igual manera que
     *al crearlos en las clases, por lo que todos los objetos creados a partir
     *de clases que implementan de la interface, compartiran este metodo
     *y su implemntacion que tenga en la interface
     **/
    
    //this is a default method
    default void metodoPredefinido() {
        System.out.println("This is a default method at interface 1");
    }
    
//    This is a static method
    public static void metodoStatico() {
        System.out.println("this is a static method at interface");
    }
    
//    this is a abstract method
    public void metodoAbtract();
}
