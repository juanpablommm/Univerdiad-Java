package api_collections2_ImplentacionsMaps;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapss {

    public static void main(String[] args) {
        /*
         * Los mapas permiten guardar por clave valor,
         * estos no extienden de la interfas Collection ya que
         * son bidimencionales, por su concepto de clave valor,
         * 
         * el LinkedHashMap permite maneter el orden de incersion 
         * de los elmentos
         * 
         * Admite calve null y valores null
         * 
         * extiende de la clase hashMap
         * 
         * aplicando nodos
         * donde cada elemento apunta al anterior y al siguuiente
         * 
         * no tiene una sincornizacion de subprocesos */
        
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        
        linkedHashMap.put(null, null);//admite null
        linkedHashMap.put(2, "juan");//agregpo un elemento
        linkedHashMap.put(0, "pablo");
        linkedHashMap.put(1, "carlos");
        linkedHashMap.put(5, "bravo");
        linkedHashMap.put(5, "ssbravo");//soobreescribe el elmetno anterior 
        System.out.println(linkedHashMap);
    }
}
