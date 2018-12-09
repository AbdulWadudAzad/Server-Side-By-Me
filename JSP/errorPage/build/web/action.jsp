<%-- 
    Document   : action
    Created on : Dec 9, 2018, 9:55:10 AM
    Author     : User
--%>
<%@page errorPage="error.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Action Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String num1 = request.getParameter("n1");
            String num2 = request.getParameter("n2");
            
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            int c = a / b;
            out.print("Answare of devide is :" + c);
        %>
    </body>
</html>
