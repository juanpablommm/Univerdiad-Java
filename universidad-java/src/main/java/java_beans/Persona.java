package java_beans;

import java.io.Serializable;

//debde de implementar la interface serializable de java.io
public class Persona implements Serializable {

    //para que una clase sea java beans los atributos deben de ser privados
    private String nombre;
    private String apellido;
    
    //debe de tener un contructor bacio, para que los frameworks constuyan
    //el objeto sin necesidad de pasar parametros para sus atributos
    public Persona() {
    }

    //el metodo con paramtros es opcional si se requiere
    public Persona(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //debe de tener establecidos lo getters y setters para cada atributo,
    //si el atributo es de solo lectura o escritura pude escluirse uno de estos
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

    //el metodo toString, equals y has code son opcinales 
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Persona [nombre=");
        builder.append(nombre);
        builder.append(", apellido=");
        builder.append(apellido);
        builder.append("]");
        return builder.toString();
    }
}
