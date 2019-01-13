

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Index !</h1>
        <c:if test="${empty sessionScope['loginUser'] }">
            <c:redirect url="login.jsp"/>
        </c:if>
        <a href="login.jsp">Logout
            <c:out value="${sessionScope['loginUser']}"/>
                </a>
    </body>
</html>
