package upcasting_downcasting;

public class Escritor extends Empleado {

    private TipoEscritura tipoEscritura;

    public Escritor(String nombre, String apellido, Integer edad, TipoEscritura tipoEscritura) {
        super(nombre, apellido, edad);
        this.tipoEscritura = tipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public void setTipoEscritura(TipoEscritura tipoEscritura) {
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override
    public String descripcion() {
    return super.descripcion() + ", tipo de escritura: " + this.tipoEscritura.getTiposEscritura();
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Escritor [tipoEscritura=");
        builder.append(tipoEscritura.getTiposEscritura());
        builder.append("]");
        builder.append(super.toString());
        return builder.toString();
    }
}
