package interfaces;

public interface IAccesoDatos {

     int MAX_REGRISTORS = 10;//al definir atrbutos en una interface,
//    automaticamente se comviertene en contantes, asi no especifiquemos que son
//    final static, porque los unicos atributos que abmiten las interfaces
//    son constantes y tienen que ser por obligacion public
    
     void insertar();//los metodos que definamos en una interfaces como solo los 
//    creamos pero las implemntacion la hacen las clases que implemnten de esta inteface,
//    algo parecido a las clases abstractas, entonces los metodos por defecto son 
//    public abstrac 
    
    void listar();
    
    void actualizar();
    
    void elimnar();
    
}
