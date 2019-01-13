
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
    </head>
    <body>
        <h1>Quick Drive!</h1>
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <a href="login.jsp">Login
            <c:out value="${sessionScope['loginUser']}"/>
        </a>
    </body>
</html>
