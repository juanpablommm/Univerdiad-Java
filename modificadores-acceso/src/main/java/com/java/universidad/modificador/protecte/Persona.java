package com.java.universidad.modificador.protecte;

public class Persona {
    
    //El modificador de acceso PROTECTE
//    se aplicac tanto para:
//    *Metodos, *Atributos, *Constuctores
//    pero no se aplicac para la clase
    
    protected String nombre;
    protected String apellido;
    protected Integer edad;
    
    
    protected Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    

    public Persona(String nombre) {
        this.nombre = nombre;
    }



    protected String getNombre() {
        return nombre;
    }


    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }


    protected String getApellido() {
        return apellido;
    }


    protected void setApellido(String apellido) {
        this.apellido = apellido;
    }


    protected Integer getEdad() {
        return edad;
    }


    protected void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Persona [nombre=");
        builder.append(nombre);
        builder.append(", apellido=");
        builder.append(apellido);
        builder.append(", edad=");
        builder.append(edad);
        builder.append("]");
        return builder.toString();
    }
}
