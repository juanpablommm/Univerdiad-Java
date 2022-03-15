package api_collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        /*
         * SETS Con los set no se garantiza que se mantenga
         *  el orden en que se van agregando los elementos 
         *  pero como no se no guarda un orden de insercion 
         *  es mucho mas rapido que una lista. 
         *  Los set no admiten duplicados a diferencia de las listas,
         *   si se agrega un elemto ya ecistente lo que hace es
         * sobreescribirlos
         */

        Set<String> set = new HashSet<String>();
        set.add("Lunes");//añado
        set.add("Martes");
        set.add("Miercoles");
        set.add("Jueves");
        set.add("Viernes");
        Sets.imprimir(set);
        set.remove("Jueves");//remuevo
        Sets.imprimir(set);
        System.out.println(set.isEmpty());//esta vacia?
        System.out.println(set.size());// tamaño
        /*el set vat muy ligado a la collection por lo que no nos ofrece
         * muchas variaciones */
    }

    public static void imprimir(Set<?> sets) {
        System.out.println("-------------");
        Iterator<?> iterator = sets.iterator();// un set no lo puedo recorrer
//        de aletante y a ttras al mismo tiempo como el List
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println("");
    }

}
