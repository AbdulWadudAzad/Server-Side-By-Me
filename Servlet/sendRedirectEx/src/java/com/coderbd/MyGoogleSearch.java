/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class MyGoogleSearch extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("name");
        response.sendRedirect("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjI6rTu-ZHfAhUfT48KHYWNA3sQPAgH"+name);
       
    }


   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
