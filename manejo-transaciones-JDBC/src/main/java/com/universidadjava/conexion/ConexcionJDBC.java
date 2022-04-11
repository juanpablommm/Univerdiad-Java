package com.universidadjava.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.universidadjava.domain.IEntity;
import com.universidadjava.exceptions.GenericExeption;

public class ConexcionJDBC{

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/universidadjava";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "060900";
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public static Connection getConnection() throws GenericExeption {
        Connection connection = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new GenericExeption("Error!! no se puede extablecer conexion con la db", e);
        }return connection;
    }
}
