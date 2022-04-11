package com.universidadjava.dao;

import java.util.List;

import com.universidadjava.exceptions.GenericExeption;

public interface IGenericDao<T> {

    /*Al crear una interfaces generica que contenga todos los metodos
     * crud basicos podemos implementarlos en cada uno de los dao
     * para las operaciones de las entidades que repsentan una tabla 
     * en la db, sin tner que estarlos declarando en cada una, 
     * y llevandolo un paso mas adelante se crea una interface para
     * cada dado y esta extendera de esta misma interface IgenericDao
     * para pase los metodos a ella y en la interface de cada dado
     * se agregaran los metodos que son particulares de cada tbala
     * de ser requeridos en el sistema, y ya la calse que implemnte
     * estas interfaces dado tendra que implementar todos los metodos
     * crud mas los particulares, pero incluyendo esto podemos llevarlo 
     * a algo mas generico en lo que no tengamos que repetir codigo en
     * la implemntacion de cada metodo de crud, y es creando una clase que lo
     * haga de manera generica para cada clase dao, sin tner que estar repitiendo
     * codigo*/
    
    public abstract List<T> selecFindAll() throws GenericExeption;
    
    public abstract T selecFindId(Long id) throws GenericExeption;
    
    public abstract void update(Long id, T entity) throws GenericExeption;
    
    public abstract void delete(Long id) throws GenericExeption;
    
    public abstract void insert(T entity) throws GenericExeption;
}
