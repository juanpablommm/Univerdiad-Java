package com.java.universidad.modificador.llamados.defaultt;

import com.java.universidad.modificador.deafult.Persona;

public class Llamados {

    public static void main(String[] args) {
        
        // DEFAULT O PACKAGE
//        Persona persona = new Persona("juan", "pablito", 32);//no esposible
//        acceder al constructor por default de un obejeto que se entuentre en 
//        distinto package
        
        Aumno alumno = new Aumno("juan", "pablo", 21, 10210, "ingenieria");
        //para poder crear es objeto toco modificar la clase padre con un contrcutor
//        public dado que como la clase hija se encuentra en distito package, no se
//        puede accder al un consturctor con modificador de acceso default, asi se
//        aplique la herencia
//        System.out.println(alumno.nombre); //no es posible acceder a un atributo
//        de la clase padre que sea default, mediante la clase hija si se encuentra
//        en disitnto package
       }
}
