package sobreescritura;

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
    
    //para aplicar la sobrees escritura de un metodo o Overrride, va ligado a
//    la herencia, puesto que tiene que exister un metodo en una clase padre y que
//    una clase hija herede de esta para poder utilizar o sobreescribir el comportamiento
//    del metodo, de esta manera soobrescribimos el un comportamiento completamente distinto
//    para cada clase que herede de la clase padre
    @Override
    public String descripcion() {
        return super.descripcion() + ", departamento: " + this.departamento;//llamamos al mismo metodo
//        que estamos sobreescribiendo pero el de la clase padre, por lo cual tramenos la implemtacion
//        que esta en la super clase, pero concatenada con un strgin y el atributo departamento
//        propio de esta clase hija
    }
    
//    Al aplicar el Override, podemos cambiar el modificador de acceso a con menos restricion o mas
//    visible, pero no se pude realizar a uno mas restrictivo o si el modificador de accesos del metodo
//    de la clase padre es private ya no podremos cambiarlo por unro menos restrictivo
//    *Metodo clase padre default ---------- override clase hija protected o public
//    *Metodo clase padre protected -------- override clase hija public
}
