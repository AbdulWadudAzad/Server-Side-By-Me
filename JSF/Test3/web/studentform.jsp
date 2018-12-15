
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <f:view>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <h:form>
                <h2>Student form</h2>
                <table>
                    <tr><td colspan="4">Name</td></tr>                     
                    <tr><td colspan="2">
                            <h:inputText value="#{studentcontrol.student.name}" size="35"/>
                        </td></tr>
                </table>
                        <p>
                            <h:commandButton action="submit" value="Regi"/>
                        </p>      
                     
            </h:form>  
        </body>
    </f:view>
</html>
