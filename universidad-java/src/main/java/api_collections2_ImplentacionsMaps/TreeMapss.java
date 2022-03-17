package api_collections2_ImplentacionsMaps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapss {

    public static void main(String[] args) {
        /*
         * Los mapas permiten guardar por clave valor,
         * estos no extienden de la interfas Collection ya que
         * son bidimencionales, por su concepto de clave valor,
         * 
         * El TreeMap no admite claves null
         * no esa sincronizado para subprocesos
         * 
         * ordena los elementos de manera acendente
         * */
        
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
//        treeMap.put(null, null);//no admite null
        treeMap.put(2, "juan");//agregpo un elemento
        treeMap.put(0, "pablo");
        treeMap.put(1, "carlos");
        treeMap.put(5, "bravo");
        treeMap.put(5, "ssbravo");//soobreescribe el elmetno anterior 
        System.out.println(treeMap);
    }
}
