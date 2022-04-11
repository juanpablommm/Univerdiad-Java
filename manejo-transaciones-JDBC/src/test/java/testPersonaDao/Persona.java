package testPersonaDao;


import java.sql.Connection;
import java.sql.SQLException;

import com.google.protobuf.ServiceException;
import com.universidadjava.conexion.ConexcionJDBC;
import com.universidadjava.exceptions.GenericExeption;
import com.universidadjava.service.IPersonaService;
import com.universidadjava.serviceImpl.PersonaServiceImpl;


public class Persona {

    public static void main(String[] args) {

        
        /*Trancaciones en jdbc
         * 
         * el concepto transacional consta de ejecutar varias intruciones 
         * sql pero todas estas tienen que ser exitosas para que nosotros
         * hagamos commit y estan afecten a la db o si alguna falla podemos 
         * hacer un rrobalck y volver ya sea bien a un estado de la transacion
         * que guardemos o que definitivamente no se lleve a cabo ningun cambio*/
        Connection connection = null;
        try {
            connection = ConexcionJDBC.getConnection();
            if(connection.getAutoCommit()) {//miro si mi conecion esta en modo auto commit, de ser asi la desativo
                //pues necestiamos que no se haga el comid de manera automatica hasta
//                que hallamos completado todas las intrucciones sql de manera exitosa 
//                sin ningun error de haber un error haremos un rollback y si alguna
//                instrucion no se ha podido completar entonces no se modificara la db
//                asi hallan intruciones que se hallan cumplido
                connection.setAutoCommit(false);
            }
            IPersonaService service = new PersonaServiceImpl(connection);
            service.delete(11l);
            service.update(6l, new com.universidadjava.domain.Persona("juninho", "fernanbucano", "juninho@gmail.com", 21273l, "calle 23 wolfStreet"));
            service.insert(new com.universidadjava.domain.Persona("ronalllllllllllllllllllllllllllllllllllllllllllllllllllllldddddddddddddddddddddddddddlllllllssssssssssssssssssss", "lionel", "messi@gmail.com", 21273l, "calle 23 wolfStreet"));
            connection.commit();
        } catch (SQLException | GenericExeption e) {
            e.printStackTrace(System.out);
            System.out.println("entramos al roolback");
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace(System.out);
            }
        }
    }
}
