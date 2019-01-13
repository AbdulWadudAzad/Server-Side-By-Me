<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${empty username and empty password }">
            <c:redirect url="login.jsp">
                <c:param name="errMag" value="Please enter username and password"/>
            </c:redirect>
        </c:if>
        <c:if test="${not empty username and not empty password }">
            <s:setDataSource var="ds" driver="com.mysql.jdbc.Driver"
                             url="jdbc:mysql://localhost:3306/jstllogin"
                             user="root" password="1234"/>
            <s:query var="selectQ"  dataSource="${ds}">
                select count(*) as knock from users where username='${param.username}'
                and password='${param.password}
            </s:query>
            <c:forEach var="r" items="${selectQ.rows}">
                <c:choose>
                    <c:when test="${r.knock gt 0}">
                        <c:set scope="sessionScope"
                               var="loginUser"
                               value="${param.username}"/>
                        <c:redirect url="index.jsp"/>
                    </c:when>
                    <c:otherwise>
                        <c:redirect url="login.jsp">
                            <c:param name="errMsg" value="username/password doesn't match"/>
                        </c:redirect>
                        
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </c:if>
    </body>
</html>
