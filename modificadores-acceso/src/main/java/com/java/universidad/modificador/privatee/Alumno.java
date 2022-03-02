package com.java.universidad.modificador.privatee;

public class Alumno extends Persona{

    private Integer idAlumno;
    private String carrera;
    
    
    public Alumno(String nombre, String apellido, Integer edad, Integer idAlumno, String carrera) {
        super(nombre, apellido, edad);//estamos llamado al contrcutor publico que 
//        se crero que la clase padre
        this.idAlumno = idAlumno;
        this.carrera = carrera;
    }

    //no podemos aplicar sobreescritura del metodo hablar de la clase padre
//    por lo que es privado, este metodo es completamente diferente al de la clase 
//    padre a pesar que se llaman igual, no es el mismo, no permite la soobreescrituta.
//    Y tampoco podemos llamar al metodo hablar de la clase padre por ser privado
    public void hablar() {
//        super.hablar();//no es visble, es privado por lo que no se pude llamar
        System.out.println("hola, como estas?");
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
