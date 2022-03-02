package com.java.universidad.modificador.llamados;

import com.java.universidad.modificador.protecte.Persona;

public class AlumnoLLamados extends Persona{

    private Integer idMatricula;
    private String carrera;
    
   
    public AlumnoLLamados(String nombre, String apellido, Integer edad, Integer idMatricula, String carrera) {
        super(nombre, apellido, edad);
        this.idMatricula = idMatricula;
        this.carrera = carrera;
    }
    

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Alumno [idMatricula=");
        builder.append(idMatricula);
        builder.append(", carrera=");
        builder.append(carrera);
        builder.append("]");
        builder.append(super.toString());
        return builder.toString();
    }
}
