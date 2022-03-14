package interfaces_segunda_parte;

public interface MyInterface2 {

    /*
     * en el caso que tengas dos metodos predefinidos con el mismo
     *  nombre en disitntas interfaces, y exista una clase que 
     *  implemente ambas interfaces, estos nos arrogaria un error, si
     *  tratamos de hacer al llamdo de este metodo, dado que ambas 
     *  interfaces lo tienen por lo que la JVM no sabri a cual llamar.
     *  */
    
    default void metodoPredefinido() {
        System.out.println("This is a default method at interface 2");
    }
}
