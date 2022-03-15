package api_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listas {
    public static void main(String[] args) {
        /*
         *LISTAS
         *
         *las listas admiten elementos duplicados, a diferencia de los sets
         *y guardan el orden en que los elementos fueron a gregados
         *
         *al guardar los elementos por orden, es mas lenta que un sets*/
        
        List<String> lista = new ArrayList<String>();
        
        lista.add("Juan");//como extiende de collections utiliza el mismo metodo para agregar
        lista.add("Jhony");
        lista.add("ronaldo");
        
        Listas.imprimir(lista);
//        lista.forEach(nombre -> System.out.print(nombre + ", "));
        System.out.println("\n=========================");
        
        lista.remove("Juan");//remover un elemento de la lista tanto po index como por nobjeto
        System.out.println("elmento elimnado");
        imprimir(lista);
        
        System.out.println("\n----------------\n"
                + "se cambio a juan");
        lista.set(0, "Juninho Fernambucano");//permite cambiar un lemento de aorde a su index
        imprimir(lista);
        
        String nombre = lista.get(0);//permite obtner un lemento de acorde a su index
        System.out.println("\n-------\n obtubimos a "+ nombre);
        
        lista.clear();//limpia la lista visto antes en la collectionsss
        System.out.println(lista);
    }
    
    public static void imprimir(List<?> list) {
        //la interfaces listIterator es similar a la iterator
//        dado que extiende de ella, pero nos brinda la posibilidad
//        de recorrer una lista hacia adelante y hacia atras
        ListIterator<?> listIterator = list.listIterator();
        System.out.println("recorrido acia delante");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + ", ");
        }
        System.out.println("\n_____________________"
                + "\nrecorrdio hacia atras");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + ", ");
        }
    }
}
