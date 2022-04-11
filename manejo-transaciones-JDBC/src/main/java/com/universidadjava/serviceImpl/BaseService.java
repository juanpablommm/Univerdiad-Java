package com.universidadjava.serviceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.protobuf.ServiceException;
import com.universidadjava.dao.IGenericDao;
import com.universidadjava.domain.IEntity;
import com.universidadjava.exceptions.GenericExeption;
import com.universidadjava.service.IGenericService;

public class BaseService<T extends IEntity> implements IGenericService<T> {

    private IGenericDao<T> dao;

    public BaseService(IGenericDao<T> dao) {
        this.dao = dao;
    }

    @Override
    public List<T> selecFindAll() throws SQLException, GenericExeption{
        List<T> list = new ArrayList<>();
        list = dao.selecFindAll();
        return list;
    }

    @Override
    public T selecFindId(Long id) throws SQLException, GenericExeption{
        T entity = null;
        entity = dao.selecFindId(id);
        return entity;
    }

    @Override
    public void update(Long id, T entity) throws SQLException, GenericExeption{
        dao.update(id, entity);
    }

    @Override
    public void delete(Long id) throws SQLException, GenericExeption{
        dao.delete(id);
    }

    @Override
    public void insert(T entity) throws SQLException, GenericExeption{
        dao.insert(entity);
    }
}
