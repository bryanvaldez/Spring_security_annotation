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
    <body ng-app="app" ng-cloak="">
	Dear <strong>${user}</strong>, Welcome to Home Page.
	<a href="<c:url value="/logout" />">Logout</a>
        <div ng-controller="UserController as ctrl">
            <table>
                <thead>
                    <tr>
                        <th>apellidoPaterno</th>
                        <th>apellidoMaterno</th>
                        <th>nombre</th>
                        <th>perfil</th>
                        <th>estado</th>
                    </tr>
                </thead>
                <tbody>
                    <tr ng-repeat="u in ctrl.users">
                        <td><span ng-bind="u.APELLIDOPATERNO"></span></td>
                        <td><span ng-bind="u.APELLIDOMATERNO"></span></td>
                        <td><span ng-bind="u.NOMBRE"></span></td>
                        <td><span ng-bind="u.NOMBREPERFIL"></span></td>
                        <td><span ng-bind="u.ESTADO"></span></td>
                    </tr>
                </tbody>
            </table>
        </div>
        
      <script src="<c:url value='/static/js/lib/angular.min.js' />"</script>
      <script src="<c:url value='/static/js/lib/angular-route.min.js' />"</script>
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/service_user.js' />"></script>
      <script src="<c:url value='/static/js/controller/controller_user.js' />"></script>        
    </body>
</html>
