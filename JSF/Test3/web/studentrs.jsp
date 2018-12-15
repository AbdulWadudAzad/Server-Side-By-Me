<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <f:view>
    <head>
      
        <title>student result Page</title>
    </head>
    <body>
        <h:outputText value="#{studentControl.student.name}"/>
    </body>
    </f:view>
</html>
