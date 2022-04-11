package com.universidadjava.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.ServiceException;
import com.universidadjava.dao.IGenericDao;
import com.universidadjava.domain.IEntity;
import com.universidadjava.exceptions.GenericExeption;
import com.universidadjava.service.IGenericService;

public class BaseService<T extends IEntity> implements IGenericService<T>{

    private IGenericDao<T> dao;

    public BaseService(IGenericDao<T> dao) {
        this.dao = dao;
    }

    @Override
    public List<T> selecFindAll() throws ServiceException {
        List<T> list = new ArrayList<>();
        try {
            list = dao.selecFindAll();
        } catch (GenericExeption e) {
            throw new ServiceException("Error!! al consultar los datos ", e);
        }
        return list;
    }

    @Override
    public T selecFindId(Long id) throws ServiceException {
        T entity = null;
        try {
            entity = dao.selecFindId(id);
        } catch (GenericExeption e) {
            throw new ServiceException("Error!! al no se puede consultar el registro con id " + id, e);
        }
        return entity;
    }

    @Override
    public void update(Long id, T entity) throws ServiceException {
        try {
            dao.update(id, entity);
        } catch (GenericExeption e) {
            throw new ServiceException("Error!! no se pude actulizar el registro con id " + id, e);
        }
    }

    @Override
    public void delete(Long id) throws ServiceException {
        try {
            dao.delete(id);
        } catch (GenericExeption e) {
            throw new ServiceException("Error!! no se pude eliminar el registro con id " + id, e);
        }
    }

    @Override
    public void insert(T entity) throws ServiceException {
        try {
            dao.insert(entity);
        } catch (GenericExeption e) {
            throw new ServiceException("Error!! no se pude registrar " + entity, e);
        }
    }
}
