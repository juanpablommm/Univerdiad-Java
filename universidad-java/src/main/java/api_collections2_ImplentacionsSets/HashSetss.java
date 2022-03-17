package api_collections2_ImplentacionsSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetss {

    public static void main(String[] args) {
        /*
         * Los set no noadmiten tener
         * datos duplicados, por lo que al agregar un nuevo elmento
         * con el mismo valor lo unico que psara es que sopbrescribira
         * el anterior con el nuevo valor proporcionado
         * 
         * 
         * 
         * Los hasShet en su interior utilizan un hashMap en el contructor
         * para asegurarse que no allan elmentos repetidos
         * 
         * Con los hashSets no tenemos un orden de insercion de como agregamos
         * cada elmento dado que estos utilizan el hasCode para compara si
         * existe otro elmento igual en la colecion
         * 
         * permite datos null*/
        
        Set<String> hashset = new HashSet<String>();
        hashset.add("juan");//agregamos un elmento
        hashset.add("pablo");
        hashset.add("carlos");
        hashset.add("ronaldo");
        hashset.add(null);
        hashset.add("juan");//reescribe el elento anterior con es valor
        System.out.println(hashset);
        hashset.remove("juan");//elimina el elmeto
        System.out.println(hashset);
        
        
    }
}
