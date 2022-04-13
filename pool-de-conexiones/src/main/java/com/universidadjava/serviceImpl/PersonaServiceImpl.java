package com.universidadjava.serviceImpl;


import java.sql.Connection;

import com.universidadjava.daoImpl.PersonaDaoImpl;
import com.universidadjava.domain.Persona;
import com.universidadjava.service.IPersonaService;

public class PersonaServiceImpl extends BaseService<Persona> implements IPersonaService {
    public PersonaServiceImpl(Connection connection) {
        super(new PersonaDaoImpl(connection));
    }
}
