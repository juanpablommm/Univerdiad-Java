package upcasting_downcasting;

public class Gerente extends Empleado{

    private String departamento;

    public Gerente(String nombre, String apellido, Integer edad, String departamento) {
        super(nombre, apellido, edad);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }   
    
    @Override
    public String descripcion() {
        return super.descripcion() + ", departamento: " + this.departamento;//llamamos al mismo metodo
    }
    
    public void particular() {
        System.out.println("Soy el particular de gerente");
    }
}
