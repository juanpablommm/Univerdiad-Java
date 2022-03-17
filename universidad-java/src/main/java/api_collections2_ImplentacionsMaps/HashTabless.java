package api_collections2_ImplentacionsMaps;

import java.util.Hashtable;
import java.util.Map;

public class HashTabless {

    public static void main(String[] args) {
        /*
         * Los mapas permiten guardar por clave valor,
         * estos no extienden de la interfas Collection ya que
         * son bidimencionales, por su concepto de clave valor,
         * 
         * El HashTable no permite ni una clave y ni un valor null
         * 
         *esta sincronizado para subprocesos siendo seguro para los hilos
         *
         *Es mas lento que el hashMap
         * 
         * ordena los elmentos en forma decendente
         * */
        
        Map<Integer, String> hashTable = new Hashtable<Integer, String>();
        
        hashTable.put(2, "juan");//agregpo un elemento
        hashTable.put(0, "pablo");
        hashTable.put(1, "carlos");
        hashTable.put(5, "bravo");
        hashTable.put(5, "ssbravo");//soobreescribe el elmetno anterior 
        System.out.println(hashTable);
//        hashTable.put(null, null);//no admite el null
    }
}
