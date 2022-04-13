package com.universidadjava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")

@WebServlet("/LoginServlet")//agreago mi anotacion webServlet pasandole le path
//bajo el cual se estabalcera la comunicacion entre el front y el back
public class LoginServlet extends HttpServlet {

    /*soobreescribo el metodo doPost dado que desde el html el protocolo htttp
     * se realizo metiante el metodo post*/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");/*recupero los datos de los input del cliente
        mediante el metodo getParameter y le paso como parametro el valor del atributo
        name en la etiqueta intpu del html*/ 
        String password = req.getParameter("password");
        
        PrintWriter printWriter = resp.getWriter();//recupero un objeto prinqriter para escribir en el html
        printWriter.println("Hi, welcome, your user is \"" + user + "\" and your password is \"" + password + "\"");
    }
}
