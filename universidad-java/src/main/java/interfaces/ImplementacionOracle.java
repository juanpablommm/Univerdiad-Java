package interfaces;

public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("INSERTAR DESDE ORACLE");
    }

    @Override
    public void listar() {
        System.out.println("LISTAR DESDE ORACLE");
    }

    @Override
    public void actualizar() {
        System.out.println("ACTUALIZAR DESDE ORACLE");
    }

    @Override
    public void elimnar() {
        System.out.println("ELIMINAR DESDE ORACLE");
    }

}
