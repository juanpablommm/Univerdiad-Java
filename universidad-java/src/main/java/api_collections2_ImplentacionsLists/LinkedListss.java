package api_collections2_ImplentacionsLists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListss {

    public static void main(String[] args) {
        /*
         * *una list mantine el orden de insercion que agreguemos lo elemtos
         * pero podemos aceder a cualquier elmento de la fila, dado
         * que no se mantiene un orden de tipo FIFO, nosotros podemos
         * sacar cualquier elemento de ella sin importar si esta de primero
         * en la fila o no (metodo get()).
         * 
         * LinkedList
         * su funcionamiento es igual al ArrayList
         * pero con la diferencia de que todos sus elementos estan unidos 
         * a una seria de nodos, apuntando al proximo elemento y al 
         * elemnto anterior
         * 
         * VENTAJAS
         * ES muy rapido a la hora de elimnar dado su enlace de nodos
         * el listIterator para recorrerla asi atras y adelante
         * 
         * DESVENTAJAS
         * Es muy lenta a la hora de rrecorer datos dados su enlace de nodos*/
    
        List<String> linkedList = new LinkedList<>();
        linkedList.add("juan");//agreagamos un elmento
        linkedList.add("carlos");
        linkedList.add("pablo");
        linkedList.add("jhony");
        linkedList.add(null);//admiten nulos
        
        
        System.out.println(linkedList);
        System.out.println("elimnado");
        linkedList.remove("juan");//elimnaod
        System.out.println(linkedList);
        
        System.out.println("obtenemos a cualquiera de la fila: " + linkedList.get(2));
        
        
    }
}
