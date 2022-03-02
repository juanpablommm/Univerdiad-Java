package com.java.universidad.modificador.llamados;

import com.java.universidad.modificador.protecte.Alumno;

import com.java.universidad.modificador.protecte.Persona;


import com.java.universidad.modificador.llamados.AlumnoLLamados;
public class Llamados {

    public static void main(String[] args) {

//        PROTECTED
//        Persona persona = new Persona(); //no podemos acceder a un constructor protecte
//        desde una clase que se encuentre en distinto paquete

        Persona persona = new Persona("juancho");// modificador de acceso publico
//        persona.nombre //tambo es posible acceder a un atributos o metodo con modificador
//        de acceso protexted

        // se crea una objeto alumno el cual estiende de persona
        AlumnoLLamados alumno = new AlumnoLLamados("juan", "juninho", 23, 8120912, "ingenieria");
//        alumno.nombre; //apesar que alumno extiende de persona no se pude usar
//        este atributo dado que es protecte, y seguimos en un package diferente
        System.out.println(alumno);

//        pero si creamos un objeto de alumno que esta en el mismo package asi
//        herede de persona no podemos acceder a los atributos tipo protecte
//        daado que seguimos en un package distinto
        AlumnoLLamados alumnoLlamados = new AlumnoLLamados("alumnos", "de bs2", 12, 1213, "ingenieria");
        System.out.println(alumnoLlamados);
        System.out.println(alumnoLlamados);
    }
}
