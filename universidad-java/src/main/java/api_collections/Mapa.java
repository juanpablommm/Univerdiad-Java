package api_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapa {

    public static void main(String[] args) {
        /*
         * MAPAS
         * Los mapas no ereda de la interfaces Collections, dado que es bidimensional.
         * Se maneja el concepto de clave valor
         * donde la cave debe de ser unica o se sobreescribira el dato
         * anetrior con esa clave
         * .
         * los mapas como las listas y los queue guardan los datos en su
         * orden de insercion
         * */
        
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Juan");// se añade un elmento con put
        map.put(2, "Jnohy");
        map.put(3, "Carlos");
        
        System.out.println(map);

        System.out.println(map.get(2));//obtenemos un obejto asociado a esa clave
        
        System.out.println("\n--------------\nclaves");
        map.keySet().forEach(clave -> System.out.println(clave));//con keySet obtengo un set
        //de las claves en el mapa
        
        System.out.println("\n-------------- \nvalores");
        map.values().forEach(registro -> System.out.println(registro));//con el values
        //obtengo una collections de todos lo valores del mapa
        
        System.out.println("\n-------------\nclave y valor");
        Set<Entry<Integer, String>> setClaveValor = map.entrySet();//me devuleve
        //un set de Entry de la clave y valor de cual se definio el mapa
        //con el que puedo consegir ambos pares clave y valor
        setClaveValor.forEach(set -> System.out.println(set));
        
    }
}
