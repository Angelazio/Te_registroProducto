
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // paso 1
        String producto = request.getParameter("producto");
        String existencia = request.getParameter("existencia");
        String precio = request.getParameter("precio");
        String categoria = request.getParameter("categoria");
        
        //paso 2
        
        Persona per = new Persona();
        // paso 3
        per.setProducto(producto);
        per.setExistencia(existencia);
        per.setPrecio(precio);
        per.setCategoria(categoria);
       // paso 4 
       request.setAttribute("perso", per);
       // paso 5
       request.getRequestDispatcher("salida.jsp").forward(request, response);
    }

   

}