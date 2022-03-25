package api_collections2_ImplentacionsQueues;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListss {

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
         * LinkedList
         * El LinkedList a nivel de Queue es la misma que a novel de 
         * la interface List, lo unico es que mantiene los el,
         * elwmentos enlazados con una referencia al anterior 
         * y al siguiente y tiene el manejo de datos como tipo
         * una lista de tipo Cola, donde en primer elmento en dentrar
         * es el primero en salir, por lo que no podremos
         * sacar un dato que queramos con el metodo get() como funcionan
         * la LinkedList a nivel de la interfaz Lis o cualquier
         * otra de este esta intercafes List
         * 
         * Queue LinkedList admite datos null
         * admite duplicados */
        
        Queue<String> linkedListQueue = new LinkedList<String>();
        linkedListQueue.add("juan");//agrego elemento
        linkedListQueue.add("carlos");
        linkedListQueue.add("jnhoy");
        linkedListQueue.add("pablo");
        linkedListQueue.add("pablo");
        linkedListQueue.offer(null);//tambien se agrega un elemnto con offer
        
        System.out.println(linkedListQueue);
        linkedListQueue.remove("jnhoy");//elimamos un elemnto
        System.out.println(linkedListQueue);
        System.out.println("elemento primero en la cola = " + linkedListQueue.peek());//peek nos devuleve el elemento
//        de mayor prioridad en la cola, osea el primero en la cola
        
        System.out.println("elemento primero en la cola se elimnara = " + linkedListQueue.poll());
        //devuelve el peimer elemento en la cola y lo elimina
        
        System.out.println(linkedListQueue);
        
        
    }
}
