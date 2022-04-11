package com.universidadjava.dao.utils;

import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.universidadjava.domain.IEntity;
import com.universidadjava.exceptions.GenericExeption;

public class DaoJDBUtils {

    
    //metodo para obtner una entity de un resultSet de forma generica
    @SuppressWarnings("deprecation")
    public static List<IEntity> getEntity(Class<? extends IEntity> entity, ResultSet resultSet) throws GenericExeption {
        List<IEntity> list = new ArrayList<>();
        try {
            while (resultSet.next()) {
                IEntity entidad = entity.newInstance();
                ResultSetMetaData resultMeta = resultSet.getMetaData();
                Field[] fields = entity.getDeclaredFields();
                for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
                    // recupero el nombre de la columna de la db que venga en el resul y elimno el "_"
                    String columna = resultMeta.getColumnName(i);
                    if(columna.contains("_")) {
                        columna = columna.replace("_", "");
                    }
                    for (Field field : fields) {
                        field.setAccessible(true);
                        if (field.getName().equalsIgnoreCase(columna)) {
                            switch (field.getType().getSimpleName()) {
                            case "Integer":
                                field.set(entidad, resultSet.getInt(resultMeta.getColumnName(i)));
                                break;
                            case "Long":
                                field.set(entidad, resultSet.getLong(resultMeta.getColumnName(i)));
                                break;
                            case "Byte":
                                field.set(entidad, resultSet.getByte(resultMeta.getColumnName(i)));
                                break;
                            case "Short":
                                field.set(entidad, resultSet.getShort(resultMeta.getColumnName(i)));
                                break;
                            case "Double":
                                field.set(entidad, resultSet.getDouble(resultMeta.getColumnName(i)));
                                break;
                            case "Float":
                                field.set(entidad, resultSet.getFloat(resultMeta.getColumnName(i)));
                                break;
                            case "String":
                                field.set(entidad, resultSet.getString(resultMeta.getColumnName(i)));
                                break;
                            default:
                                break;
                            }
                        }
                    }
                }list.add(entidad);
            }
        } catch (SQLException | InstantiationException | IllegalAccessException | IllegalArgumentException e) {
            throw new GenericExeption("Error!! no se puedo obtener la entidad ", e);
        }return list;
    }
    
    //metodo para setear los datos de una entityt al preparedStamend de forma generica
    //para la ejecucion de un metoho sin parametros mediante api reflec seria asi  method.invoke(instance, new Object[0])
    public static void setEntity(PreparedStatement prepared, IEntity entity, Map<Integer, String> columnas) throws GenericExeption {
        for(int i = 2; i <= columnas.size(); i++) {
            String columna = (columnas.get(i).contains("_"))?columnas.get(i).replace("_", "").toLowerCase(): columnas.get(i).toLowerCase();
            Field[] fields = entity.getClass().getDeclaredFields();
            for(Field field: fields) {
                field.setAccessible(true);
                if(field.getName().toLowerCase().contains(columna)) {
                    try {
                        prepared.setObject((i - 1), field.get(entity));
                    } catch (IllegalArgumentException | IllegalAccessException | SQLException e) {
                        throw new GenericExeption("Error!! al setal datos al PreparedStatement", e);
                    }
                }
            }
        }
    }
}
