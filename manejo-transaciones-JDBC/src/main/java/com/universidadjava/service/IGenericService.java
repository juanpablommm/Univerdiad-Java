package com.universidadjava.service;

import java.sql.SQLException;
import java.util.List;

import com.google.protobuf.ServiceException;
import com.universidadjava.exceptions.GenericExeption;

public interface IGenericService<T> {

public abstract List<T> selecFindAll() throws SQLException, GenericExeption;
    
    public abstract T selecFindId(Long id) throws SQLException, GenericExeption;
    
    public abstract void update(Long id, T entity) throws SQLException, GenericExeption;
    
    public abstract void delete(Long id) throws SQLException, GenericExeption;
    
    public abstract void insert(T entity) throws SQLException, GenericExeption;
}
