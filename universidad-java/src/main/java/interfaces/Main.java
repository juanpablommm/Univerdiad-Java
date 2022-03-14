package interfaces;

public class Main {

    public static void main(String[] args) {
//        IAccesoDatos datos = new IAccesoDatos(); al igla que las clases
//        abstractas no podemos realizar la instancia de una
        
        IAccesoDatos mysql = new ImplementacionMySQL();
        mysql.actualizar();
        
        IAccesoDatos oracle = new ImplementacionOracle();
        oracle.actualizar();
        
//        *Cuando utilizar interfaces o classes abstractas?
//        las interfaces las utilizamos cuando tenes una gerarquia
//        de clases en las qu lo que se tiene en comun son sus comportamientos
//        es decir lo metodos, en ese caso utilizamos interfaces, dado que las 
//        interfaces son un contrato en el que se definen metodos pero no se implemntan
//        de eso se encararan las clases hijas.
//        *las clases abtractas las utilizamos cuando tenemos una gerarquiq de clases
//        en las que lo que se tienen en comun son las caracteristicas, es decir los
//        atributos, y tambien si tienen uno pocos metodos en comun que necesiten 
//        ser definidos como abstractos
    }
}
