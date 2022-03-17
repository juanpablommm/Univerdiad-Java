package api_collections2_ImplentacionsLists;

import java.util.List;
import java.util.Vector;

public class Vactorss {

    public static void main(String[] args) {
        /**una list mantine el orden de insercion que agreguemos lo elemtos
         * pero podemos aceder a cualquier elmento de la fila, dado
         * que no se mantiene un orden de tipo FIFO, nosotros podemos
         * sacar cualquier elemento de ella sin importar si esta de primero
         * en la fila o no (metodo get()).
         * 
         * 
         * VECTOR
         * su funcionamiento es igual al del ArrayList pero
         * sus elementos estan sincronizados, es decir que estan
         * protegidos del acceso por otros hilos
         * 
         * por defecto su capcida es de 10 elementos por lo que al sobrepasarla 
         * se duplica esta cantida y esto lo hace mas lento*/
        
        List<String> vector = new Vector<String>();
        vector.add("juan");//agregamos elmento
        vector.add("pablo");
        vector.add("carlos");
        vector.add("jhony");
        vector.add(null);//admite datos nulos
        
        System.out.println(vector);
        vector.remove("carlos");//removemos
        System.out.println(vector);
        
        System.out.println("obtengo a cualquiera de la fila: " + vector.get(2));
    }
    
}
