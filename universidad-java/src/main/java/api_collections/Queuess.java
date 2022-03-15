package api_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queuess {

    public static void main(String[] args) {
        /*
         * QUEUE
         * Esta interfaces esta creada para mantener la cracteristicas
         * de la Cola de los datos,
         * siguiendo el patron FIFO(firts in -Firts out), primer elemento
         * en dentrar primer elmento en salir
         * 
         * Se caractirza por mantener el orden de inrsercion de los lementos*/
        
        Queue<String> queue = new LinkedList<String>();
        queue.add("Juan");//agrego
        queue.add("carlos");
        queue.add("jhony");
        System.out.println(queue);
        Queuess.imprimir(queue);
        
        System.out.println(queue.size());//tamaño
        System.out.println(queue.isEmpty());//esta vacia
        System.out.println(queue.contains("Juan"));//contiene b?
        System.out.println(queue.element());//imprime el primer elemento en salir
        queue.remove("Juan");
        System.out.println(queue.element());
        
    }
    
    public static void imprimir(Queue<?> queue) {
        System.out.println(".------------------");
       Iterator<?> iterator = queue.iterator();
       while(iterator.hasNext()) {
           System.out.println(iterator.next());
       }
       System.out.println("");
    }
}
