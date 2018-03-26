<%-- 
    Document   : logout
    Created on : 5 Mar, 2018, 2:28:23 PM
    Author     : Rithvik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
            session.invalidate();
            
            response.sendRedirect("homepage.html");
        
    %>
    </body>
</html>
