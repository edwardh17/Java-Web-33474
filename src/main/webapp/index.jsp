<%-- 
    Document   : index
    Created on : 02/05/2019, 21:13:18
    Author     : EducaciónIT
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    int sum(int a, int b) {
    
        return a + b;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%for (int i=1; i<7; i++) {%>
        <h<%=i%>>Hello World!</h<%=i%>>
        <%}%>
        
        <%
            int num = sum (3, 3);
            out.println(num);
        %>
        
        <b><%=num%></b>
        
    </body>
</html>