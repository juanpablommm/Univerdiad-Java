package com.java.universidad.modificador.privatee;

public class Persona {

    
    //PRIVATE
//    Con el modificador de accesos private no, se tendra acceso a ningun atributo
//    ni metodo de esta clases desde otra en la que creemos un objeto,
//    dado que solo se podra utlizar desde la misma clase que los contiene;
//    es decir los atributos y metodos private o constructores tambien, solo
//    se acceden desde la misma clases
    private String nombre;
    private String apellido;
    private Integer edad;
    
    
    
    public Persona(String nombre, String apellido, Integer edad) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    private Persona() {
        this.nombre = "Juan";
        
    }
    
    private void hablar() {
        System.out.println("hi, how are you?");
    }
    
}
