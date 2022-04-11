package conexion_mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionJDBC {
    private static String url = "jdbc:mysql://localhost:3306/universidadjava";
    private static String user = "root";
    private static String password = "060900";
    private static String driver = "com.mysql.jdbc.Driver";
   
    public static void main(String[] args) {
        Connection connection = null;
        
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT *FROM persona WHERE id_persona = ?");
            preparedStatement.setInt(1, 4);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("nombre: " + resultSet.getString(2));
                System.out.println("apelldo: " + resultSet.getString(3));
                System.out.println("email: " + resultSet.getString(4));
                System.out.println("telefono: " + resultSet.getInt(5));
                System.out.println("direccion: " + resultSet.getString(6));
                
            }
            connection.close();
        } catch ( SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
