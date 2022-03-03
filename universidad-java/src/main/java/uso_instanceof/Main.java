package uso_instanceof;

public class Main {

    public static void main(String[] args) {
        //INSTANCEOF
//        cave recordar que la palabra reservada instanceof nos sirve para
//        comprobar si una clase es de un tipo en especifico

        Empleado empleado = new Empleado("jhony", "el bravo", 34);
        ejecucionDescripcion(empleado);

        empleado = new Gerente("juancho", "roiz", 32, "devlopers");
        ejecucionDescripcion(empleado);
        System.out.println();
    }

    public static void ejecucionDescripcion(Empleado empleado) {
        
        //el instance of no mira el tipo de la varible object sino 
//        que mira la referecia del objecto a la que apunta esa varible
//        Empleado empleado2 = new Gerente();//instance of mira la instancia en si
//        en este caso Gerente
        
//      cuando estemos comparando variables objectos con inctance of, devemos
//      empezar a comparar desde la clase mas baja en la jerarquia de herencia,
//      dado que si empezamos por las clases padres, podemos no ellgar a evaluar la
//        condicion especifica en la que buscamos una clase hija, dado que la clase hija
//        al heredar de la padre tambien es de ese tipo por lo que instaceof no devolveria
//        true, cumpliendo la condicional y tal vez no llegando a la condicional
//        especifca en la que queriamos saber si es de un tipo de clase hija especifico
        

//        esto es errorneo para el caso en que se pase un objeto de una clase
//        hija dado que al estar la primera condicional evaluando a si de 
//        tipo de la superclase, logicmanete nos dara true y la segunda condicional
//        no se evaluara
//        if(empleado instanceof Empleado) {
//            System.out.println("Soy empleado");
//            empleado.hablar();
//        }else if(empleado instanceof Empleado){
//            System.out.println("soy Gerente");
//            ((Gerente) empleado).particular();
//        }
        
        if(empleado instanceof Gerente) {
            System.out.println("Soy gerente");
            ((Gerente) empleado).particular(); //depues de comprar si el objeto
//            pasado por parametro es de una clase hija, se nos obliga hacer un casting
//            a esa misma clase hija para poder utilizar sus metos particulares
        }else if(empleado instanceof Empleado){
            System.out.println("soy empleado");
            empleado.hablar();
        }
    }
}
