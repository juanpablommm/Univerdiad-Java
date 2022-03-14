package manejo_exceptiones;

public class AritmeticaConUnchecked {

    public static void main(String[] args) {

        AritmeticaConUnchecked.division(10, 0);
        //al metodo tener una exceptions de tipos unchecked
//        no es necesario controlarla dentro del try-catch o
//        a nivel del metoo que lo llama
    }
    
    public static int division(int numerador, int denominador){
        
        /*ahora controlare la division por cero con una exceptions 
         * de tipo unchecke que se creo, 
         * para esto ya no es necesario especificarle al metodo que va 
         * lanzar una excetions de mi tipo, dado ques unchecked*/
        if(denominador == 0){
            throw new OperacionRunTimeException("Error, division entre cero");
        }
        return numerador/denominador;
    }
}
