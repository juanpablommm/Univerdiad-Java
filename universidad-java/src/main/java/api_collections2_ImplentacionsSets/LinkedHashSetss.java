package api_collections2_ImplentacionsSets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetss {

    public static void main(String[] args) {
        /*
         * El LinkedHashSet nos permite tener un orden de los elmentos
         * de acorde a su incercion a diferecnia de un hasSeht
         * 
         * PEro este sera mas lento dado a que tiene un doble indice
         * en cada uno de us elmentos apuntado al el,ento aneterior 
         * y al siguiente
         * 
         * permite elementos null
         * 
         * al igual que las demas coleccions con una lista doble gasta mas
         * recursos de la CPU, por lo que se recomienda la utilizacion de 
         * las implemntaciones mas genericas de cada colecion como el hashSet
         * el HashMap ArrayList LinkedList(queue)
         * 
         * no permite sacar un elemento con el metodo get()*/
        
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        
        linkedHashSet.add("juan");//agregamos un elemento
        linkedHashSet.add("jhony");
        linkedHashSet.add("pablo");
        linkedHashSet.add("carlos");
        linkedHashSet.add("carlos");//sobreescribe el elmetno carlos anteritor
        System.out.println(linkedHashSet);
        linkedHashSet.remove("juan");//elimino un elmento
        System.out.println(linkedHashSet);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
        
        
        
    }
}
