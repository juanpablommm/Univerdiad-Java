package interfaces_segunda_parte;

public class Example implements MyInterface, MyInterface2 {

    @Override
    public void metodoAbtract() {
        System.out.println("this is a abstract method implement in the daughter class");
    }

    /*para poder hacer uso de dos interfaces que tienen un metodo predefinido
     * con el mismo nombre, necesitaremos sobreescribir el comportamiento de uno 
     * de estos dos metodos, de esta manera ya no nos arrojara error, y podremos
     * utilizar ambos*/
    @Override
    public void metodoPredefinido() {
        MyInterface2.super.metodoPredefinido();//para llamar a un metodo}
//        predefinido de una interface, sin la creacion de un objeto de la 
//        clase que la implementa, necesitamos utilizar el nombre de la interfas
//        mas la palabra super y el metodo predefinido
    }
}
