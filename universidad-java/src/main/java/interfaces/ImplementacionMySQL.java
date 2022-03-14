package interfaces;

//sino queremos implmentar los metos de una interfaces
//en una clase que la implemente entonces la declaramos como
//hastracta, y la clase que erede de esta clase abstracta
//si tendra que implementar los metods de la interface, mas los
//metodos abstractos que tenga la clase actracta.

//Tambien si utilizamos una interfaces que herede de otra o otras,
//dado que con interfaces si se puede tener una herencia multiple, 
//no nos obligara a implemntar estos metodos dado que estamos en una interfaces
//y estas solo declaran metodos mas no llos implementan, asi sea
//que esten heredando de otra

public class ImplementacionMySQL implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("INSERTAR DESDE MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("LISTAR DESDE MYSQL");
    }

    @Override
    public void actualizar() {
        System.out.println("ACTUALIZAR DESDE MYSQL");
    }

    @Override
    public void elimnar() {
        System.out.println("ELIMNAR DESDE MYSQL");
    }

}
