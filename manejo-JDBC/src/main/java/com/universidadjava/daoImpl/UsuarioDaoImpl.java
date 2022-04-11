package com.universidadjava.daoImpl;

import com.universidadjava.dao.IUsuarioDao;
import com.universidadjava.domain.Usuario;

public class UsuarioDaoImpl extends BaseDaoJDBC<Usuario> implements IUsuarioDao{

    public UsuarioDaoImpl() {
        super("usuario", Usuario.class);
    }

}
