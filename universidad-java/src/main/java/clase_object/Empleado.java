package clase_object;

import java.util.Objects;

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
    
    public void hablar() {
        System.out.println("hi, how are you?");
    }

    //el metodo hashCode tiene como finalidad generar un valor entero
//    con los valores de los atributos de la manera mas unica posible
    @Override
    public int hashCode() {
        return Objects.hash(apellido, edad, nombre);
    }

    //atraves del metodo equals podemos comprobar si dos objectos son
//    iguales pero por su contenido y por su referencia, devolviendonos un boolean,
//    la primera comprobacion es por referencia de memoria, depues compara si el obejto
//    que se pasa por referencia en este metodo es igual a null, de ser asi nos devolvera
//    false, la tercera comprobacion es atravez de los class de cada clase para saber si son
//    distintos devuleve null, ya que serian dos objetos de distintas clases, y la ultima
//    comprobacion se realiza para los atributos de los objetos, si tiene el mismo contenido
//    entonces seran iguales
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        return Objects.equals(apellido, other.apellido) && Objects.equals(edad, other.edad) && Objects.equals(nombre, other.nombre);
    }
}
