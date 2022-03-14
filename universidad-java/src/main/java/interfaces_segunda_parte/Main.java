package interfaces_segunda_parte;

public class Main {

    public static void main(String[] args) {
        MyInterface object1 = new Example();
        object1.metodoAbtract();
        object1.metodoPredefinido();
        MyInterface.metodoStatico();
        
        //metodos predefinidos con el mismo nombre en interfaces
//        distintas
        object1.metodoPredefinido();// se llama al metodo predefindo
//        sobreescrito de la ineterfaces que se le hizo, y como ambas
//        interfaces tienen este metodo, solo se tomara la implemtacion
//        que se realizo al sobreescribirlo
        
    }
}
