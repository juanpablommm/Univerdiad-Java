package com.universidadjava.serviceImpl;

import java.sql.Connection;

import com.universidadjava.daoImpl.UsuarioDaoImpl;
import com.universidadjava.domain.Usuario;
import com.universidadjava.service.IUsuario;

public class UsuarioServiceImpl extends BaseService<Usuario> implements IUsuario{

    public UsuarioServiceImpl(Connection connection) {
        super(new UsuarioDaoImpl(connection));
    }

}
