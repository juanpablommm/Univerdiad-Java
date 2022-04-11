package com.universidadjava.dao;

import com.universidadjava.domain.Persona;

public interface IPersonaDao extends IGenericDao<Persona>{

    /*Mediante esta interface declaramos los metodos en particular
     * que tenga la tabla persona si necesitamos, metodos que no serna
     * genericos para las demas tablas de la db, solo para Personas, }
     * y es por eso
     * que hacemos que estienda de la interface
     * que tiene los metodos crud bases,para quien implemente esta
     * interface IPersona pueda implementar los metodos de la interface
     * generica mas los metodos en particular de esta interface*/
}
