package manejo_exceptiones;

public class Aritmetica {

    public static void main(String[] args) {
        
        
        int i = 0;
        try {
            i = Aritmetica.division(10, 0);
            
            /*en el caso qeu queramos lanzar mas de una exceptions
             * podemos utlizar mas de una sentencia catch o separarla con un |
             * en uno solo, siempre debe de ir la excetiopn de menor gerarquia
             * para poder que valla tomando cada uno en especifico, al igual
             * que al utlizar una condiconal para comparar en la herencia y hacer
             * el casteo*/
        }catch (OperacionExceptions e) {
            e.printStackTrace();
           //podemos obtener le mensaje
           //concreto de error de la exceptions
            System.out.println(e.getMessage());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("se reviso la division por cero");
        }
        System.out.println(i);
    }
    public static int division(int numerador, int denominador) throws OperacionExceptions {
        /*
         * establecemos una condicional para vereficar si el denominador
        es iguala cero lanzar nuestra propia exceptions, para lo cual
        hacemos uno se la palabra throw (lanzar en ingles) y la instancea
        de nuestra clase que creamos para la exception, con nuestro mensaje de
        error para controlar esta exception, al realizar esto devemos indicar
        al metodo que podra arrojar una exception del tipo que creamos,
        con la labra throws, de esta manera obligamos a controlar el metodo
        cuando lo llamen dado que podra lanzar una exception*/
        if(denominador == 0){
            throw new OperacionExceptions("Error, division entre cero");
        }
        return numerador/denominador;
    }
}
