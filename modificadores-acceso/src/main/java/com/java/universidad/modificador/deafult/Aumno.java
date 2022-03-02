package com.java.universidad.modificador.deafult;

public class Aumno extends Persona{

    private Integer idAlumno;
    private String carrera;
    public Aumno(String nombre, String persona, Integer edad, Integer idAlumno, String carrera) {
        super(nombre, persona, edad);
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
