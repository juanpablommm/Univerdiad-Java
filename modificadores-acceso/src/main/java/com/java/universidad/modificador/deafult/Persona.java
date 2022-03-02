package com.java.universidad.modificador.deafult;

public class Persona {

    //DEFUAL O PACKAGE
//    El modificador de acceso por deafult o package
//    tiene un grado mas de restricion a diferecncia de protected,
//    con el modificador por default todos los atributos y metodos 
//    de una clase podran ser accedidas desde una clase externa pero 
//    siempre y cuando se mantengan el mismo package, al igual que emplear herencia 
//    con uan clase que tenga este tipo de modificadores nos permitira, que la subclase
//    pueda acceder a todos los atibutos y metodos, y desde un obeto creado a partir de 
//    una subclase llamado desde una clase del mismo package acceder a los atibutos
//    por dedaful de la clase padre, a trabjes del objeto de la hija, pero si 
//    intentamos este mismo proceso en una clase de package diferente no se podra
//    realizar esto
    
    String nombre;
    String apelldo;
    Integer edad;
    
    
    Persona(String nombre, String apellido, Integer edad) {
        super();
        this.nombre = nombre;
        this.apelldo = apellido;
        this.edad = edad;
    }

    
    //contrcutor publico para poder acceder a el desde una clase hija 
//    en distinto package, dado que con el constuctor por default o pakage no
//    se puede acceder a el
    public Persona(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apelldo = apellido;
    }

    String getNombre() {
        return nombre;
    }


    void setNombre(String nombre) {
        this.nombre = nombre;
    }


    String getPersona() {
        return apelldo;
    }


    void setPersona(String persona) {
        this.apelldo = persona;
    }


    Integer getEdad() {
        return edad;
    }


    void setEdad(Integer edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Persona [nombre=");
        builder.append(nombre);
        builder.append(", persona=");
        builder.append(apelldo);
        builder.append(", edad=");
        builder.append(edad);
        builder.append("]");
        return builder.toString();
    }
    
    
}
