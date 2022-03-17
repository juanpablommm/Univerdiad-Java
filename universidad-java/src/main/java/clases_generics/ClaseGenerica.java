package clases_generics;

//se define una clase generica con el operador dimanete <>
public class ClaseGenerica<T> {

    /*los tipos de datos generics, nos sriven para no especificar
     * el tipo de dato con el que vamos a trabajar, solamente cuando
     * mandemos a llamar esta ya especificamos con que tipo de dato
     * vamos a trabajar
     * 
     * a la hora de utilizar tipos generic no podemos una vez llamemos
     * la clases pasar un tipo int al generic dado que solo funciona
     * con varibles objeto, para eso tendriamos que utilizar un wrapper
     * 
     * se trbaja con un tipo de interface y se le pasa como valor un obejto
     * de alguna de las clases que la implemente
     * 
     * Las letras varian en regular dependiendo del tipo:
     * 
     * T es utilizadas cuando el tipo Generic sera un clase
     * K se utiliza para indicar una clave, como lo hace el Map
     * V para el valor en de una clave en el Map
     * E se utiliza en las collections para indicar un elmento
     * N se utiliza para numeros*/
    
    
//    se define un atributo generico del tipo que recibe la clase
    private T objeto;

//    por medio del contructor de la clase inicializamos nuestro generic
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    public void llamar() {
        System.out.println("El tipo generic es de tipo: " + objeto.getClass().getSimpleName());
    }
}
