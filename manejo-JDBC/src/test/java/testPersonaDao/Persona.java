package testPersonaDao;

import java.util.List;

import com.universidadjava.dao.IPersonaDao;
import com.universidadjava.dao.IUsuarioDao;
import com.universidadjava.daoImpl.PersonaDaoImpl;
import com.universidadjava.daoImpl.UsuarioDaoImpl;
import com.universidadjava.domain.Usuario;
import com.universidadjava.exceptions.GenericExeption;


public class Persona {

    public static void main(String[] args) throws GenericExeption {
        IPersonaDao pDao = new PersonaDaoImpl();
        
        pDao.insert(new com.universidadjava.domain.Persona("POLLL", "El daness", "Haland@gmail.com", 3004310l, "Calle 13"));
        
//        List<com.universidadjava.domain.Persona>  list = pDao.selecFindAll();
//        list.forEach(System.out::println);
//        
//        System.out.println("selecionado por id");
//        System.out.println(pDao.selecFindId(3l));
//        
//        System.out.println("-----------usuarios--------------");
//        IUsuarioDao usuarioDao = new UsuarioDaoImpl();
//        List<Usuario>  listU = usuarioDao.selecFindAll();
//        listU.forEach(System.out::println);
//        
//        System.out.println("selecionado por id");
//        System.out.println(usuarioDao.selecFindId(2l));
        
//        usuarioDao.delete(2l);
        
        pDao.update(5l, new com.universidadjava.domain.Persona("Ronal", "Do Santos", "crc@gmail.com", 213871l, "vaneida siempre viva 26"));
        IUsuarioDao usuarioDao = new UsuarioDaoImpl();
        usuarioDao.update(3l, new Usuario("juacho rozi", "129091"));
//        System.out.println("------------------despues de eliminacion-----------------");
//        pDao.delete(3l);
//        pDao.selecFindAll().forEach(System.out::println);
//        
//        pDao.delete(2l);
//        
//        System.out.println("--------------------------------");
//        list = pDao.selecFindAll();
//        list.forEach(System.out::println);
//        
//        pDao.update(5l, new com.universidadjava.domain.Persona("*****", "****xsa", "333333", 21231l, "el poblado"));

    }
}
