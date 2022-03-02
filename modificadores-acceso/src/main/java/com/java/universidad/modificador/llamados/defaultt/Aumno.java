package com.java.universidad.modificador.llamados.defaultt;

import com.java.universidad.modificador.deafult.Persona;

public class Aumno extends Persona{

    private Integer idAlumno;
    private String carrera;
    public Aumno(String nombre, String persona, Integer edad, Integer idAlumno, String carrera) {
//        super(nombre, persona, edad);// no podemos utlizar el contructor con
//        modificador por defualt de una clase padre en una clase hija que se encuentre
//        en un package distinto
        super(nombre, carrera);//con un modificador public
        this.idAlumno = idAlumno;
        this.carrera = carrera;
    }
    public Integer getIdAlumno() {
        return idAlumno;
    }
    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
