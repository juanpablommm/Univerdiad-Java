package com.universidadjava.serviceImpl;

import com.universidadjava.daoImpl.UsuarioDaoImpl;
import com.universidadjava.domain.Usuario;
import com.universidadjava.service.IUsuario;

public class UsuarioServiceImpl extends BaseService<Usuario> implements IUsuario{

    public UsuarioServiceImpl() {
        super(new UsuarioDaoImpl());
    }

}
