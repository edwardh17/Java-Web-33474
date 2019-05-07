
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <%
        String u = (String)session.getAttribute ("username");

        if (u == null) {

            response.sendRedirect ("index.jsp");
        }
    %>

    <h3>Welcome <%=u%></h3>
</body>
</html>