package com.universidadjava.daoImpl;


import com.universidadjava.dao.IPersonaDao;
import com.universidadjava.domain.Persona;

public class PersonaDaoImpl extends BaseDaoJDBC<Persona> implements IPersonaDao {

    public PersonaDaoImpl() {
        super("persona", Persona.class);
    }

    /*
     * ACLARACION DE LOS EXECUTES
     * 
     * execute: el metodo execute nos devuelve un boolean y lo utilizamos en genral para cualquier sentencia sql
     * 
     * executeQuery: este nos retorna un Resultset, por ende lo tulizamos en especial para sentencias sql que nos puden devolver uno o mas valores como por ejemplo un SELECT
     * 
     * executeUpate: este metodo nos devuleve un entero relacionado con el recuento de filas en las sentencias de manipulacion de datos, esto solo recive sentencias DML (Data Manipulation Leguage) pero que no devulvan ningun valor como por jemplo insert, update y delete
     */
   
}
