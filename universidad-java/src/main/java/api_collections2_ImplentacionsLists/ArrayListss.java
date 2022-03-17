package api_collections2_ImplentacionsLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListss {

    public static void main(String[] args) {
        
        /*una list mantine el orden de insercion que agreguemos lo elemtos
         * pero podemos aceder a cualquier elmento de la fila, dado
         * que no se mantiene un orden de tipo FIFO, nosotros podemos
         * sacar cualquier elemento de ella sin importar si esta de primero
         * en la fila o no (metodo get()).
         * 
         * permite duplicados en los elementos
         * 
         * EL ArrayList se convierte en una mejora del Array tradicional
         * ya que crece con frome se añaden elmentos y no ahy que indicar
         * su tamaño inicial
         * 
         * VENTAJAS
         * su tiempo de acceso a un elmento es minimo
         * el listIterator para recorrerla asi atras y adelante
         * 
         * DESVENTAJAS
         * cuan eliminamos un elemento es bastante lento dado que tiene
         * que mover a cada elemento una pocicio para restaurar el odrden
         * */
        
        List<String> arrayList = new ArrayList<String>();
        arrayList.add(null);//admite nulos
        arrayList.add("Juan");//agregamos un elemento
        arrayList.add("pablo");
        arrayList.add("carlos");
        arrayList.add("jhony");
        arrayList.forEach(System.out::println);
        //eliminar
        System.out.println("Eliminado");
        arrayList.remove(0);//eliminamos por index o por elemento
        arrayList.forEach(System.out::println);
        
        System.out.println(arrayList.get(2));//acedemos a cualquier elemento
//        de la fila sin importar el orden dado que no us lista FIFO
        
    }
}
