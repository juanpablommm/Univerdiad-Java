package api_collections2_ImplentacionsQueues;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriortyQueuess {

    public static void main(String[] args) {
        /*
         * Los Queue son collections para el manejo de datos como tipo
         * cola, con el diseño FIFO donde el primer elmento en dentrar 
         * es el primer elmento en salir. simulando una cola para unbanco
         * por ejemplo, donde solo podemos aceder al elemento de mayor pririodad
         * es decir al que este de primero en al fila.
         * por lo que no tenemos un un metodo get() para aceder a cualquier elmento
         * como en una lista o set, puesto que debemos respetar la prioridad FIFO
         * 
         * PriortyQueue
         * permite establecer prioridades en lo elmentos de una colecion
         * en funcion de una regla de comparacion que se halla indicado
         * 
         * manteniendose en la interface Queue devido a que proporciona metos 
         * muy utiles para el manejo de colas de los elmentos
         * 
         * Es una lista de tipo Cola pero y tambien el primero en dentrar es
         * el primero en salir, pero con la diferencia de que los elmentos 
         * dentra en el orden de prioridad que tienen de una forma acendente.
         * Por lo que no se mantrenda el orden de incersion que nosotros le demos
         * sino que este orden se tomara de acorde a la priorida del elemento*/
    
      
        Queue<String> priortyQueue = new PriorityQueue<String>();
        
//        priortyQueue.add(null);//el priorityQueue no admite datos null
        priortyQueue.offer("juan");//agreagmos un elemento
        priortyQueue.offer("pablo");
        priortyQueue.offer("carlos");//debido a la priorida sera el primero en la Cola
        priortyQueue.offer("jhony");
        System.out.println(priortyQueue);
        priortyQueue.remove("pablo");//elimanos un elemento 
        System.out.println(priortyQueue);
        System.out.println(priortyQueue.peek());//devuelve el elmento de mayor prioridad el primero 
        //en la lista 
        
        System.out.println(priortyQueue.poll());//devuelve el elemento de maayor prioridad
        //y lo elimina
        System.out.println(priortyQueue);
       System.out.println(priortyQueue.element());
    }
}
