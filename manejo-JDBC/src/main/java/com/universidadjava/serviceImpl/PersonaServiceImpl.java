package com.universidadjava.serviceImpl;

import com.universidadjava.daoImpl.PersonaDaoImpl;
import com.universidadjava.domain.Persona;
import com.universidadjava.service.IPersonaService;

public class PersonaServiceImpl extends BaseService<Persona> implements IPersonaService {
    public PersonaServiceImpl() {
        super(new PersonaDaoImpl());
    }
}
