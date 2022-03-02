package polimorfismo_a_nivel_sobreescritura;

public class Empleado {

    protected String nombre;
    protected String apellido;
    protected Integer edad;

    public Empleado(String nombre, String apellido, Integer edad) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    public String descripcion() {
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Edad: " + this.edad;
    }
}
