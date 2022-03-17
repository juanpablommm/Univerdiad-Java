package api_collections2_ImplentacionsMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapss {
    public static void main(String[] args) {
           /*
            * Los mapas permiten guardar por clave valor,
            * estos no extienden de la interfas Collection ya que
            * son bidimencionales, por su concepto de clave valor,
            * 
            * 
            * el hashmap atmite un null como clave
            * estos no guardan el orden de incercion de los elementos
            * 
            * admite valores duplicadps pero no claves duplicadas
            * no tiene un orden
            * 
            * hashMap no esta sincronizados para subprocesos
            * */
        
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put(null, null);
        hashMap.put("null", 1);//agrego un elemento
        hashMap.put("s", 9);
        hashMap.put("a", 2);
        hashMap.put("b", 3);
        System.out.println(hashMap);
        hashMap.remove(null);//elimino un elemento
        System.out.println(hashMap);
        System.out.println(hashMap.get("b"));//traigo un elemento
        
        Set<String> claves = hashMap.keySet();//obetengo un set con todas
        //las claves del mapa
        claves.forEach(c -> System.out.print(c + ","));
        
        
        System.out.println("\nvalues:");
        Collection<Integer> values = hashMap.values();//devuleve una
        //collections con los valores del mapa
        values.forEach(v -> System.out.print(v + ", "));
        
        System.out.println("\ncalves valor");
        //obtengo un set de Entry con todas las claves y valores
        for(Entry<String, Integer> keyValue: hashMap.entrySet()) {
//            una vez obtenido el cada entry del Set obtengo clave y valor
            System.out.println("Clave: " + keyValue.getKey() + " " + keyValue.getValue());
        }
    }
}
