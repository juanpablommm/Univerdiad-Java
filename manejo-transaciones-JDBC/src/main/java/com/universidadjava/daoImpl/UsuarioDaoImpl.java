package com.universidadjava.daoImpl;

import java.sql.Connection;

import com.universidadjava.dao.IUsuarioDao;
import com.universidadjava.domain.Usuario;

public class UsuarioDaoImpl extends BaseDaoJDBC<Usuario> implements IUsuarioDao{

    public UsuarioDaoImpl(Connection connection) {
        super("usuario", Usuario.class, connection);
    }

}
