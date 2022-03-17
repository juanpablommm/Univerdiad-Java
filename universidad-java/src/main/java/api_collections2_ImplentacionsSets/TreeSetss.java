package api_collections2_ImplentacionsSets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetss {

    public static void main(String[] args) {
        /*
         * El TreeSet mantiene todos sus elmentos ordenados de
         * acorde al orden natural
         * o de acorde a el odrden de incersion establecido por un
         * comparador al pasarselo por el constrcutor
         * */
        
        //como los String tiene implementado compareblo los ordena 
        //alfabeticamente
        Set<String> treeset = new TreeSet<String>();
        treeset.add("juan");
        treeset.add("carlos");
        treeset.add("bravo");
        treeset.add("pablo");
//        treeset.add(null);//no admiten null
        System.out.println(treeset);
        
//        como Integer tambien implementa compareble ordena
//        los numero de manera acendente
        Set<Integer> setNumeros = new TreeSet<Integer>();
        setNumeros.add(1);
        setNumeros.add(3);
        setNumeros.add(2);
//        setNumeros.add(null);//no admite null
        System.out.println(setNumeros);;
    }
}
