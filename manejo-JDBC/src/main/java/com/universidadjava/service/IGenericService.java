package com.universidadjava.service;

import java.util.List;

import com.google.protobuf.ServiceException;

public interface IGenericService<T> {

    public abstract List<T> selecFindAll() throws ServiceException;

    public abstract T selecFindId(Long id) throws ServiceException;

    public abstract void update(Long id, T entity) throws ServiceException;

    public abstract void delete(Long id) throws ServiceException;

    public abstract void insert(T entity) throws ServiceException;
}
