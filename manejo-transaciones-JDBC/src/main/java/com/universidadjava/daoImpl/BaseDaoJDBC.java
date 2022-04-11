package com.universidadjava.daoImpl;

import static com.universidadjava.conexion.ConexcionJDBC.getConnection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.universidadjava.dao.IGenericDao;
import com.universidadjava.dao.utils.DaoJDBUtils;
import com.universidadjava.domain.IEntity;
import com.universidadjava.domain.Persona;
import com.universidadjava.exceptions.GenericExeption;

public class BaseDaoJDBC<T extends IEntity> implements IGenericDao<T> {

    private String tabla;
    private Class<T> clase;
    private Connection connectionTransacional;

    public BaseDaoJDBC(String tabla, Class<T> clase, Connection connection) {
        this.tabla = tabla;
        this.clase = clase;
        this.connectionTransacional = connection;
    }

    @Override
    public List<T> selecFindAll() throws SQLException, GenericExeption {
        String sql = "SELECT *FROM " + tabla;
        List<T> listaPersona = new ArrayList<>();
        Connection connection = null;
        PreparedStatement prepared = null;
        ResultSet resultSet = null;
        try {
            connection = (this.connectionTransacional != null) ? this.connectionTransacional : getConnection();
            prepared = connection.prepareStatement(sql);
            resultSet = prepared.executeQuery();
            listaPersona = (List<T>) DaoJDBUtils.getEntity(clase, resultSet);
        } finally {
            resultSet.close();
            prepared.close();
            if (this.connectionTransacional == null) {
                connection.close();
            }
        }
        return listaPersona;
    }

    @Override
    public T selecFindId(Long id) throws GenericExeption, SQLException {
        T entity = null;
        if (id != null) {
            String sql = "SELECT *FROM " + tabla + " WHERE " + this.getinformationDB().get(1) + "=" + id;
            Connection connection = null;
            PreparedStatement prepared = null;
            ResultSet resultSet = null;
            try {
                connection = (this.connectionTransacional != null) ? this.connectionTransacional : getConnection();
                prepared = connection.prepareStatement(sql);
                resultSet = prepared.executeQuery();
                List<T> list = (List<T>) DaoJDBUtils.getEntity(clase, resultSet);
                entity = (!list.isEmpty()) ? list.get(0) : null;
            } finally {
                resultSet.close();
                prepared.close();
                if (this.connectionTransacional == null) {
                    connection.close();
                }
            }
        }
        return entity;
    }

    @Override
    public void update(Long id, IEntity entity) throws GenericExeption, SQLException {
        if (id != null && entity != null) {
            String sql = "UPDATE " + tabla + " SET ";
            Map<Integer, String> data = this.getinformationDB();
            for (int i = 2; i <= data.size(); i++) {
                if (i != data.size()) {
                    sql += data.get(i) + " = ?, ";
                } else {
                    sql += data.get(i) + " = ? WHERE " + data.get(1) + "=" + id;
                }
            }
            Connection connection = null;
            PreparedStatement prepared = null;
//            ResultSet resultSet = null;
            try {
                connection = (this.connectionTransacional != null) ? this.connectionTransacional : getConnection();
                prepared = connection.prepareStatement(sql);
                DaoJDBUtils.setEntity(prepared, entity, data);
                prepared.executeUpdate();
            }finally {
//                resultSet.close();
                prepared.close();
                if (this.connectionTransacional == null) {
                    connection.close();
                }
            }
        }
    }

    @Override
    public void delete(Long id) throws GenericExeption, SQLException {
        if (id != null) {
            String sql = "DELETE FROM " + tabla + " WHERE " + this.getinformationDB().get(1) + "=" + id;
            Connection connection = null;
            PreparedStatement prepared = null;
//            ResultSet resultSet = null;
            try {
                connection = (this.connectionTransacional != null) ? this.connectionTransacional : getConnection();
                prepared = connection.prepareStatement(sql);
                prepared.executeUpdate();
            }finally {
//                resultSet.close();
                prepared.close();
                if (this.connectionTransacional == null) {
                    connection.close();
                } 
            }
        } 
    }

    @Override
    public void insert(IEntity entity) throws GenericExeption, SQLException {
        if (entity != null) {
            String sqlColumns = "INSERT INTO " + tabla + "(";
            String sqlValues = ")VALUES(";
            Map<Integer, String> meta = this.getinformationDB();
            for (int i = 2; i <= meta.size(); i++) {
                if (i != meta.size()) {
                    sqlColumns += meta.get(i) + ", ";
                    sqlValues += "?, ";
                } else {
                    sqlColumns += meta.get(i);
                    sqlValues += "?)";
                }
            }
            Connection connection = null;
            PreparedStatement prepared = null;
//            ResultSet resultSet = null;
            try {
                connection = (this.connectionTransacional != null) ? this.connectionTransacional : getConnection();
                prepared = connection.prepareStatement(sqlColumns + sqlValues);
                DaoJDBUtils.setEntity(prepared, entity, this.getinformationDB());// seteo los datos al stament
                prepared.executeUpdate();
            }finally {
//                resultSet.close();
                prepared.close();
                if (this.connectionTransacional == null) {
                    connection.close();
                } 
            }
        } 
    }

    // metoho para describir las columnas de cada tabla
    private Map<Integer, String> getinformationDB() throws GenericExeption {
        Map<Integer, String> meta = new HashMap<>();
        try (PreparedStatement prepared = getConnection().prepareStatement("DESCRIBE " + this.tabla); ResultSet resultSet = prepared.executeQuery();) {
            int numberColumn = 1;
            while (resultSet.next()) {
                meta.put(numberColumn++, resultSet.getString(1));
            }
        } catch (SQLException | GenericExeption e) {
            throw new GenericExeption("Error!! describe para tabla " + this.tabla, e);
        }
        return meta;
    }
}
