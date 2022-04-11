package com.universidadjava.domain;

public class Persona implements IEntity{
    
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private Long telefono;
    private String direccion;
    
    public Persona() {
        super();
    }

    public Persona(String nombre, String apellido, String email, Long telefono, String direccion) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public Persona(Long idPersona, String nombre, String apellido, String email, Long telefono, String direccion) {
        super();
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Persona [idPersona=");
        builder.append(idPersona);
        builder.append(", nombre=");
        builder.append(nombre);
        builder.append(", apellido=");
        builder.append(apellido);
        builder.append(", email=");
        builder.append(email);
        builder.append(", telefono=");
        builder.append(telefono);
        builder.append(", direccion=");
        builder.append(direccion);
        builder.append("]");
        return builder.toString();
    }
}
