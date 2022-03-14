package manejo_exceptiones;

public class Basico {

    /*
     * EXCEPTIONS
     * Son cituaciones no esperadas en la ejecucion del programa,
     * argumento valido o nop, conversion incompatible, concecion a la db
     * etc.
     * 
     * la Api de java cuenta con muchos tipos de exepciones para controlar
     * los problemas que surgan, pero si no exite una qeu se adecude a nuestras
     * necesidades podemos crearla de acorde a como lo nesecitemos.
     * 
     * Todas las  exceptions decienden de la clase Throwable pero en general
     * se manejan dos tipos de exceptions:
     * 
     * EXCEPTIONS CHECkED, son exceptions que decienden de la clase Exceptions
     * y que occuren en tiempo de compilacion, por lo que nos obligara a controlarlas
     * ya sea dentro de un bloque try-catch o lanzadolas a nivel del metodo
     * por ejemplo SQLException cuando algo sale mal con la conexion a la bd
     * 
     * EXCEPTIONS UNCHECKED, son exceptions que dedienden de la clase RuntimeException
     * son exceptions que ocurren a nivel de ejeucion, por lo que no se nos pedira que sean
     * controladas con un bloque try-cathc o a nivel del metodo, esto es opcional.
     * por ejemplo NullPointerException cuando intentamos aceder a un objeto null
     * 
     * */
    
    public static void main(String[] args) {
        // ejemplo basico de exceptions uncheked, division por cero
        //java.lang.ArithmeticException
        int i = 0;
//        i = 10/0; arrojara una exceptions en tiempo de ejcucion, 
//        informandonos que no se pude dividir por cero, rompeindonos el programa y finalizando todo
//        pero podemos acomodar esta exceptions en un bloque try-catch para que el 
//       programa sepa como reacionar
        try {
            i = 10/0;
        } catch (Exception e) {
            System.out.println("no es posible dividir por cero");
            e.printStackTrace(System.out);
            /*el StackTrace (traza de la pila de errores) es el conjutno
             * de mensajes de error desde el origen hasta la ultima clase 
             * que recibe el error, por ende lo imprimimos con el metodo
             * prinStackTrace(), apreciendonos en rojo el error, pero si queremos
             * imprimirlo de manera normal en consola podemos pasarle como
             * parametros a este meoto System.out*/
        }
        System.out.println(i);
    }
}
