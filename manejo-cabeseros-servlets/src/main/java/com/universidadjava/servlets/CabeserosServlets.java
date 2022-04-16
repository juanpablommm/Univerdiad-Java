package com.universidadjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/CabeserosServlets")
public class CabeserosServlets extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<h1>");
        String tipoMethod = req.getMethod();/*el metodo getMethod del reques
        nos devulve el tipo de metodo utilizado en el protocolo http*/
        printWriter.println(tipoMethod + "</h1>");
        
        String uri = req.getRequestURI();/*el metodo getRequestURI nos devulve
        la uri de la URL es decir la parte de la url sin el host*/
        printWriter.println("uri: " + uri + "<br><br>");
        
        
        /*ibtenemos los nombres de todos los cabeceros con el metodo 
         *getHeadersName()*/
        Enumeration<String> enumeration = req.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String header = enumeration.nextElement();
            printWriter.print("<br> <b>" + header + "</b>:" + req.getHeader(header));
            /*el metodo get Header() nos permitira obtner el valor del
             * nombre del cabecero que le pasemos por parametro*/
            
            
        }
        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
