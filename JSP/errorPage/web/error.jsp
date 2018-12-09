<%-- 
    Document   : error
    Created on : Dec 9, 2018, 9:55:26 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! in error page</h1>
        <%@page isErrorPage="true" %>
       Exception is: <%= exception %>
    </body>
</html>
