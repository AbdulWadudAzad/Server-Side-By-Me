
package com.coderbd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FrontController extends HttpServlet {

 public void inti() throws ServletException{
     HashMap products= new HashMap();
     
     Product p=new Product(1, "dog","9.99");
     products.put("1", p);
     
       p=new Product(2, "cat","4.99");
     products.put("2", p);
    
         p=new Product(3, "Fish","1.99");
     products.put("3", p);
     
     getServletContext().setAttribute("products",products);
     
 }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      doPost(req, res);
    }

 
}
