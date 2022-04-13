package com.universidadjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*para que este pueda ser acidedido desde cualquier otra parte de la palicacion
como otro servlet o directamente desde los html o jps dependiendo de lo que se trabaje
necesitamos agregar la anotacion @webServlet y le pasamos como parametro el paht
que basicamente es es el / para expesificar la ruta y el nombre con el que queremos
identificar este servlet lo mas aconsejable es que maneje el mismo nombre que esta 
clase donde se define*/
@SuppressWarnings("serial")
@WebServlet("/PrimerServlet")

/*para la creacion de un servlet este debe extender de la clase 
HttpServlet*/
public class PrimerServlet extends HttpServlet{

    /*posteriormente para aplicar la logica de lo que queremos hacer
     *tenemos que sobreescribir el metodo doGet o doPost independientemente
     *de como se maneje la peticion desde el front-end si queremor que los datos
     *sean aenviados por la url con el metodo get o por formulario con post.
     *Estos metodos estan en la clase padre HttpServlet.
     *una ves el cliente haga la peticion el encargado de hacer la llamda a estos metodos
     *del servlet viene siendo el servido de aplicaciones , ya sea toncam, galssfish, etc
     *pero eso si en el html o de donde se quiera invocar al server devemos pasar
     *el path con el nombre que ledimo a dicho servlet en la anotacion @webServlet*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        /*nostros desde sel serve podes enviar atributos, recuperarlos si vienen desde
         * el cliente, poemos escribir en el documento html tanto coidogo html puto
         * osea etiqeutas como escribir mensajes, pero esto no es recomendado*/
        resp.setContentType("text/html/charset=UTF-8");/*el metodo setContentType nos sirve
        para especificar el typo de contenido que vamos a responder al cliente
        en este caso por parametro especificamos que sera texto html, y podemos
        especificar incluso el tipo de caracteres que vaos a tulizar utf-8*/
        
        try (PrintWriter out = resp.getWriter()) {
            out.println("hello, people, this is my first servlet with printWriter Obeject");
            /*podesmos aporyarnos de un objeto printWriter para escribir en el html, funcionaria
             * algo similar que cuando utilizamos prinWriter para escribir en un domcuneto 
             * el objeto resonse con ayuda del metoro getWriter me deculver un obejto
             * prinWriter wue uso para escribir*/
        }
        
    }
}
