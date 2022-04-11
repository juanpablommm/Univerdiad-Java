package com.universidadjava.domain;

public class Usuario implements IEntity{

    private Long idUsuario;
    private String usuario;
    private String password;
    
    public Usuario() {
        super();
    }

    public Usuario(String usuario, String password) {
        super();
        this.usuario = usuario;
        this.password = password;
    }

    public Usuario(Long idUsuario, String usuario, String password) {
        super();
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Usuario [idUsuario=");
        builder.append(idUsuario);
        builder.append(", usuario=");
        builder.append(usuario);
        builder.append(", password=");
        builder.append(password);
        builder.append("]");
        return builder.toString();
    }
}
