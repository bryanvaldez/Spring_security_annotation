<%-- 
    Document   : welcome
    Created on : 06-abr-2017, 11:28:35
    Author     : bvaldez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome page</title>
    </head>
    <body>
	Dear <strong>${user}</strong>, Welcome to Home Page.
	<a href="<c:url value="/logout" />">Logout</a>
    </body>
</html>
