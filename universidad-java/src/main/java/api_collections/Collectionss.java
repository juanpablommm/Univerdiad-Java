package api_collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Collectionss {

    public static void main(String[] args) {
        /*
         * Collections
         * de la interface se despreden las tres interfaces 
         * para menejo de objetos
         * como son Lis, Set, Queue*
         *
         *defino un set de tipo collections para utilizar los metodos
         *genericos que comparten*/
        Collection<String> collection = new HashSet<String>();
        
        collection.add("Juan");//agregar un elemento
        collection.add("Carlos");
        collection.add("jhony");
        Collectionss.imprimir(collection);
        
        collection.remove("Carlos");//elimino un elemento
        System.out.println("\n-------------------------");
        Collectionss.imprimir(collection);
        
        System.out.println(collection.size());//tamño de la collections
        
        collection.clear();//limpa la collction, elimna todos lo elemntos
        System.out.println(collection.size());
        
        boolean vacia = collection.isEmpty(); //compara si la colecion esta vacioa, true o false
        System.out.println(vacia);
        
        boolean ahy = collection.contains("Carlos");// compara si exite un elemento true o false
        System.out.println(ahy);
        
        
    }
    
    public static void imprimir(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
            
        }
    } 
}
