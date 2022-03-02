package com.java.universidad.modificador.deafult;

public class Llamados {

    public static void main(String[] args) {

        //DEFAUL O PACKAGE
        Persona persona = new Persona("juan", "pablito", 32);
        System.out.println(persona.nombre);//dado que estamos en el mismo package
//        podemos acceder alos atirbutos de un objeto que sean por deaful
        
        Aumno alumno = new Aumno("pablitos", "el pablosky", 32, 1213, "ingenieria");
        System.out.println(alumno.apelldo);//al igual que como fuese la clase padre
//        de un objeto de la clase hija podemos accder a un atributo o metodo de la 
//        clase padre que este como default, desde otra clase que se encuntre en el mismo
//        package
        
    }

}
